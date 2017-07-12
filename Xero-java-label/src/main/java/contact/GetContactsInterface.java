package contact;

import java.util.List;

public interface GetContactsInterface {
	
	public List<LocalContact> getContactByName(String name);
	
	public List<LocalContact> getContactByFirstName(String firstName);
	
	public List<LocalContact> getContactByLastName(String lastName);
	
	public List<LocalContact> getContactByFullName(String firstName,String lastName);
	
	public List<LocalContact> getAllContacts();

}
