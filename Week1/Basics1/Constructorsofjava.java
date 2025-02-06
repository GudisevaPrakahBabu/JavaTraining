import java.util.*;
public class Constructorsofjava {

	public static void main(String[] args) {
		
		//ClassObjectAndConstructors con; 
		/** Here Con is known as 'reference variable'. con(Reference Variable) is refering to null(nothing)  **/
		//System.out.println(con); // so when we print the con(reference variable) we will get an error that variable my not have been initialized
		//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//The local variable con may not have been initialized
		
		//ClassObjectAndConstructors con = new ClassObjectAndConstructors(); // so we create con as new object to initialize con as local variable for storing values of ClassObjectAndConstructors() --call function initializes constructor. here we use this field to Declare and Initialize the constructor at same time  
		/** note-- even if we go and delete constructor(ClassObjectAndConstructors) we will not get any error at where we created new object(con) for constructor 
		    Because every class file generates a default constructor when they are executed in java compiler**/
		
		/**
		//Static Constructor Initialization for constructor in another class file
		System.out.println("\nAssigning Values to the variables in another class file and using constructor method to create new objects or instances: ");
		con.speak(); // gives the default values for the objects in that class file(uses Default constructor if there is no user declared constructor)
		con.name ="prakash";
		con.age = 23;
		con.height = 6.4f;
		con.speak(); //now it prints updated values which we assigned above
		             // In static initialization even if we call the same object multiple times it gives us same value and we need to update the values every time.
		             //So This is when Dynamic Initialization comes into the play
		**/
		
		
		/**
		//DYNAMIC CONSTRUCTOR Initialization
		ClassObjectAndConstructors con1 = new ClassObjectAndConstructors("prakash", 24, 6.3f); //here we can directly initialize the values for the parameter we created in Constructor
		con1.speak(); //displays the output for given object value in constructor
		
		ClassObjectAndConstructors con2 = new ClassObjectAndConstructors("Prakash", 23);
		con2.speak(); //Calling a constructor chaining another constructor
		**/
		
		//Using scanner function and taking input from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of persons data you would like to update and display: ");
		int n = scanner.nextInt();
		for(int i=0; i < n; i++) {
			ClassObjectAndConstructors constructor = new ClassObjectAndConstructors();
			System.out.println("\nDetails fo person" + (i + 1));
			constructor.speak();
		}
		scanner.close();
		
		
		
	}

}
