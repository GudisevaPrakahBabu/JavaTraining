import java.util.*;
public class Arraysofjava {
	
	public static void main(String[] args) {
		int[] array = new int[5];
		System.out.println(array); //default value of array
		System.out.println("1.\n" + array[0]); //index by default starts with zero
		System.out.println(array[1]); // we use index numbers to get the values in that index
		System.out.println(array[2]); // the default values of every index is zero.
		System.out.println(array[3]);
		System.out.println(array[4]);
		//System.out.println(array[-1]);
		//System.out.println(array[5]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		
		int[] arr = new int[] {1, 2, 3, 4, 5}; // another way of initializing array.
		System.out.println("2.\n" +Arrays.toString(arr)); // uses java.util.Arrays; or java.util.*;
		
		int[] arr1 = {2, 4, 3, 6, 1};  // another way of initializing array.
		System.out.println("3.\n" + java.util.Arrays.toString(arr1)); //directly importing java.util.Arrays in print function.
		
		array[0] = 2; // assigning values to particular index or position in array
		array[1] = 14;
		array[2] = 56;
		array[3] = 45;
		array[4] = 23;
		System.out.println(array);
		System.out.println(array[1]);
		System.out.println(array.length); //gives length of the array.
		
		
		array = new int[6]; //creating a new array with same name with a more size than previous array does not add extra index to already existing array
		                    //but rather the old array with same name gets overwritten by the new array
		System.out.println("overwritten new array values: "+ array); //since the old array got overwritten the new array will have default values.
		
		
		//Swapping arrays values in the index
		arr =new int[]{10, 20, 30, 40, 50};
		int index1 = 1, index2 = 3;
		System.out.println("Before swap "+ Arrays.toString(arr));
		
		int temp = arr[index1]; //stores arr[index1] in temp variable
		arr[index1] = arr[index2]; //overwrite's arr[index1] value with array[index2] value
		arr[index2] = temp; // takes the value stored in temp variable and overwrite's the value in array[index2] value
		
		System.out.println("After swap: "+ Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("After sorting the array arr: "+ Arrays.toString(arr));

        //Taking input for array from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");

        int n = scanner.nextInt();
        int[] array1 = new int[n];
        System.out.println("Enter\s" + n +"\sarray elements");
        
        for (int i = 0; i < n; i++){
            array1[i] = scanner.nextInt();
        }

        System.out.println("The array for array elments the user assigned is: " + Arrays.toString(array1));
        scanner.close();
        
		
		
		
	}

}
