package test.blueservices;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.blueservices.interfaces.Document;
import com.blueservices.interfaces.DocumentState;
import com.blueservices.logic.PhysicalDocument;
import com.blueservices.logic.StatesHolder;

public class PhysicalDocumentTest {
	private static final String DOCUMENT_NAME = "name";
	private static final String DOCUMENT_CONTENT = "content";
	private static final String EDITED_DOCUMENT_CONTENT = "edited content";
	private static final String REJECTED_REASON = "some reason";
	
	private Document newDocument;
	
	@Before
	public void init(){
		newDocument = new PhysicalDocument(1l, DOCUMENT_NAME,DOCUMENT_CONTENT);
	}
	
	@Test
	public void testCreateNewDocumentInStateCreated(){
		assertEquals(StatesHolder.CREATED_STATE,newDocument.getState());
		assertEquals(DOCUMENT_NAME, newDocument.getName());
		assertEquals(DOCUMENT_CONTENT, newDocument.getContent());
		assertEquals(1, newDocument.getHistory().size());
		assertTrue(isStateInHistory(StatesHolder.CREATED_STATE));
	}
	

	@Test
	public void testCreateNewDocumentAndEditIt(){
		newDocument.setContent(EDITED_DOCUMENT_CONTENT);
		assertEquals(StatesHolder.CREATED_STATE,newDocument.getState());
		assertEquals(DOCUMENT_NAME, newDocument.getName());
		assertEquals(EDITED_DOCUMENT_CONTENT, newDocument.getContent());
	}

	@Test
	public void testCreateNewDocumentAndChangeState(){
		newDocument.setState(StatesHolder.PUBLISHED_STATE);
		assertEquals(StatesHolder.PUBLISHED_STATE, newDocument.getState());
	}
	
	@Test
	public void testCreateNewDocumentChangeStateAndCheckHistory(){
		newDocument.setState(StatesHolder.VERIFIED_STATE);
		assertEquals(2, newDocument.getHistory().size());	
		assertTrue(isStateInHistory(StatesHolder.CREATED_STATE));
		assertTrue(isStateInHistory(StatesHolder.VERIFIED_STATE));
	}
	
	private boolean isStateInHistory(DocumentState state){
		return newDocument.getHistory().stream().anyMatch(e -> e.getState().equals(state));
	}
}
