public class ContactService{
	
	private IContactDAO dao = new ContactDAO();
	
	public void creeContact(String nom,String tel) throws ContactException{
		if(nom!=null && nom.length()>=3 && nom.length()<=40){
			Contact personne = new Contact(nom, tel);
			if(!dao.isContactExist(nom)) {
				dao.creeContact(personne);
			}
			else {
				throw new ContactException("est deja present dans la base");
			}
		}
		else {
			throw new ContactException("Votre nom n'est pas valide");
		}
	}
}