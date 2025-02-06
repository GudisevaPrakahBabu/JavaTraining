public class Accessmodifiersofjava {
	
	private static String name = "This is Field Level Private Access Modifier";

	public static void main(String[] args) //this is an example for Public Access Modifier
	//we can access or call the public method in both class level and package level -- it means we can call the public method in different class file and different package or folder.
	
	{
		System.out.println("This is the public main method where the java code is executed.");
		private1(); // calls private method within the class.
		System.out.println(name); // calls field level private access modifier
		default1(); // calls default method within the class.
		
		
		AccessModifierClassAccess.hello();//Calls Public method of another class file
		/**AccessModifierClassAccess.PRIVATE(); // calling private method of another class --- giving error Method type NOT VISIBLE. **/
		AccessModifierClassAccess.DEFAULT(); //Calling Default Method of another call file
		
	}
	
	private static void private1() //Example for a Private Access Modifier
	//we can only access or call the private method within the class file that private method is created.
	// but if you try to access or call this private method in another class file or package. you will encounter an saying method is not visible.
	{
		System.out.println("This is Private Method");
	}
	
	static void default1() // Example for Default Access Modifier
	//For default modifier we do not need to indicate anything like above or you can declare default static void methodname(){}. it is optional.
	//Default method can accessed within the package of the class file in which it was created.
	{
		System.out.println("This is Default Method");
		
	}

}
