import Basics1.AccessModifierClassAccess;

public class AcccessModifierInAnotherPackage {

    private static Object AccessModifierClassAccess;

	public static void main(String[] args) {
		
		AccessModifierClassAccess.hello(); //Calling public method of a class file(AccessModifierClassAccess) in another package
		//AccessModifierClassAccess.PRIVATE(); //throws a error: method type NOT VISIBLE when calling private method in another class
		//AccessModifierClassAccess.DEFAULT(); // same as private method Default method can only be accessed within the package its class file is present. if we try to access Default method in another package it will throw a error that the Method type is not visible
	}

}
