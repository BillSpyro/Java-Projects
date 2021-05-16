package Exercise1;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args)
	 {
		Scanner input = new Scanner(System.in);

	    System.out.println("Enter first number for array");
	    int number1 = input.nextInt();
	    System.out.println("Enter second number for array");
	    int number2 = input.nextInt();
	    System.out.println("Enter third number for array");
	    int number3 = input.nextInt();
	    System.out.println("Enter fourth number for array");
	    int number4 = input.nextInt();
	    System.out.println("Enter fifth number for array");
	    int number5 = input.nextInt();
	    
	    int[] array_nums = {number1, number2, number3, number4, number5};
		System.out.println("Original Array: "+Arrays.toString(array_nums)); 
		int max_val = array_nums[0];
		if(max_val <= array_nums[array_nums.length-1])
			max_val = array_nums[array_nums.length-1];
		if(max_val <= array_nums[array_nums.length/2])
			max_val = array_nums[array_nums.length/2];
		System.out.println("Largest element between first, last, and middle values: "+max_val);  
	 }
}
