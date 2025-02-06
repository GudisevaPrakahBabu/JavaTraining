import java.util.*;
public class Conditionalstatementsinjava {

	public static void main(String[] args) {
		
		boolean passed = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("this is a Example for if-else condition");
		
		//1. IF-ELSE Condition
		if(passed) {
			System.out.println("congrats you passed exams");
		}
			//or
	   /**if (passed == true){
			   System.out.println("congrats you passed exams");
	   }**/
		
		else {
			System.out.println("Better luck next time");
		}
		System.out.println("\nExited if-else condition");
		
		
		//new example
		int favtemp = 25;
		int currenttemp = 45;
		System.out.println("\nthis is a Example for if-else if condition");
		System.out.println("Enter your favorate temperature: " + favtemp );
		//int favtemp = new scanner.nextInt();
		System.out.println("enter current temperature: "+ currenttemp);
		//int currenttemp =new scanner.nextInt();
		String opinion="My opinion on climate";
		System.out.println(opinion);
		
		//2. IF-ELSE IF-ELSE condition
		if(currenttemp < favtemp -5) {
			opinion ="it is little cold outside";
		}
		else if (currenttemp < favtemp -10) {
			opinion ="it is very cold outside";
		}
		else if (currenttemp < favtemp -20) {
			opinion ="it is freezing outside";
		}
		else if (currenttemp == favtemp) {
			opinion ="it is the best climate ";
		}
		else {
			System.out.println("it is hot outside");
		}
		
		
		//3. NESTED CONDITIONS __NESTED IF_ELS conditions
		System.out.println("\nthis is a Example for Nested if-else condition");
		System.out.println("Enter true or false: ");
		System.out.println("Did you pass your exams: ");
		boolean passedexam = scanner.nextBoolean();
		if(passedexam) {
			
			System.out.println("did you get good grades: ");
			boolean goodgrades = scanner.nextBoolean();
			if(goodgrades) {
				System.out.println("congrats for passing exams with good grades");
			}
			else {
				System.out.println("congrats on passing the exams");
			}
		}
		else {
			
			System.out.println("Did you just miss the mark: ");
			boolean justfail = scanner.nextBoolean();
			if(justfail) {
				System.out.println("so close you would have passed exams");
			}
			else {
				System.out.println("better luck next time");
			}
		}
		scanner.close();

	}

}
