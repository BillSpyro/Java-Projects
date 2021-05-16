package Exercise3;

import java.util.Scanner;

import java.util.ArrayList;
public class ProcessMortgage {
static Scanner input = new Scanner(System.in);
static ArrayList <Mortgage> mortList = new ArrayList<Mortgage>();
public static void main(String[] arg) {
	PersonalMortgage Personal = new PersonalMortgage(0, null, null, 0, 0, 0);
	while(true) {
		int Mortgage;
		int term;
		ArrayList<Mortgage> listOfObjects = new ArrayList<Mortgage>();
		listOfObjects.add(new BusinessMortgage());
		listOfObjects.add(new PersonalMortgage());
		listOfObjects.add(new BusinessMortgage());
		
		for(int i = 0; i < listOfObjects.size();i++) {
			System.out.printf("What is your name?\n");
			String customerName = input.next();
			System.out.printf("What do you want your rate to be?\n");
			double rate = input.nextDouble();
			System.out.printf("What is your mortgage amount?\n");
			int MortgageAmount = input.nextInt();
			if(MortgageAmount > 300000) {
				System.out.printf("Sorry, that's above our Mortgage budget\n");
				Mortgage = 100000;
			} else {
				Mortgage = MortgageAmount;
			}
			System.out.printf("What's your loan number?\n");
			int MortNumber = input.nextInt();
			System.out.printf("What is the term that you'd like?\n"
					+ "5. Long\n"
					+ "3. Mediumn\n"
					+ "1. Short\n");
			int termAnswer = input.nextInt();
			if(termAnswer == 5) {
				term = Personal.LongTerm;
			} else if(termAnswer == 1) {
				term = Personal.ShortTerm;
			} else if(termAnswer == 3) {
				term = Personal.MidTerm;
			} else {
				term = Personal.ShortTerm;
			}
			System.out.printf("What will you name your Mortgage?\n");
			String mortgageName = input.next();

			listOfObjects.get(listOfObjects.size()-1).SetInfo(MortNumber,mortgageName, customerName, Mortgage, rate+100, term);
			listOfObjects.get(listOfObjects.size()-1).getMortgageInfo();
			
	}
	}
}
}
