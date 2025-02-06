public class AccessModifierClassAccess {

	public static void main(String[] args) {
		PRIVATE();
		
		
	}
    public static void hello() {
		System.out.println("This is Public Method from another class file");
	}
	
    private static void PRIVATE() {
    	System.out.println("this is private method in class--AccessModifierClassAccess");
		
	}
	
    static void DEFAULT() {
    	System.out.println("This is Default Method from another class");
    }

}
