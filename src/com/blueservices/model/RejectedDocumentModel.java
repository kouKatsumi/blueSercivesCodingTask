package com.blueservices.model;

public class RejectedDocumentModel {

	private Long id;
	private String reason;

	public RejectedDocumentModel(Long theId) {
		id = theId;
	}

	public RejectedDocumentModel() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
