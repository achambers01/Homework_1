package HW15;
//Author: Ana Chambers
public class MainEmployee {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Larry", 362824, 3000000.24);
		
		System.out.println("Name: " + employee1.name + 
				"\nID: " + employee1.employeeID + "\nSalary: " + employee1.salary);

	}

}
