package Exercise2;

import java.util.Scanner;

public class LottoDriver {
	
	public static void main(String[] args)
    {
	Scanner input = new Scanner(System.in);
	
	for(int i = 0; i < 5; i++) {
		
	Lotto lotto1 = new Lotto(); 	
	
	System.out.printf("What is your guess? Between 3 and 27: ");
		int answer = input.nextInt();
		int finalAnswer = lotto1.getAnswer();
  		if(answer == finalAnswer) {
  			System.out.println("You win!");
  			System.exit(0);
  		} else {
  			System.out.println("Wrong!");
  			System.out.printf("answer was: %s%n%n", lotto1.getAnswer());
  		}
	}
	System.out.printf("Sorry, you lost!!");
    }
}
