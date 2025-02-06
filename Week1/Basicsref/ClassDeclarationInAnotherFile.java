import Basics1.Class1;
import Basics1.Methodsinjava; //we need to first import the class file to call the methods in that class file

public class ClassDeclarationInAnotherFile {

	public static void main(String[] args) {
		
		Methodsinjava.printJunk();
		Class1.one(); //calling method of a class file in another package or folder

	}
	public static void anotherpackage() {
		System.out.println("this is a method of class file-- ClassDeclarationInAnotherFile in another package--traning1");
	}

}
