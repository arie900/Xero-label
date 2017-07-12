package pdf;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;

public interface CreatePdfInterface {
	
	public Document createByID(String id) throws IOException;
	
	public Document createByName(String name) throws FileNotFoundException, DocumentException;
	
	public Document createByFirstName(String firstName) throws FileNotFoundException, DocumentException;
	
	public Document createByLastName(String lastName) throws FileNotFoundException, DocumentException;
	
	public Document createByFullName(String firstName,String lastName) throws FileNotFoundException, DocumentException;

}
