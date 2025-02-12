// Main Class
public class Inheritance {
	
	// Main Method
	public static void main(String[] args) 
	{
		// Creating reference object employee for Parent class --- Employee
		Employee employee = new Employee("Prakash", 22222);
		employee.work();      // Calls Employee work() method
		
		// Creating reference object manager for Subclass --- Manager
		Manager manager = new Manager("Ash", 212133);
		manager.work();       // Calls subclass Manager which overrides the work() in parent class Employee
		manager.manageTeam(); // Calls manageTeam() in subclass Manager	
		

        // Creating reference object employee1 for Parent class --- Employee
		Employee employee1 = new Employee("Akash", 12022);
		employee1.work();      // Calls Employee work() method
		
		// Creating reference object manager1 for Subclass --- Manager
		Manager manager1 = new Manager("Rakash", 311243);
		manager1.work();       // Calls subclass Manager which overrides the work() in parent class Employee
		manager1.manageTeam(); // Calls manageTeam() in subclass Manager	
	}

}


// Base (or) Parent Class --- Employee
class Employee
{
	// Class Attributes
	String name;
	int salary;
	
	// Employee constructor
	public Employee(String name, int salary) 
	{
		this.name = name;
		this.salary = salary;
	}
		
	// Method -- work()
	public void work() 
	{
		System.out.println("\n" + name + " is working BBI Company");
		System.out.println(name + " salary is: " + salary + "\n");
	}
	
}


// Subclass --- Manager  which extends to parent class(Employee)
class Manager extends Employee
{
	
	// Constructor of Subclass Manager
	Manager(String name, int salary)
	{
		super(name, salary); //Super keyword is used call parent class(Employee) constructor of subclass(Manager)
	}
	
	// Overrides the work() in parent class(Employee)
        @Override
	public void work()
	{
		System.out.println("Manager " + name + " is working in BBI company");
		System.out.println("Manager " + name + " salary is: " + salary);
		
	}
	
	//Method --- manageTeam()
	public void manageTeam() 
	{
		System.out.println("Manager " + name + " is managing the coding team");
	}
	
}
