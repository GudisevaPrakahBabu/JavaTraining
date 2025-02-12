// Main Class
public class Methods {
	
	// Main Method
	public static void main(String[] args)
	{
		// Creating reference object cal for Calculator class 
		Calculator cal = new Calculator();
		System.out.println("\nMethod Overloading in Calculator class");
		System.out.println("Sum of 2 integers a and b is: " + cal.add(23, 45));            // Calling add(int a, int b) method in class Calculator
		System.out.println("Sum of 3 integers a, b and c is: " + cal.add(23, 45, 30));     // Calling add(int a, int b, int c) method in class Calculator
		System.out.println("Sum of 2 double numbers a and b is: " + cal.add(20.2134667, 52.427282922)); // Calling add(double a, double b) method in class Calculator
		
		// Creating reference object sci_cal for ScientificCalculator subclass
		ScientificCalculator sci_cal = new ScientificCalculator();
		System.out.println("\nMethod overriding in subclass ScientificCalculator");
		System.out.println("Sum of 2 integers a and b with an extra processing fee of 10 added is: " + sci_cal.add(30, 20));        // Calling add(int a, int b) method in subclass ScientificCalculator
		System.out.println("Sum of 3 integers a, b and c with an extra processing fee of 10 added is: " + sci_cal.add(30, 20, 56)); // Calling add(int a, int b, int c) method in subclass ScientificCalculator
		System.out.println("Sum of 2 double numbers a and b with an extra processing fee of 10 added is: " + sci_cal.add(50.1999999999999999, 49.1111111111111)); // Calling add(double a, double b) method in subclass ScientificCalculator

	}

}



// Base Class --- Calculator
class Calculator
{
	// OverLoading Method add()
	
	// Method add(int a, int b) → returns sum of two numbers.
	public int add(int a, int b) 
	{
		return a + b;     // returns sum of a and b in integer data type
	}
	
	// Method add(int a, int b, int c) → returns sum of three numbers.
	public int add(int a, int b, int c) 
	{
		return a + b + c; // returns sum of a, b and c in integer data type
	}
	
	// Method add(double a, double b) → returns sum of two decimal numbers.
	public double add(double a, double b) 
	{
		return a + b;     // returns sum of a and b in double data type
	}
}


// Subclass --- ScientificCalculator which extends to parent class(Calculator)
class ScientificCalculator extends Calculator
{
	// ScientificCalculator that overrides add() to return the sum with an extra processing fee of 10 added.
	
	// Method add(int a, int b) → returns sum of two numbers + 10.
        @Override
	public int add(int a, int b) 
	{
		return super.add(a, b) + 10;		//returns The sum of 2 numbers with an extra processing fee of 10 added
	}
	
	// Method add(int a, int b, int c) → returns sum of three numbers + 10.
        @Override
	public int add(int a, int b, int c)
	{
		return super.add(a, b, c) + 10;     //returns The sum of 3 numbers with an extra processing fee of 10 added
	}
	
	// Method add(double a, double b) → returns sum of two decimal numbers + 10.
        @Override
	public double add(double a, double b) 
	{
		return super.add(a, b) + 10; 		//returns The sum of 2 double numbers with an extra processing fee of 10 added
	}
}