public class Datatypes {

	public static void main(String[] args) {
		
		//1.BYTE (size: 1 byte or 8 bits)
		byte b1 = 127;
		byte b2 = -128;
		System.out.println("min and max values that can be assinged to Byte data type is: "+ b2 +", " + b1);
		System.out.println(b1+b2); // adding max and min values of byte
		
		//2. SHORT (size: 2 bytes)
		short s1 = 32767;
		short s2 = -32768;
		System.out.println("min and max values that can be assinged to Short data type is: "+ s2 +", " + s1);
		
		//3.INTEGER (size: 4 Bytes)
		int num = 2147483647;
		int num1 = -2147483648;
		System.out.println("min and max values that can be assinged to int is: "+ num1 +", " + num1);
		int n = num1 + num;
		System.out.println((n*10)/12);
		
		//4. Long (size: 8 Bytes)
		long L = 1000000000000000000L; // we declare 'l' at end of the value when we are declaring a long variable
		L = L +1000000000000000000l; //out of range error
		System.out.println(L);
		System.out.println("min and max values that can be assinged to Long is: 2^63  and 2^63 - 1");
		
		//5. FLOAT (size: 4 Bytes)
		float f1 = 3.14f; // we declare 'f' at end of the value when we are declaring a float variable.
		float f2 = 2f;
		f1 = 31/f1;
		f2 = f1 * f2/(f1+f2);
		System.out.println(f2);
		System.out.println("min and max values that can be assinged to Float is: ~1.4E-45 and ~3.028235E38");
		//FLOAT PRECISION: 6 to 7 decimal digits
		
		//6.Double
		double d = 123456789.123456789;
		//DOUBLE PRECISION: 15 to 16 decimal digits
		float f3 = 12346789.123456789f;
		//comparing float and double precision values
		System.out.println("Float precision: "+ f3 + "\nDouble precision: "+ d);
		
		//7. CHAR (size: 2 Bytes)
		char c = 'p';
		System.out.println(c);
		
		//8. BOOLEAN (size: it is initially represented as 1 bit but stored in 1 byte or more for alignment)
		boolean T= true;
		boolean F = false;
		System.out.println("is program working: " + T);
		System.out.println("is program not working: " + F);
		
		
		System.out.println("Minimum and Maximum values that can be stored in each Data Type");
		
        System.out.println("Byte:");
        System.out.println("Min: " + Byte.MIN_VALUE);
        System.out.println("Max: " + Byte.MAX_VALUE);

        System.out.println("\nShort:");
        System.out.println("Min: " + Short.MIN_VALUE);
        System.out.println("Max: " + Short.MAX_VALUE);

        System.out.println("\nInteger:");
        System.out.println("Min: " + Integer.MIN_VALUE);
        System.out.println("Max: " + Integer.MAX_VALUE);

        System.out.println("\nLong:");
        System.out.println("Min: " + Long.MIN_VALUE);
        System.out.println("Max: " + Long.MAX_VALUE);

        System.out.println("\nFloat:");
        System.out.println("Min: " + Float.MIN_VALUE);
        System.out.println("Max: " + Float.MAX_VALUE);

        System.out.println("\nDouble:");
        System.out.println("Min: " + Double.MIN_VALUE);
        System.out.println("Max: " + Double.MAX_VALUE);

        System.out.println("\nCharacter:");
        System.out.println("Min: " + (int) Character.MIN_VALUE);
        System.out.println("Max: " + (int) Character.MAX_VALUE);

        System.out.println("\nBoolean:");
        System.out.println("Values: " + Boolean.FALSE + ", " + Boolean.TRUE);
		
	}

}
