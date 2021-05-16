package Stack;

import java.util.Scanner;

public class QueueDriver {
	public static void main(String[] args)
    {
	Scanner input = new Scanner(System.in);
	
	Queue queue1 = new Queue(); 
	
	int enqueue = 0;
	int choice = 0;
	int change = 0;
	
	while (true){
		
		System.out.println("Welcome to the Queue program. Choose what you want to do:\n"
				+ "1. Enqueue\n"
				+ "2. Dequeue\n"
				+ "3. isEmpty\n"
				+ "4. isFull\n"
				+ "5. Peak\n"
				+ "6. Count\n"
				+ "7. Change\n"
				+ "8. Display\n"
				+ "9. Exit\n"
				+ "Position is:" + queue1.position);
		
		choice = input.nextInt();
		
		if (choice == 1) {
			System.out.println("Push a number into the stack: ");
			enqueue = input.nextInt();
			queue1.enqueue(enqueue);
		} else if (choice == 2) {
			System.out.println("A number has been popped out of the stack");
			queue1.dequeue();
		} else if (choice == 3) {
			System.out.println("Is it empty? " + queue1.isEmpty());
		} else if (choice == 4) {
			System.out.println("Is it full? " + queue1.isFull());
		} else if (choice == 5) {
			System.out.println("Peaking the top of stack? " + queue1.peak());
		} else if (choice == 6) {
			System.out.println("Counting Stack: " + queue1.count());
		} else if (choice == 7) {
			System.out.println("Change number to: ");
			change = input.nextInt();
			queue1.change(change);
		} else if (choice == 8) {
			System.out.println("Displaying Stack: " + queue1.display());
		} else if (choice == 9) {
			System.out.println("Exiting");
			System.exit(0);
		}
		
		
		
	}
	

	}
}
