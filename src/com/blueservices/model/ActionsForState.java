package com.blueservices.model;

public class ActionsForState {
	private final String accept;
	private final String reject;
	private final String edit;

	
	public ActionsForState(String accept, String reject, String edit) {
		this.accept = accept;
		this.reject = reject;
		this.edit = edit;
	}

	public String getAccept() {
		return accept;
	}


	public String getReject() {
		return reject;
	}


	public String getEdit() {
		return edit;
	}

}
