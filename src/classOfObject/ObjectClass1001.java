package classOfObject;

import java.util.ArrayList;

public class ObjectClass1001 {

	public static void main(String[] args) {
		Student ismail = new Student();
		
		Student sufian = new Student();
		
		ismail.setFirstName("Ismail");
		ismail.setGrades(45);
		ismail.setId("101");
		
		sufian.setFirstName("sufian");
		sufian.setGrades(60);
		sufian.setId("105");
		
		ArrayList <Student> student = new ArrayList<>();
		
		student.add(ismail);
		student.add(sufian);
		
		
	}


}


