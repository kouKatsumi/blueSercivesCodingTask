package com.blueservices.logic;

import com.blueservices.interfaces.DocumentState;
import com.blueservices.states.Accepted;
import com.blueservices.states.Created;
import com.blueservices.states.Deleted;
import com.blueservices.states.Published;
import com.blueservices.states.Rejected;
import com.blueservices.states.Verified;

public class StatesHolder {
	
	public final static DocumentState CREATED_STATE = new Created();
	public final static DocumentState ACCEPTED_STATE = new Accepted();
	public final static DocumentState REJECTED_STATE = new Rejected();
	public final static DocumentState VERIFIED_STATE = new Verified();
	public final static DocumentState DELETED_STATE = new Deleted();
	public final static DocumentState PUBLISHED_STATE = new Published();

}
