package com.blueservices.states;

import com.blueservices.interfaces.Document;
import com.blueservices.interfaces.DocumentState;
import com.blueservices.interfaces.Editable;
import com.blueservices.logic.StatesHolder;

public class Created extends DocumentState implements Editable {

	@Override
	public void accept(Document document) {
		setNewState(document, StatesHolder.VERIFIED_STATE);
	}

	@Override
	public void reject(Document document) {
		setNewState(document, StatesHolder.DELETED_STATE);
	}

	@Override
	public void edit(Document document, String newContent) {
		setNewContent(document, newContent);
	}
	
}
