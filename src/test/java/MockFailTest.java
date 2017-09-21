import org.easymock.Capture;
import org.easymock.EasyMock;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Assert;
import org.junit.Test;



public class MockFailTest extends MockTest{
	
	@TestSubject
	private ContactService service = new ContactService();
	
	@Mock
	private IContactDAO dao;
	
	@Test(expected=ContactException.class)
	public void testCreeContactErr() throws ContactException{
		
		String nom = "ContactOK";
		EasyMock.expect(dao.isContactExist(nom)).andReturn(true);
		
		replayAll();
		service.creeContact(nom,"0255887744");
		verifyAll();
		

	}
	
}
