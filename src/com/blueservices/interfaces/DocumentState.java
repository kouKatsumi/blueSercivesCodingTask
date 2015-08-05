package com.blueservices.interfaces;

public abstract class DocumentState {
	public abstract void accept(Document document);
	public abstract void reject(Document document);
	 
	protected void setNewState(Document document, DocumentState newState) {
		synchronized (document) {		
			checkState(document);
			document.setState(newState);			
		}
	}
	 
	protected void setNewContent(Document document, String newContent) {
		synchronized (document) {		
			checkState(document);
			document.setContent(newContent);
		}
	}
	
	private void checkState(Document document) {
		if(!this.equals(document.getState())){
			throw new RuntimeException();
		}
	}
	
	@Override
	public final String toString(){
		return this.getClass().getSimpleName();
	}
}
