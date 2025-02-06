
import Basicsref.ClassDeclarationInAnotherFile;

public class Class1 {

	public static void main(String[] args) {
		
		//printJunk(); //we cannot call the method in another class file directly.
		Methodsinjava.printJunk(); //we can call the method of one class in another class using "Classname.methodname()" 
		
		ClassDeclarationInAnotherFile.anotherpackage(); //call another package class files method in this class method.
	}
	
	public static void one() {
		System.out.println("this is a method called one in another class file--class1");
	}

}
