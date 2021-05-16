package ClassProject1;
import java.util.Scanner;

public class SingerTest
{
   public static void main(String[] args)
   { 
      // create a Scanner object to obtain input from the command window
      Scanner input = new Scanner(System.in);

      // create an Singers object and assign it to singer1
      Singers singer1 = new Singers(); 

      // display initial value of singer1
      System.out.printf("Initial id is: %s%n%n", singer1.getId());
      System.out.printf("Initial name is: %s%n%n", singer1.getName());
      System.out.printf("Initial address is: %s%n%n", singer1.getAddress());
      System.out.printf("Initial date of birth is: %s%n%n", singer1.getDateOfBirth());
      System.out.printf("Initial number of albums published is: %s%n%n", singer1.getAlbumsPublished());
      
      System.out.println("Please enter the id:");
      int theId = input.nextInt();
      singer1.setId(theId);
      
      System.out.println("Please enter the name:");
      String theName = input.next();
      singer1.setName(theName);
      
      System.out.println("Please enter the address:");
      String theAddress = input.next();
      singer1.setAddress(theAddress);
      
      System.out.println("Please enter the date of birth:");
      String theDateOfBirth = input.next();
      singer1.setDateOfBirth(theDateOfBirth);
      
      System.out.println("Please enter the number of albums published:");
      int theAlbumsPublished = input.nextInt();
      singer1.setAlbumsPublished(theAlbumsPublished);

      //Display Set variables
      System.out.printf("ID in object singer1 is:%n%s%n",
    	 singer1.getId());
      System.out.printf("Name in object singer1 is:%n%s%n",
         singer1.getName());
      System.out.printf("Address in object singer1 is:%n%s%n",
    	 singer1.getAddress());
      System.out.printf("Date of birth in object singer1 is:%n%s%n",
    	 singer1.getDateOfBirth());
      System.out.printf("Number of albums published in object singer1 is:%n%s%n",
    	 singer1.getAlbumsPublished());

   }
}
