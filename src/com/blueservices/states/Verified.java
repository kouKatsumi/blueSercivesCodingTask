package com.blueservices.states;


import com.blueservices.interfaces.Document;
import com.blueservices.interfaces.DocumentState;
import com.blueservices.interfaces.Editable;
import com.blueservices.logic.StatesHolder;


public class Verified extends DocumentState implements Editable {

	@Override
	public void accept(Document document) {
		setNewState(document, StatesHolder.ACCEPTED_STATE);
	}

	@Override
	public void reject(Document document) {
//		NotAcceptedPhisicalDocument newDocument = new NotAcceptedPhisicalDocument(name, content, reason)
		setNewState(document, StatesHolder.REJECTED_STATE);
	}	

	@Override
	public void edit(Document document, String newContent) {
		setNewContent(document, newContent);
	}

}
