package pdf;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.itextpdf.text.Document;

public interface CreatePdfInterface {
	
	public Document createByID(String id) throws IOException;
	
	public Document createByName(String name) throws FileNotFoundException;

}
