package com.blueservices.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.blueservices.interfaces.Document;
import com.blueservices.logic.DocumentMessage;
import com.blueservices.logic.PhysicalDocument;
import com.blueservices.model.ActionsForStateProvider;
import com.blueservices.model.EditedDocumentModel;
import com.blueservices.model.NewDocumentModel;
import com.blueservices.model.RejectedDocumentModel;
import com.blueservices.utils.DocumentToProtoUtil;

@Controller
public class DocumentController {

	private final AtomicLong counter = new AtomicLong();

	Map<Long, Document> documents = new HashMap<>();
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView documentsList() {
		return new ModelAndView("list", "documentEntry",
				documents.values());
	}

	@RequestMapping(value = "/document", method = RequestMethod.GET)
	public ModelAndView document() {
		return new ModelAndView("create_document", "command",
				new NewDocumentModel());
	}

	@RequestMapping(value = "/addDocument", method = RequestMethod.POST)
	public String createDocument(
			@ModelAttribute("command") NewDocumentModel command, ModelMap model) {

		PhysicalDocument physicalDocument = new PhysicalDocument(
				counter.incrementAndGet(), command.getName(),
				command.getContent());
		documents.put(physicalDocument.getId(), physicalDocument);
		return "forward:/document/" + physicalDocument.getId();
	}

	@RequestMapping("/document/{id}")
	public ModelAndView documentDetails(@PathVariable Long id) {
		Document foundDocument = documents.get(id);
		Map<String, Object> modelMap = new HashMap<>();
		synchronized (foundDocument) {

			DocumentMessage.Document documentToDocumentMessage = DocumentToProtoUtil
					.documentToDocumentMessage(foundDocument);
			modelMap.put("actions", ActionsForStateProvider
					.getActions(foundDocument.getState()));
			modelMap.put("documentDetails", documentToDocumentMessage);

		}
		return new ModelAndView("details", modelMap);
	}

	@RequestMapping("/document/{id}/accept")
	public String acceptToNextState(@PathVariable Long id) {
		Document foundDocument = documents.get(id);
		synchronized (foundDocument) {
			foundDocument.getState().accept(foundDocument);
		}
		return "forward:/document/" + id;
	}

	@RequestMapping("/document/{id}/reject")
	public ModelAndView rejectToNextState(@PathVariable Long id) {
		return new ModelAndView("reject_document", "command",
				new RejectedDocumentModel(id));
	}
	
	@RequestMapping(value = "/document/rejected", method = RequestMethod.POST)
	public String rejectDocument(@ModelAttribute("command") RejectedDocumentModel command) {
		Document foundDocument = documents.get(command.getId());
		synchronized (foundDocument) {
			foundDocument.getState().reject(foundDocument);
			foundDocument.setReason(command.getReason());
		}
		return "forward:/document/" + command.getId();
	}

	@RequestMapping("/document/{id}/edit")
	public ModelAndView editDocument(@PathVariable Long id) {
		Document foundDocument = documents.get(id);
		DocumentMessage.Document protoDocument = DocumentToProtoUtil.documentToDocumentMessage(foundDocument);
		return new ModelAndView("edit_document", "command",
				new EditedDocumentModel(protoDocument));
	}
	
	@RequestMapping(value = "/document/edited", method = RequestMethod.POST)
	public String editedDocument(@ModelAttribute("command") EditedDocumentModel command) {
		Document foundDocument = documents.get(command.getId());
		synchronized (foundDocument) {
			foundDocument.setContent(command.getContent());
		}
		return "forward:/document/" + command.getId();
	}

	@RequestMapping(value = "/history/{id}", method = RequestMethod.GET)
	public ModelAndView history(@PathVariable Long id) {
		Document foundDocument = documents.get(id);
		return new ModelAndView("history", "historyEntry",
				foundDocument.getHistory());
	}

}
