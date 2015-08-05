package com.blueservices.states;

import com.blueservices.interfaces.Document;
import com.blueservices.interfaces.DocumentState;

public class Deleted extends DocumentState{

	@Override
	public void accept(Document document) {
	}

	@Override
	public void reject(Document document) {
	}

}
