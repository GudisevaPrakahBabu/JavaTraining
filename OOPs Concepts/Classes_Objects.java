//Main Class
public class Classes_Objects {
	
	// Main Method
	public static void main(String[] args) {
		
		//Creating multiple Student objects using the constructor(Student)
		Student s1 = new Student("Prakash", 21, 'A'); 
		Student s2 = new Student("ash", 23, 'B');
		Student s3 = new Student("akash", 20, 'C');
		Student s4 = new Student("rakash", 22, 'D');
		
		// Calling the displayDetails() to display the objects which are created using constructor(Student)
		s1.displayDetails();
		s2.displayDetails();
		s3.displayDetails();
		s4.displayDetails();

	}

}

// Student class
class Student 
{
	// Class Attributes
	String name;
	int age;
	char grade;
	
	// Parametric Constructor --- Student
	public Student( String name, int age, char grade ) 
	{
		this.name = name; //this keyword is used to refer to current instance of a class
		this.age = age;   //this keyword is used to call another constructor
		this.grade = grade;	
	}
	
	// Method --- displayDetails
	public void displayDetails()
	{
		System.out.println("\nName of the Student is: " + name);
		System.out.println("Age of the Student is: " + age);
		System.out.println("Grade of the Student is: " + grade);
	}
	
}