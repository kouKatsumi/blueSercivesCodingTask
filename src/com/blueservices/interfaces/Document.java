package com.blueservices.interfaces;

import java.util.List;


public interface Document {

	public String getContent();
	public String getName();
	public DocumentState getState();
	public void setState(DocumentState newState);
	public void setContent(String content);
	public List<StateHistoryEntry> getHistory();
	public Long getId();
	public String getReason();
	public void setReason(String reason);
	
}