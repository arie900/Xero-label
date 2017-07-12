package pdf;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.xero.api.XeroClient;
import com.xero.model.Address;
import com.xero.model.Contact;

import contact.LocalAddress;
import contact.LocalContact;

public class PdfTest {
	public static void main(String[] args) {
		XeroClient client = new XeroClient();
		Contact contactd = new Contact();
		try {
			List<Contact> conactList= client.getContacts(null, "Name==\"ABC Furniture\"",null);
			System.out.println(conactList.size());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		
//		
//		List<Contact> contactList = new ArrayList<Contact>();
//		LocalContact contact = new LocalContact();
//		Contact contact2 = new Contact();
//		try {
//			contactList=client.getContacts();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		contact2=contactList.get(1);
//		List<LocalAddress> localAdList = new ArrayList<LocalAddress>();
//		List<Address> adList=contact2.getAddresses().getAddress();
//		for (Address address : adList) {
//			LocalAddress a = new LocalAddress();
//			a.setLocalAddressLine1(address.getAddressLine1());
//			a.setLocalAddressType(address.getAddressType());
//			a.setLocalCity(address.getCity());
//			a.setLocalCountry(address.getCity());
//			localAdList.add(a);
//		}
//		contact.setAddresses(localAdList);
//		contact.setId(contact2.getContactID());
//		contact.setFirstname(contact2.getFirstName());
//		contact.setLastname(contact2.getLastName());
//		
//		System.out.println(contact);
//		
//		
//		
//		System.out.println(contact2.getName());
//		System.out.println(contact2.getContactID());
//		Document document = new Document();
//		try {
//			PdfWriter.getInstance(document, new FileOutputStream(contact.getFirstname() + ".pdf"));
//			document.open();
//			Paragraph par = new Paragraph();
////			par.add(contact.toString());
//			par.add(contact.getId());
//			par.add(contact.getFirstname());
//			par.add(contact.getLastname());
//			document.add(par);
//			document.close();
//			if(Desktop.isDesktopSupported()){
//				File file  = new File(contact.getFirstname() + ".pdf");
//				try {
//					Desktop.getDesktop().open(file);
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (DocumentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		CreatePdf first = new CreatePdf();
		try {
			first.createByName("Trish");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
