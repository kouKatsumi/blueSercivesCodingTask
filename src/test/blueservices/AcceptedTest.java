package test.blueservices;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.blueservices.interfaces.Document;
import com.blueservices.logic.PhysicalDocument;
import com.blueservices.logic.StatesHolder;

public class AcceptedTest {
	
	private Document newDocument;
	
	@Before
	public void init(){
		newDocument = new PhysicalDocument(1l,"a","b");
	}

	@Test
	public void accept_whenDocumentInAcceptedState_transitionsToPublishedState() {
		newDocument.setState(StatesHolder.ACCEPTED_STATE);
		StatesHolder.ACCEPTED_STATE.accept(newDocument);
		assertEquals(StatesHolder.PUBLISHED_STATE, newDocument.getState());
	}

	@Test(expected=RuntimeException.class)	
	public void accept_whenDocumentInOtherState_throwsException() {
		StatesHolder.ACCEPTED_STATE.accept(newDocument);
	}

	@Test
	public void reject_whenDocumentInAcceptedState_transitionsToRejectedState() {
		newDocument.setState(StatesHolder.ACCEPTED_STATE);
		StatesHolder.ACCEPTED_STATE.reject(newDocument);
		assertEquals(StatesHolder.REJECTED_STATE, newDocument.getState());
	}

	@Test(expected=RuntimeException.class)	
	public void reject_whenDocumentInOtherState_throwsException() {
		StatesHolder.ACCEPTED_STATE.reject(newDocument);
	}

}
