package contact;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.xero.api.XeroClient;
import com.xero.model.Address;
import com.xero.model.AddressType;
import com.xero.model.Contact;
import com.xero.model.Phone;


public class Test {
	public static void main(String[] args) {
//		LocalAddress address1=new LocalAddress(AddressType.POBOX, "Hagtit 31", "Maale Adumim", "Jerusalem","1234", "Israel");
//		List<LocalAddress> addressList = new ArrayList<LocalAddress>();
//		addressList.add(address1);
//		LocalAddress address2=new LocalAddress(AddressType.STREET, "Hagtit 31", "Maale Adumim", "Jerusalem","1234", "Israel");
//		addressList.add(address2);
//		LocalPhone phone1= new LocalPhone("0545984797", "0", "972");
//		List<LocalPhone> phoneList= new ArrayList<LocalPhone>();
//		phoneList.add(phone1);
//		LocalPhone phone2= new LocalPhone("5713071", "02", "972");
//		phoneList.add(phone2);
//		LocalContact contact1 = new LocalContact("203224407", "Arie", "Frusman", "arie902@gmail.com", addressList, phoneList);
//		System.out.println(contact1);
//		XeroClient client = new XeroClient();
//		List<Contact> contactList=new ArrayList<Contact>();
//		List<LocalContact> localContactList= new ArrayList<LocalContact>();
//		try {
//			contactList=client.getContacts();
//			for (Contact contact : contactList) {
//				LocalContact c = new LocalContact();
//				List<Address> address = new ArrayList<Address>();
//				address=contact.getAddresses().getAddress();
//				List<LocalAddress> addressList2 = new ArrayList<LocalAddress>();
//				List<Phone> phone = new ArrayList<Phone>();
//				phone=contact.getPhones().getPhone();
//				List<LocalPhone> localPhoneList2=new ArrayList<LocalPhone>();
//				
//				for (Phone phone3 : phone) {
//					LocalPhone p = new LocalPhone();
//					p.setLocalAreaCode(phone3.getPhoneAreaCode());
//					p.setLocalCountryCode(phone3.getPhoneCountryCode());
//					p.setLocalPhoneNumber(phone3.getPhoneNumber());
//					localPhoneList2.add(p);
//				}
//				for (Address address3 : address) {
//					LocalAddress a = new LocalAddress();
//					a.setLocalAddressLine1(address3.getAddressLine1());
//					a.setLocalAddressType(address3.getAddressType());
//					a.setLocalCity(address3.getCity());
//					a.setLocalCountry(address3.getCountry());
//					a.setLocalPostalCode(address3.getPostalCode());
//					a.setLocalRegion(address3.getRegion());
//					addressList2.add(a);
//				}
//				c.setAddresses(addressList2);
//				c.setEmail(contact.getEmailAddress());
//				c.setFirstname(contact.getFirstName());
//				c.setLastname(contact.getLastName());
//				c.setPhones(localPhoneList2);
//				c.setId(contact.getContactID());
//				localContactList.add(c);
//				
//				LocalContact c = new LocalContact(contact.getContactID(), contact.getFirstName(), contact.getLastName(), contact.getEmailAddress(), contact.getAddresses().getAddress(), contact.getPhones().getPhone());
//			}
//			for (LocalContact localContact : localContactList) {
//				System.out.println(localContact);
//				System.out.println("----------------------------------------------");
//			}
//			System.out.println(localContactList.size());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		List<LocalContact> contactList = new ArrayList<LocalContact>();
		GetContact contact = new GetContact();
		contactList=contact.getContactByName("ABC Furniture");
		for (LocalContact localContact : contactList) {
			System.out.println(localContact);
		}
//		contactList.clear();
//		contactList=contact.getContactByFirstName("Trish");
//		for (LocalContact localContact : contactList) {
//			System.out.println(localContact);
//		}
//		contactList.clear();
//		contactList=contact.getContactByLastName("Rawlings");
//		for (LocalContact localContact : contactList) {
//			System.out.println(localContact);
//		}
//		contactList.clear();
//		contactList=contact.getContactByFullName("Trish", "Rawlings");
//		for (LocalContact localContact : contactList) {
//			System.out.println(localContact);
//		}
//		contactList.clear();
//		contactList=contact.getAllContacts();
//		for (LocalContact localContact : contactList) {
//			System.out.println(localContact);
//		}
		
		
	}

}
