import java.io.FileNotFoundException;
import org.json.simple.parser.ParseException;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		
		/*
		 * Oliyarnyk Olexiy 
		 * method try catch
		 */
		JSON_Parser search = new JSON_Parser ();
		
		try {
			search.parseJson();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (ParseException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
