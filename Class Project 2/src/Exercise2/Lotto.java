package Exercise2;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	   public int[] list = new int[3]; // instance variable
	   public int answer;
	   

	   //Constructors
	   Lotto(){
		   	  int[] list = new int[3];
		      Random rand = new Random(); //instance of random class
		      int max = 9;
		      int min = 1;
		      int number1 = rand.nextInt((max - min) + 1) + min;
		      int number2 = rand.nextInt((max - min) + 1) + min;
		      int number3 = rand.nextInt((max - min) + 1) + min;
		      answer = number1 + number2 + number3;
	    	  list[0] = number1;
	    	  list[1] = number2;
	    	  list[2] = number3;
	   }
	   
	      public int[] getList() {

	    	  return list;
	      }
	      
	      public int getAnswer() {

	    	  return answer;
	      }
	      
	      }


