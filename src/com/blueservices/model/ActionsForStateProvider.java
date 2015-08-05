package com.blueservices.model;

import java.util.HashMap;
import java.util.Map;

import com.blueservices.interfaces.DocumentState;
import com.blueservices.logic.StatesHolder;

public class ActionsForStateProvider {
	private static final Map<DocumentState, ActionsForState> actionsMapper = new HashMap<DocumentState, ActionsForState>(){{
		put(StatesHolder.CREATED_STATE, new ActionsForState("verify","delete","edit"));
		put(StatesHolder.VERIFIED_STATE, new ActionsForState("accept","reject","edit"));
		put(StatesHolder.ACCEPTED_STATE, new ActionsForState("publish","reject",null));
		put(StatesHolder.PUBLISHED_STATE, new ActionsForState(null,null,null));
		put(StatesHolder.REJECTED_STATE, new ActionsForState(null,null,null));
		put(StatesHolder.DELETED_STATE, new ActionsForState(null,null,null));
	}};
	
	public static ActionsForState getActions(DocumentState state) {
		return actionsMapper.get(state);
	}

}
