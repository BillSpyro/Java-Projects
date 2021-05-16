package Exercise4;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args)
    {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sentence = input.nextLine();

        System.out.println("Enter the word to replace.");
		String replace = input.nextLine();
		
		System.out.println("Enter the replacing word");
		String newWord = input.nextLine();
        String new_sentence = sentence.replaceAll(replace, newWord);
       
        System.out.println("Original string: " + sentence);
        System.out.println("New String: " + new_sentence);
    }
}
