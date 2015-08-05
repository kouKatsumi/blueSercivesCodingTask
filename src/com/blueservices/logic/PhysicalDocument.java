package com.blueservices.logic;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.blueservices.interfaces.Document;
import com.blueservices.interfaces.DocumentState;
import com.blueservices.interfaces.StateHistoryEntry;

public class PhysicalDocument implements Document {

    private final Long id;
	private final String name;
	private String content;
	private DocumentState state;
	private String reason; 
	private final List<StateHistoryEntry> history;
	
	public PhysicalDocument(Long id, String name, String content) {
		super();
		this.id = id;
		this.name = name;
		this.content = content;
		this.history = new LinkedList<>();
		setDocumentState(StatesHolder.CREATED_STATE);
	}

	@Override
	public String getContent() {
		return new String(content);
	}
	
	@Override
	public void setContent(String content) {
		this.content = new String(content);
	}

	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public void setState(DocumentState newState){
		setDocumentState(newState);
	}
	
	private void setDocumentState(DocumentState newState){
		history.add(new StateHistoryEntry(newState));
		this.state = newState;
	}

	@Override
	public DocumentState getState() {
		return this.state;
	}

	@Override
	public List<StateHistoryEntry> getHistory() {
		return Collections.unmodifiableList(history);
	}

	@Override
	public Long getId() {
		return this.id;
	}

	@Override
	public String getReason() {
		return reason;
	}

	@Override
	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString(){
		return name + " in state: " + state;
	}
}
