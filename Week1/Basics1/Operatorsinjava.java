//import java.util.*;
public class Operatorsinjava {

	public static void main(String[] args) {
		
		/**int x = 10, x1 = 10;
		//x = x + 1; // in program the flow of execution goes from left to right
		x = ++x; //here we first increment and then assign the incremented value of x to the x -- 1+10('x') = 11 = x  
		//++x is Known as Pre-Increment
		x1 = x1++; //here first we read the x value and then increment . so since we already read the x1 value if we print x1 here it will give us 10 instead of the incremented value which is 10 + 1 = 23
		//x1++ is known as Post-Increment
		System.out.println("++x result: " + x);
		System.out.println("x1++ result: " + x1);
		**/
		
		/**int y = 20 ,y1 = 25;
		y = --y; //similar to ++x but instead of increment it is decrement y = 1 - 20 = 19
		//--y is called Pre-Decrement
		y1 = y1--; //similar to x1++ but here we decrement ---25 -1 = 24 
		//y1-- is called Post-Decrement
		System.out.println("--y result: " + y);
		System.out.println("y1-- result: " + y1);
		**/
		
		int x = 10;
		System.out.println("Addition of two increments");
		
		System.out.println("(++x + x++): " + (++x + x++)); //here the addition value given is 22(1 + 10 + 11) , but total x value is 12(x value after x++) = 1  + 10 + 11(x value updated in previous increment ++x --1+10) +1 = 23 
		System.out.println("(x++ + ++x): " + (x++ + ++x)); //12(x value did not get updated because x read before increment) + 1 + 1 + 12 = 26
		
		//~ (Tilde) Operator is used for Boolean data type
		System.out.println("\nTilde Operator");
		System.out.println(~10); // -(no.of elements) = -11 (from 0 to 10 ~0,1,2,3,4,5,6,7,8,9,10)
		System.out.println(~-10); // For "-ve" numbers start from 0(zero is not counted) and then we move from 0 to 10 or some n times here it is 9.
		
		//Left and Right shift operators
		System.out.println("\nLeft Shift Operators: ");
		System.out.println(10 << 1); // For every left shift the value doubles since it converts the value into an binary(32 16 8 4 2 1) digits and then shifts it to left ---001010 to 10100 --10 to 20
		System.out.println(10 << 2);
		System.out.println(10 << 3);
		
		System.out.println("\nRight Shift Operators: ");
		System.out.println(10 >> 1); //It works similar to left shift but instead of shifting the binary digits to left we shift it to right ---001010 to 000101 ---10 to 5
		System.out.println(10 >> 2); //so for every right shift the value becomes half of original value. 
		System.out.println(10 >> 3);
		/**
		//Relational Operators
		System.out.println("\nRelational Operators:");
		System.out.println(10 < 5);
		System.out.println(10 > 5);
		System.out.println(10 <= 5);
		System.out.println(10 >= 5);
		System.out.println(10 == 5);
		System.out.println(10 != 5); **/
		
		//AND Operator ---Logical AND(&&), Bitwise AND(&)
		System.out.println("\nAND Operators");
		System.out.println("1.Logical AND -- &&");
		System.out.println(1 < 2 && 4 < 5); // take "<" as true and ">" as false
		System.out.println(1 < 2 && 4 > 5);
		System.out.println(1 > 2 && 4 < 5);
		System.out.println(1 > 2 && 4 > 5);
		System.out.println("\n2.Bitwise AND -- &");
		System.out.println(3 & 5); // Displays the common digits in binary code --- 0011 & 0101 ---- 0001 is common  so result is 1(0001)
		
		//OR Operator ---Logical OR(||), Bitwise OR(|)
		System.out.println("\nOR Operators");
		System.out.println("1.Logical OR -- ||");
		System.out.println(1 < 2 || 4 < 5);
		System.out.println(1 < 2 || 4 > 5);
		System.out.println(1 > 2 || 4 < 5);
		System.out.println(1 > 2 || 4 > 5);
		System.out.println("\n2.Bitwise OR -- |");
		System.out.println(3 | 5); // Displays the binary digits which is true value(1)--- 0101(5) | 0011(3) ---- 0111(7)
		
		//Ternary Operator
		System.out.println("\nTernary Operator");
		int t = 3, T1 = 10;
		int minimum = (t < T1)? t: T1;
		System.out.println("minimum of t and T1 is: " + minimum);
		
		
		//1. Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        //2. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b));   // Greater than
        System.out.println("a < b: " + (a < b));   // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        //3. Logical Operators
        boolean T = true, F = false;
        System.out.println("\nLogical Operators:");
        System.out.println("T && F: " + (T && F)); // Logical AND
        System.out.println("T || F: " + (T || F)); // Logical OR
        System.out.println("!T: " + (!T));         // Logical NOT

        //4. Bitwise Operators
        int B1 = 6, B2 = 4;
        System.out.println("\nBitwise Operators:");
        System.out.println("B1 & B2: " + (B1 & B2));   // Bitwise AND
        System.out.println("B1 | B2: " + (B1 | B2));   // Bitwise OR
        System.out.println("B1 ^ B2: " + (B1 ^ B2));   // Bitwise XOR
        System.out.println("~B1: " + (~B1));         // Bitwise NOT
        

        //5. Assignment Operators
        int A = 10;
        System.out.println("\nAssignment Operators:");
        A += 5; // A = A + 5
        System.out.println("A += 5: " + A);
        A -= 3; // A = A - 3
        System.out.println("A -= 3: " + A);
        A *= 2; // A = A * 2
        System.out.println("A *= 2: " + A);
        A /= 4; // A = A / 4
        System.out.println("A /= 4: " + A);
        A %= 3; // A = A % 3
        System.out.println("A %= 3: " + A);

        //6. Unary Operators
        int U = 5;
        System.out.println("\nUnary Operators:");
        System.out.println("U++: " + (U++)); // Post-increment
        System.out.println("++U: " + (++U)); // Pre-increment
        System.out.println("U--: " + (U--)); // Post-decrement
        System.out.println("--U: " + (--U)); // Pre-decrement
        
        //7. Shift Operators
        int s = 30, s1 = -20;
        System.out.println("\nShift Operators:");
        System.out.println("s << 1: " + (s << 1)); // Left shift or Signed Left shift
        System.out.println("s >> 1: " + (s >> 1)); // Right shift or Singed Right shift
        System.out.println("s >> 1: " + (s1 >> 3));
        System.out.println("s >>> 1: " + (s1 >>> 3)); // Unsigned Right shift
        //unsigned right shift and signed right shift gives different values for "-ve" numbers.
        
        //8. Ternary Operators
        System.out.println("\nTernary Operators:");
        //Syntax: variable = Expression1 ? Expression2: Expression3
        
        //Scanner scanner = new Scanner(System.in);
        //int n1 = scanner.nextInt();
        //int n2 = scanner.nextInt();
        int Max, Min, n1 = 10, n2 = 20;
        Max = (n1 > n2)? n1: n2;
        Min = (n1 < n2)? n1: n2;
        System.out.println("Largest of n1 and n2: " + Max);
        System.out.println("Smallest of n1 and n2: " + Min);
        
        
        
	}

}
