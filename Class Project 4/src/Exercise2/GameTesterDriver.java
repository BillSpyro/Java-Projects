package Exercise2;

import java.util.Scanner;

public class GameTesterDriver {
	public static void main(String[] args)
    {
	
	Scanner input = new Scanner(System.in);
	
	int tester = 0;
	
	int hours = 0;
	
	System.out.println("What game tester type?:\n"
			+ "1. Full Time\n"
			+ "2. Part Time\n");
	tester = input.nextInt();
	
	if (tester == 1) {
		FullTimeGameTester fullTime = new FullTimeGameTester();
		System.out.println("You now have a game tester type of " + fullTime.getName() + " with a salary of " + fullTime.getSalary() + "\n");
	} else if (tester == 2) {
		System.out.println("How many hours?:\n");
		hours = input.nextInt();
		PartTimeGameTester partTime = new PartTimeGameTester(hours); 
		System.out.println("You now have a game tester type of " + partTime.getName() + " with an hourly salary of " + partTime.getSalary() + "\n");
	}
	
    }
}
