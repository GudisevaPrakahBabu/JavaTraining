public class Variablesofjava {

	public static void main(String[] args) {
		
		int x = 1; 
		
		System.out.println("The variable x given value is: " + x); // '+' is used to append the one value with another value
		
		x = 72; //updates x value to 72 from previous value 1
		System.out.println("the updated value of x is: " + x);
		
		//int 1a  = 10; //we cannot declare variable name an number or we cannot have thae start of variable name as number
		//int a 1 = 10; //there should be No blank spaces in between variable name 
		int a1 = 10;
		
		System.out.println("the value of a1 is: " + a1);
		
		System.out.println("Appending value 10 to a1: "+ a1 +"\s" +10);
		
		System.out.println("Adding value 10 to a1 "+ (a1 +10));
        System.out.println("");
		System.out.println("Appending a1 and x: "+ a1 + x);
		System.out.println("Adding a1 and x: "+ (a1 + x));
		//or
		//System.out.println(x + 5);
		
		String Name = " Prakash";
		System.out.println("My Name is"+ Name);
		System.out.println("Appending an of value 5 to name: "+ Name + 5);
		System.out.println(Name + "\sBabu");
		
		//system.out.println(Name - 5);
		//System.out.println("here in java - does not work similar to + which appends values but in java we use - for subtractions "+ (x - 5));
			
		

	}

}
