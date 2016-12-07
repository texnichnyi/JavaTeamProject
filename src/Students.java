import java.io.FileReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;



public class Students implements Comparable<Students> {

	@Override
	public int compareTo(Students arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	private String surname;
	private int course;
	private int age;
	
	@JsonCreator
	public void Parsing(@JsonProperty("surname")String name, @JsonProperty("course")int course, @JsonProperty("age")int age){
		this.surname = surname;
		this.course = course;
		this.age = age;
	}
	
	public String getSurname(){
		return surname;
	}
	public void setSurname(String name){
		this.surname = name;
	}
	
	public int getCourse(){
		return course;
	}
	public void setCourse(int course){
		this.course = course;
	}
	
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	
	}

	public void setElements(List<Students> students) {
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader("students.json"));
		JSONObject jsonObject = (JSONObject) obj;
		JSONArray pItem = (JSONArray)jsonObject.get("студенти");
		
		for(int i = 0; i<pItem.size(); i++){
			students.add(i, pItem.get(i).getSurname()+ ' ' + pItem.get(i).getCourse() + ' ' + pItem.get(i).getCourse());
			}
	}
}

