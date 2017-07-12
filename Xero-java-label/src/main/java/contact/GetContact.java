package contact;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.xero.api.XeroClient;
import com.xero.model.Address;
import com.xero.model.Contact;
import com.xero.model.Phone;

public class GetContact implements GetContactsInterface{

	public List<LocalContact> getContactByName(String name) {
		XeroClient client = new XeroClient();
		List<LocalContact> localContactList=new ArrayList<LocalContact>();
		try {
			List<Contact> contactList=client.getContacts(null, "Name==\"" +name +"\"" , null);
			for (Contact contact : contactList) {
				LocalContact localContact = new LocalContact();
				List<LocalAddress> localAddressList = new ArrayList<LocalAddress>();
				List<Address> addressLit = contact.getAddresses().getAddress();
				for (Address address : addressLit) {
					LocalAddress localAddress = new LocalAddress();
					localAddress.setLocalAddressLine1(address.getAddressLine1());
					localAddress.setLocalAddressType(address.getAddressType());
					localAddress.setLocalCity(address.getCity());
					localAddress.setLocalCountry(address.getCountry());
					localAddress.setLocalPostalCode(address.getPostalCode());
					localAddress.setLocalRegion(address.getRegion());
					localAddressList.add(localAddress);
				}
				localContact.setAddresses(localAddressList);
				localContact.setEmail(contact.getEmailAddress());
				localContact.setFirstname(contact.getFirstName());
				localContact.setLastname(contact.getLastName());
				localContact.setId(contact.getContactID());
				List<LocalPhone> localPhoneList = new ArrayList<LocalPhone>();
				List<Phone> phoneList = contact.getPhones().getPhone();
				for (Phone phone : phoneList) {
					LocalPhone localPhone = new LocalPhone();
					localPhone.setLocalAreaCode(phone.getPhoneAreaCode());
					localPhone.setLocalCountryCode(phone.getPhoneCountryCode());
					localPhone.setLocalPhoneNumber(phone.getPhoneNumber());
					localPhoneList.add(localPhone);
				}
				localContact.setPhones(localPhoneList);
				localContactList.add(localContact);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return localContactList;
	}

	public List<LocalContact> getContactByFirstName(String firstName) {
		XeroClient client = new XeroClient();
		List<LocalContact> localContactList=new ArrayList<LocalContact>();
		try {
			List<Contact> contactList=client.getContacts(null, "Firstname==\"" +firstName +"\"" , null);
			for (Contact contact : contactList) {
				LocalContact localContact = new LocalContact();
				List<LocalAddress> localAddressList = new ArrayList<LocalAddress>();
				List<Address> addressLit = contact.getAddresses().getAddress();
				for (Address address : addressLit) {
					LocalAddress localAddress = new LocalAddress();
					localAddress.setLocalAddressLine1(address.getAddressLine1());
					localAddress.setLocalAddressType(address.getAddressType());
					localAddress.setLocalCity(address.getCity());
					localAddress.setLocalCountry(address.getCountry());
					localAddress.setLocalPostalCode(address.getPostalCode());
					localAddress.setLocalRegion(address.getRegion());
					localAddressList.add(localAddress);
				}
				localContact.setAddresses(localAddressList);
				localContact.setEmail(contact.getEmailAddress());
				localContact.setFirstname(contact.getFirstName());
				localContact.setLastname(contact.getLastName());
				localContact.setId(contact.getContactID());
				List<LocalPhone> localPhoneList = new ArrayList<LocalPhone>();
				List<Phone> phoneList = contact.getPhones().getPhone();
				for (Phone phone : phoneList) {
					LocalPhone localPhone = new LocalPhone();
					localPhone.setLocalAreaCode(phone.getPhoneAreaCode());
					localPhone.setLocalCountryCode(phone.getPhoneCountryCode());
					localPhone.setLocalPhoneNumber(phone.getPhoneNumber());
					localPhoneList.add(localPhone);
				}
				localContact.setPhones(localPhoneList);
				localContactList.add(localContact);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return localContactList;
	}

	public List<LocalContact> getContactByLastName(String lastName) {
		XeroClient client = new XeroClient();
		List<LocalContact> localContactList=new ArrayList<LocalContact>();
		try {
			List<Contact> contactList=client.getContacts(null, "Lastname==\"" +lastName +"\"" , null);
			for (Contact contact : contactList) {
				LocalContact localContact = new LocalContact();
				List<LocalAddress> localAddressList = new ArrayList<LocalAddress>();
				List<Address> addressLit = contact.getAddresses().getAddress();
				for (Address address : addressLit) {
					LocalAddress localAddress = new LocalAddress();
					localAddress.setLocalAddressLine1(address.getAddressLine1());
					localAddress.setLocalAddressType(address.getAddressType());
					localAddress.setLocalCity(address.getCity());
					localAddress.setLocalCountry(address.getCountry());
					localAddress.setLocalPostalCode(address.getPostalCode());
					localAddress.setLocalRegion(address.getRegion());
					localAddressList.add(localAddress);
				}
				localContact.setAddresses(localAddressList);
				localContact.setEmail(contact.getEmailAddress());
				localContact.setFirstname(contact.getFirstName());
				localContact.setLastname(contact.getLastName());
				localContact.setId(contact.getContactID());
				List<LocalPhone> localPhoneList = new ArrayList<LocalPhone>();
				List<Phone> phoneList = contact.getPhones().getPhone();
				for (Phone phone : phoneList) {
					LocalPhone localPhone = new LocalPhone();
					localPhone.setLocalAreaCode(phone.getPhoneAreaCode());
					localPhone.setLocalCountryCode(phone.getPhoneCountryCode());
					localPhone.setLocalPhoneNumber(phone.getPhoneNumber());
					localPhoneList.add(localPhone);
				}
				localContact.setPhones(localPhoneList);
				localContactList.add(localContact);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return localContactList;
	}

	public List<LocalContact> getContactByFullName(String firstName, String lastName) {
		XeroClient client = new XeroClient();
		List<LocalContact> localContactList=new ArrayList<LocalContact>();
		try {
			List<Contact> contactList=client.getContacts(null, "Firstname==\"" + firstName + "\"" + "and Lastname==\"" + lastName + "\""  , null);
			for (Contact contact : contactList) {
				LocalContact localContact = new LocalContact();
				List<LocalAddress> localAddressList = new ArrayList<LocalAddress>();
				List<Address> addressLit = contact.getAddresses().getAddress();
				for (Address address : addressLit) {
					LocalAddress localAddress = new LocalAddress();
					localAddress.setLocalAddressLine1(address.getAddressLine1());
					localAddress.setLocalAddressType(address.getAddressType());
					localAddress.setLocalCity(address.getCity());
					localAddress.setLocalCountry(address.getCountry());
					localAddress.setLocalPostalCode(address.getPostalCode());
					localAddress.setLocalRegion(address.getRegion());
					localAddressList.add(localAddress);
				}
				localContact.setAddresses(localAddressList);
				localContact.setEmail(contact.getEmailAddress());
				localContact.setFirstname(contact.getFirstName());
				localContact.setLastname(contact.getLastName());
				localContact.setId(contact.getContactID());
				List<LocalPhone> localPhoneList = new ArrayList<LocalPhone>();
				List<Phone> phoneList = contact.getPhones().getPhone();
				for (Phone phone : phoneList) {
					LocalPhone localPhone = new LocalPhone();
					localPhone.setLocalAreaCode(phone.getPhoneAreaCode());
					localPhone.setLocalCountryCode(phone.getPhoneCountryCode());
					localPhone.setLocalPhoneNumber(phone.getPhoneNumber());
					localPhoneList.add(localPhone);
				}
				localContact.setPhones(localPhoneList);
				localContactList.add(localContact);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return localContactList;
	}

	public List<LocalContact> getAllContacts() {
		XeroClient client = new XeroClient();
		List<LocalContact> localContactList=new ArrayList<LocalContact>();
		try {
			List<Contact> contactList=client.getContacts();
			for (Contact contact : contactList) {
				LocalContact localContact = new LocalContact();
				List<LocalAddress> localAddressList = new ArrayList<LocalAddress>();
				List<Address> addressLit = contact.getAddresses().getAddress();
				for (Address address : addressLit) {
					LocalAddress localAddress = new LocalAddress();
					localAddress.setLocalAddressLine1(address.getAddressLine1());
					localAddress.setLocalAddressType(address.getAddressType());
					localAddress.setLocalCity(address.getCity());
					localAddress.setLocalCountry(address.getCountry());
					localAddress.setLocalPostalCode(address.getPostalCode());
					localAddress.setLocalRegion(address.getRegion());
					localAddressList.add(localAddress);
				}
				localContact.setAddresses(localAddressList);
				localContact.setEmail(contact.getEmailAddress());
				localContact.setFirstname(contact.getFirstName());
				localContact.setLastname(contact.getLastName());
				localContact.setId(contact.getContactID());
				List<LocalPhone> localPhoneList = new ArrayList<LocalPhone>();
				List<Phone> phoneList = contact.getPhones().getPhone();
				for (Phone phone : phoneList) {
					LocalPhone localPhone = new LocalPhone();
					localPhone.setLocalAreaCode(phone.getPhoneAreaCode());
					localPhone.setLocalCountryCode(phone.getPhoneCountryCode());
					localPhone.setLocalPhoneNumber(phone.getPhoneNumber());
					localPhoneList.add(localPhone);
				}
				localContact.setPhones(localPhoneList);
				localContactList.add(localContact);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return localContactList;
	}

	

}
