package pdf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfWriter;
import com.xero.api.XeroClient;
import com.xero.model.Contact;

import contact.GetContact;
import contact.LocalAddress;
import contact.LocalContact;

public class CreatePdf implements CreatePdfInterface{

	public Document createByID(String id) throws IOException {
		XeroClient client = new XeroClient();
		Contact contact = client.getContact(id);
		Document documnet = new Document();
		try {
			PdfWriter.getInstance(documnet, new FileOutputStream(contact.getFirstName() + ".pdf"));
			documnet.open();
			Paragraph paragraph = new Paragraph();
			paragraph.add(contact.getFirstName() + contact.getLastName());
			paragraph.add(contact.getContactID());
			documnet.add(paragraph);
			documnet.close();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return documnet;
	}

	public Document createByName(String name) throws FileNotFoundException, DocumentException {
		GetContact getContact = new GetContact();
		List<LocalContact> localContactList = getContact.getContactByName(name);
		Document document = new Document();
		for (LocalContact localContact : localContactList) {
			PdfWriter.getInstance(document, new FileOutputStream(localContact.getFirstname() + ".pdf"));
			document.open();
			Paragraph paragraph = new Paragraph();
			paragraph.add(localContact.getFirstname() + " "+ localContact.getLastname());
			paragraph.add(Chunk.NEWLINE);
			List<LocalAddress> localAddressList = localContact.getAddresses();
			for (LocalAddress localAddress : localAddressList) {
				paragraph.add(localAddress.toString());
			}
			document.add(paragraph);
		}
		document.close();
		return document;
		
	}

	public Document createByFirstName(String firstName) throws FileNotFoundException, DocumentException {
		GetContact getContact = new GetContact();
		List<LocalContact> localContactList = getContact.getContactByFirstName(firstName);
		Document document = new Document();
		for (LocalContact localContact : localContactList) {
			PdfWriter.getInstance(document, new FileOutputStream(localContact.getFirstname() + ".pdf"));
			document.open();
			Paragraph paragraph = new Paragraph();
			paragraph.add(localContact.getFirstname() + " "+ localContact.getLastname());
			paragraph.add(Chunk.NEWLINE);
			List<LocalAddress> localAddressList = localContact.getAddresses();
			for (LocalAddress localAddress : localAddressList) {
				paragraph.add(localAddress.toString());
			}
			document.add(paragraph);
		}
		document.close();
		return document;
	}

	public Document createByLastName(String lastName) throws FileNotFoundException, DocumentException {
		GetContact getContact = new GetContact();
		List<LocalContact> localContactList = getContact.getContactByLastName(lastName);
		Document document = new Document();
		for (LocalContact localContact : localContactList) {
			PdfWriter.getInstance(document, new FileOutputStream(localContact.getFirstname() + ".pdf"));
			document.open();
			Paragraph paragraph = new Paragraph();
			paragraph.add(localContact.getFirstname() + " "+ localContact.getLastname());
			paragraph.add(Chunk.NEWLINE);
			List<LocalAddress> localAddressList = localContact.getAddresses();
			for (LocalAddress localAddress : localAddressList) {
				paragraph.add(localAddress.toString());
			}
			document.add(paragraph);
		}
		document.close();
		return document;
	}

	public Document createByFullName(String firstName, String lastName) throws FileNotFoundException, DocumentException {
		GetContact getContact = new GetContact();
		List<LocalContact> localContactList = getContact.getContactByFullName(firstName, lastName);
		Document document = new Document();
		for (LocalContact localContact : localContactList) {
			PdfWriter.getInstance(document, new FileOutputStream(localContact.getFirstname() + ".pdf"));
			document.open();
			Paragraph paragraph = new Paragraph();
			paragraph.add(localContact.getFirstname() + " "+ localContact.getLastname());
			paragraph.add(Chunk.NEWLINE);
			List<LocalAddress> localAddressList = localContact.getAddresses();
			for (LocalAddress localAddress : localAddressList) {
				paragraph.add(localAddress.toString());
			}
			document.add(paragraph);
		}
		document.close();
		return document;
	}
	
	
	
	
	

}
