import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSON_Parser {
	public void parseJson() throws FileNotFoundException, IOException, ParseException{
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader("students.json"));
		JSONObject jsonObject = (JSONObject) obj;
	
		JSONArray pItem = (JSONArray)jsonObject.get("студенти");
		List <Students> students = new ArrayList();
		Iterator<Object> iterator = pItem.iterator();
		Students set = new Students();
		while (iterator.hasNext()) {
			 JSONObject item = (JSONObject) iterator.next();
				Students student = new Students();
			student.setSurname((String) item.get("прізвище"));
			student.setCourse(Integer.valueOf((String) item.get("курс")));
			student.setAge(Integer.valueOf((String) item.get("вік")));
			students.add(student);
		}
		set.setElements(students);
		
		
	}
}