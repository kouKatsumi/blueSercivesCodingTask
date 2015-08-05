package com.blueservices.model;

import com.blueservices.logic.DocumentMessage;

public class EditedDocumentModel {
	private String name;
	private String content;
	private Long id;

	public EditedDocumentModel(DocumentMessage.Document protoDocument) {
		this.name = protoDocument.getName();
		this.content = protoDocument.getContent();
		this.id = protoDocument.getId();
	}

	public EditedDocumentModel() {
	}

	public String getName() {
		return name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String newContent) {
		this.content = newContent;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long newId) {
		this.id = newId;
	}

}
