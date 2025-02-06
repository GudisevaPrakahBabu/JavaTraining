
import Basicsref.ClassDeclarationInAnotherFile;

public class Methodsinjava {
	
	/**syntax: <Access Modifier> static ReturnType MethodName( Parameters )
	{
	   METHOD----------
	   --------BODY
	}**/

	public static void main(String[] args) //Method Signature
	{
		//There are 2 types of methods ---1.User Defined and 2.Pre-Defined methods
		//Access Modifier ---- Private, Public, Default and Protected
		//Static method means that the method belongs to a Class
		//Non-Static method or instance method means that the method belong to an object and require an instance to be called.
		//Return Type --- void(it does not return any integer value or int type in output) or int
		//Parameters are the variables in the method definition or signature that receive the values
		//Parameter are optional but we can still declare to maintain code without any confusion 
		System.out.println("Hello world"); //method is being called here and here "hello world" is known as argument 
		//Arguments are the values or variables passed to method when it is called.
		//the no.of Arguments must match the no.of parameters in a method. if not we will get compilation error
		
		printJunk(); // calls the printJunk() method --since it is a static method we are directly calling the class. 
		//printJunk("prakash"); //gives error --Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		                        //The method printJunk() in the type Methodsinjava is not applicable for the arguments (String)
        
		printJunk1("Prakash"); //here the printJunk1() method takes the arguments from main method when we call the method
		
		//add(2, 3); //calling int return type method --add(). it does not give or print any result for directly calling since add() does not store any value which we can return.
		// first we need to create an variable and then store the ad() value in that variable and call that variable.
		int sum = add(2,4); // sum stores the value of ad(2,4) in it.
		System.out.println("the result for int return type method add(2,4) is: " + sum);
	
		//nostatic(); // we cannot access or call an non-static method in a static method.
		
		Class1.one(); //calling another class method in this class
		
		ClassDeclarationInAnotherFile.anotherpackage(); //call another package class files method in this class method.
	}
	
	public static void printJunk() // example of user defined method with no Parameters
	{
		System.out.println("hello this is user defined method printJunk() with no parameters");
		
	}
	
	public static void printJunk(String[] args) //METHOD OVERLOADING
	/** when there are more than one method with same method name but different parameters  then we will face an problem known as Method Overloading**/
	{
		System.out.println("hello this is user defined method printJunk() with no parameters");
		
	}
	
	public static void printJunk1(String name) // example of user defined method with Parameters
	{
		System.out.println("this is user defined method with parameters \nwhat is your name: " + name);
	}
	
	public static int add(int a, int b) //this is an example for Method with int return type
	//the method should return a result of int type
	{
		return a+b; // does not return anything other than int type result
	}
	
	
	public void nostatic() // Example for a Non-Static Method 
	{
		System.out.println("this is Non-Static Method");
		 
		printJunk(); // we can directly call static method in non-static method but we cannot call non-static method in static method.
		
	}

}
