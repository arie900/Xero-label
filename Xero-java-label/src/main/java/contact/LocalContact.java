package contact;

import java.util.List;


public class LocalContact {
	
	private String id;
	private String firstname;
	private String lastname;
	private String email;
	private List<LocalAddress> addresses;
	private List<LocalPhone> phones;
	
	public LocalContact(){
		
	}

	public LocalContact(String id, String firstname, String lastname, String email, List<LocalAddress> addresses,
			List<LocalPhone> phones) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.addresses = addresses;
		this.phones = phones;
	}

	public String getId() {
		return id;
	}

	public void setId(String string) {
		this.id = string;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<LocalAddress> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<LocalAddress> addresses) {
		this.addresses = addresses;
	}

	public List<LocalPhone> getPhones() {
		return phones;
	}

	public void setPhones(List<LocalPhone> phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "LocalContact [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", addresses=" + addresses + ", phones=" + phones + "]";
	}
	
	

}
