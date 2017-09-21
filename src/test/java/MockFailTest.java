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
	
	@Test
	public void testCreeContactErr() throws ContactException{
		
		String nom = "ContactOK";
		EasyMock.expect(dao.isContactExist(nom)).andReturn(true);
		
		Capture<Contact> capture = EasyMock.newCapture();
		replayAll();
		service.creeContact(nom,"0255887744");
		verifyAll();
		
		Contact contact = capture.getValue();
		Assert.assertEquals(nom,contact.getNom());
	}
	
}
