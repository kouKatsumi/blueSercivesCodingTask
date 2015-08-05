package com.blueservices.interfaces;

import org.joda.time.DateTime;

public class StateHistoryEntry {
	
	private final DateTime changeTime;
	private final DocumentState documentState;
	
	public StateHistoryEntry(DocumentState state)
	{
		this.changeTime = new DateTime();
		this.documentState = state;
	}
	
	public DocumentState getState(){
		return this.documentState;
	}
	
	public DateTime getTime(){
		return this.changeTime;
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		return "State: " + documentState + " time: " + changeTime;
	}
	
	
	
}
