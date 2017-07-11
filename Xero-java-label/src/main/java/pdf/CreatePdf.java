package pdf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;
import com.xero.api.XeroClient;
import com.xero.model.Contact;

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

	public Document createByName(String name) throws FileNotFoundException {
		XeroClient client = new XeroClient();
		List<Contact> contactList= new ArrayList<Contact>();
		try {
			contactList = client.getContacts(null, "Name==\""+name+"\"", null);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		Contact contact = contactList.get(0);
		Rectangle rec = new Rectangle(153,71);
		Document documnet = new Document(rec);
		documnet.setPageSize(PageSize.LETTER.rotate());
		try {
			PdfWriter.getInstance(documnet, new FileOutputStream(contact.getFirstName() + ".pdf"));
			documnet.open();
			documnet.add(new Paragraph(contact.getFirstName() + " " + contact.getLastName()));
			documnet.add(new Paragraph(contact.getEmailAddress()));
			documnet.close();
			System.out.println(documnet.getPageSize());
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return documnet;
	}
	
	

}
