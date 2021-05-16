package Exercise2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
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
		int result =1;
		
	      for(int i = 0; i <= array_nums.length - 3; i++) {
	        if(array_nums[i] + 1 == array_nums[i+1] && array_nums[i+1] + 1 == array_nums[i+2])
	            result =0;
	    }
	                
		if (result==1)
		 {
		  System.out.printf(String.valueOf(false));
		 }
		else
		 {
		   System.out.printf(String.valueOf(true));
		 }
		 System.out.printf("\n");
	 }
}
