package HW14;
//Author: Ana Chambers
public class MainStudent {

	public static void main(String[] args) {
		Student student1 = new Student("Lily", 12345, "A+");
		
		System.out.println("Name: " + student1.name + 
				"\nID: " + student1.studentID + "\nGrade: " + student1.grade);

	}

}
