package com.blueservices.states;

import com.blueservices.interfaces.Document;
import com.blueservices.interfaces.DocumentState;
import com.blueservices.logic.StatesHolder;

public class Accepted extends DocumentState {

	@Override
	public void accept(Document document) {
		setNewState(document, StatesHolder.PUBLISHED_STATE);
	}

	@Override
	public void reject(Document document) {
		setNewState(document, StatesHolder.REJECTED_STATE);
	}

}
