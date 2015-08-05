package com.blueservices.utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.tuple.Pair;

import com.blueservices.interfaces.Document;
import com.blueservices.interfaces.DocumentState;
import com.blueservices.logic.DocumentMessage;
import com.blueservices.logic.StatesHolder;

public class DocumentToProtoUtil {
	
	private final static List<Pair<DocumentState,DocumentMessage.Document.State>> stateTranslationMap = new ArrayList<>();
	
	static{
		stateTranslationMap.add(Pair.of(StatesHolder.CREATED_STATE,DocumentMessage.Document.State.CREATED));
		stateTranslationMap.add(Pair.of(StatesHolder.ACCEPTED_STATE,DocumentMessage.Document.State.ACCEPTED));
		stateTranslationMap.add(Pair.of(StatesHolder.DELETED_STATE,DocumentMessage.Document.State.DELETED));
		stateTranslationMap.add(Pair.of(StatesHolder.PUBLISHED_STATE,DocumentMessage.Document.State.PUBLISHED));
		stateTranslationMap.add(Pair.of(StatesHolder.REJECTED_STATE,DocumentMessage.Document.State.REJECTED));
		stateTranslationMap.add(Pair.of(StatesHolder.VERIFIED_STATE,DocumentMessage.Document.State.VERIFIED));
	}
	
	public static DocumentMessage.Document documentToDocumentMessage(Document doc){
		DocumentMessage.Document.Builder documentBuilder = DocumentMessage.Document.newBuilder();
		synchronized (doc) {
			documentBuilder.setContent(doc.getContent());
			documentBuilder.setName(doc.getName());
			documentBuilder.setId(doc.getId());
			documentBuilder.setState(fromDocumentStateToProtobufState(doc.getState()));
			if(doc.getReason() != null)
				documentBuilder.setReason(doc.getReason());
		}	
		return documentBuilder.build();
	}
	
	private static DocumentMessage.Document.State fromDocumentStateToProtobufState(DocumentState state){
		for(Pair<DocumentState,DocumentMessage.Document.State> pair : stateTranslationMap){
			if(pair.getLeft().equals(state)){
				return pair.getRight();
			}
		}
		throw new IllegalStateException("Not known DocumentState: " + state.getClass());
	}
	

	private static DocumentState fromProtobufStateToDocument(DocumentMessage.Document.State state){
		for(Pair<DocumentState,DocumentMessage.Document.State> pair : stateTranslationMap){
			if(pair.getRight().equals(state)){
				return pair.getLeft();
			}
		}
		throw new IllegalStateException("Not known DocumentMessage.Document.State: " + state);
	}


}
