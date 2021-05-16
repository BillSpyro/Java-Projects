package Exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class InsuranceDriver {
	public static void main(String[] args)
    {
	
	Scanner input = new Scanner(System.in);
	
	int type = 0;
	
	double fee = 0;
	
	ArrayList<Insurance> listOfObjects = new ArrayList<Insurance>();
    
	while(true) {
	
	System.out.println("What insurance type?:\n"
			+ "1. Life\n"
			+ "2. Health\n");
	
	type = input.nextInt();
	
	System.out.println("Enter Montly Fee:\n");
	
	fee = input.nextDouble();
	
	if (type == 1) {
		Life life = new Life();
		listOfObjects.add(new Life());
		listOfObjects.get(listOfObjects.size()-1).setInsuranceCost("Life", fee);
	} else if (type == 2) {
		Health health = new Health();
		listOfObjects.add(new Health());
		listOfObjects.get(listOfObjects.size()-1).setInsuranceCost("Health", fee);
	}
	
	for(int i = 0; i < listOfObjects.size();i++) {
		listOfObjects.get(i).DisplayInfo();
		System.out.printf("Make amy changes?\n"
				+ "1. Yes\n"
				+ "2. No\n");
		int answer = input.nextInt();
		if(answer == 1) {
			System.out.printf("What new Insurance type? \n");
			String change = input.next();
			System.out.printf("Enter new Monthly Fee: \n");
			int price = input.nextInt();
			listOfObjects.get(i).setInsuranceCost(change, price);
			listOfObjects.get(i).DisplayInfo();
		}
	}
	System.out.printf("Continue adding to the list?\n"
			+ "0. Exit\n");
	int ans = input.nextInt();
	if(ans == 0) {
		System.exit(0);
	}
	}
    }
	

	
	
    
    
    
    
    }

