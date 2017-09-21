import java.util.ArrayList;
import java.util.List;

public class ContactDAO implements IContactDAO{
	private List<Contact> listeContacts = new ArrayList<>();

	
	public void creeContact(Contact contact) {
		listeContacts.add(contact);
	
	}
	
	public Contact recupererContact(String nom) {
		Contact retour = null;
		for(int i=0; i<listeContacts.size();i++) {
			
			if(this.listeContacts.get(i).getNom().equals(nom)) {
				retour = this.listeContacts.get(i);
			}
		}
		return retour;
	}
	
	public boolean isContactExist(String nom) {
		boolean compteur= false;
		for(int i=0; i<listeContacts.size();i++) {
			
			if(this.listeContacts.get(i).getNom().equals(nom)) {
				compteur=true;
			}
		}
		return compteur;
	}
	public void suprimerContact(String nom) {
		for(int i=0; i<listeContacts.size();i++) {
					
			if(this.listeContacts.get(i).getNom().equals(nom)) {
				this.listeContacts.remove(i);
			}
			
		}
	}
}
