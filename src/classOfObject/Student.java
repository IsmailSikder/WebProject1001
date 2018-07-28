package classOfObject;

public class Student{
	
	private String id;
	private String firstName;
	private String lastName;
	private int grades;
	
	
	Student(){
		firstName = "ismail";
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getGrades() {
		return grades;
	}


	public void setGrades(int grades) {
		this.grades = grades;
	}
	
}
