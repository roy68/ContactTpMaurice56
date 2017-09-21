import org.junit.Test;

public class TestContact {
		
	@Test(expected = ContactException.class)
	public void testNom2Char() throws ContactException{
		ContactService test=new ContactService();
		test.creeContact("12","0255889977");
	}
	@Test(expected = ContactException.class)
	public void testNomVide() throws ContactException{
		ContactService test=new ContactService();
		test.creeContact("","0255889977");
	}
	@Test(expected = ContactException.class)
	public void testNom41Char() throws ContactException{
		ContactService test=new ContactService();
		test.creeContact("78459684751864587895263548956235689478541","0255889977");
	}
	@Test(expected = ContactException.class)
	public void testNull() throws ContactException{
		ContactService test=new ContactService();
		test.creeContact(null,"0255889977");
	}
	@Test
	public void testNom3Char() throws ContactException{
		ContactService test=new ContactService();
		test.creeContact("333","0255889977");
	}
	@Test
	public void testNom40Char() throws ContactException{
		ContactService test=new ContactService();
		test.creeContact("1548965874569854878774857154891596325896","0255889977");
	}
}
