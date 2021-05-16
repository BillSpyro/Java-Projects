package InsertionSort;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args)
    {
Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		System.out.println("Welcome to the Insertion Sort program:\n"
				+ "Please enter a number for the First position.\n");
		
		int number = input.nextInt();
		numbers.add(number);
		
		System.out.println("Please enter a number for the Second position.\n");
		
		number = input.nextInt();
		numbers.add(number);
		Insertion(numbers);
		
		System.out.println("Here is your list Sorted.\n");
	    for (int i : numbers) {
	        System.out.println(i);
	      }
		
		System.out.println("Please enter a number for the Third position.\n");
		
		number = input.nextInt();
		numbers.add(number);
		Insertion(numbers);
		
		System.out.println("Here is your list Sorted.\n");
	    for (int i : numbers) {
	        System.out.println(i);
	      }
		
		System.out.println("Please enter a number for the Fourth position.\n");
		
		number = input.nextInt();
		numbers.add(number);
		Insertion(numbers);
		
		System.out.println("Here is your list Sorted.\n");
	    for (int i : numbers) {
	        System.out.println(i);
	      }
		
		System.out.println("Please enter a number for the Fifth position.\n");
		
		number = input.nextInt();
		numbers.add(number);
		Insertion(numbers);
		
		System.out.println("Here is your list Sorted.\n");
	    for (int i : numbers) {
	        System.out.println(i);
	      }
	    
    }

	 public static ArrayList<Integer> Insertion(ArrayList<Integer> numbers) {
	    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
	    System.out.println("Starting sort now.\n");
	    for(int i = 0; numbers.size()>i;i++) {
			for(int j=0; numbers.size()>j;j++) {
				int one = (int) numbers.get(i);
				int two = (int) numbers.get(j);
				if(two > one ) {
					numbers.set(j, one);
					numbers.set(i, two);
				}
			}
		}
	    return numbers;
	 }
}
	    

		
		
    

