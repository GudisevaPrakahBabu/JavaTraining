import java.util.*;
//This an Reference to the Constructorsofjava class. so go to Constructorsofjava class and run it to get the details on this class

public class ClassObjectAndConstructors {
	
	Scanner scanner = new Scanner(System.in);
	String name;
	int age;
	float height;
	
	
	//Default Constructor -- Default constructor is created with same name as class file when the class is executed and there are no constructors present in that class file. 
	//So java compiler creates a Default Constructor when there are no constructor block when the class file is executed. 
	/** Default Constructors created by Java compiler is known as "Implicit Default Constructor" --This type of constructor does not take any parameters and initializes the object with default values, such as 0 for numbers, null for objects.  **/
	public ClassObjectAndConstructors()/** Constructor Name should match with Class Name **/
	{
		//This is an Example for Static Constructor Initialization
		/**name = "Prakash";
		age = 21;
		height = 6.1f;   **/
		
		//Using Scanner token to take input from User Directly.
		System.out.println("\nEnter Name: ");
		name = scanner.nextLine();
		System.out.println("Enter Age: ");
		age = scanner.nextInt();
		System.out.println("Enter Height: ");
		height = scanner.nextFloat();
		
		
	}
	
	
	//Dynamic Constructor initialization
	/** Explicit Default Constructor---- If we define a constructor that takes no parameters, it’s called an explicit default constructor. 
	    This constructor replaces the one the compiler would normally create automatically. Once you define any constructor (with or without parameters), the compiler no longer provides the default constructor for you. **/
	public ClassObjectAndConstructors(String name, int age, float height) {
		
		this.name = name; // 'this' keyword is used call or refer the object or instance of class
		this.age = age;
		this.height = height;
		
	}
	
	/** CONSTRUCTOR OVERLOADING ---- When there are more than 1 constructors with same name but different Parameters **/
    @SuppressWarnings("preview")
	public ClassObjectAndConstructors(String name, int age) {
		this.name = name; 
		/** CONSTRUCTOR CHAINING --- Calling another Constructor  within another Constructor. We use 'this' keyword to call or refer to the constructor to call the constructor we need **/
		this(age); //here we are calling ClassObjectAndConstructors(int age) Constructor
	} 
    
    public ClassObjectAndConstructors(int age) {
    	this.age = age;
    }
    
    public void speak(){
    	System.out.println("Name: " + name);
    	System.out.println("Age: " + age);
    	System.out.println("Height: " + height);
    }
    
    public void dance() {
    	System.out.println(name + "\sis dancing" );
    }
	
	public static void main(String[] args) {
		
		System.out.println("This is an reference class for Constructorsofjava. so if you need to know the Constructor output run class file--Constructorsofjava");
		
	}

}
