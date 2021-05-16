package Stack;

import java.util.Scanner;


public class StackDriver {
	public static void main(String[] args)
    {
	Scanner input = new Scanner(System.in);
	
	Stack stack1 = new Stack(); 
	
	int push = 0;
	int choice = 0;
	int change = 0;
	
	while (true){
		
		System.out.println("Welcome to the Stack program. Choose what you want to do:\n"
				+ "1. Push\n"
				+ "2. Pop\n"
				+ "3. isEmpty\n"
				+ "4. isFull\n"
				+ "5. Peak\n"
				+ "6. Count\n"
				+ "7. Change\n"
				+ "8. Display\n"
				+ "9. Exit\n"
				+ "Position is:" + stack1.position);
		
		choice = input.nextInt();
		
		if (choice == 1) {
			System.out.println("Push a number into the stack: ");
			push = input.nextInt();
			stack1.push(push);
		} else if (choice == 2) {
			System.out.println("A number has been popped out of the stack");
			stack1.pop();
		} else if (choice == 3) {
			System.out.println("Is it empty? " + stack1.isEmpty());
		} else if (choice == 4) {
			System.out.println("Is it full? " + stack1.isFull());
		} else if (choice == 5) {
			System.out.println("Peaking the top of stack? " + stack1.peak());
		} else if (choice == 6) {
			System.out.println("Counting Stack: " + stack1.count());
		} else if (choice == 7) {
			System.out.println("Change number to: ");
			change = input.nextInt();
			stack1.change(change);
		} else if (choice == 8) {
			System.out.println("Displaying Stack: " + stack1.display());
		} else if (choice == 9) {
			System.out.println("Exiting");
			System.exit(0);
		}
		
		
		
	}
	

	}
}
