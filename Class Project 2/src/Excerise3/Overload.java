package Excerise3;

public class Overload {
		   // test overloaded square methods
		   public static void main(String[] args) 
		   {
		      System.out.printf("Square of integer 7 is %d%n", square(7));
		      System.out.printf("Square of double 7.5 is %f%n", square(7.5));
		      System.out.printf("Square of float 8 is %f%n", square(8F));
		   }
		   
		   // square method with int argument
		   public static int square(int intValue)
		   {
		      System.out.printf("%nCalled square with int argument: %d%n", 
		         intValue);
		      return intValue * intValue;
		   }
		// square method with double argument
		   public static double square(double doubleValue)
		   {
		      System.out.printf("%nCalled square with double argument: %f%n",
		         doubleValue);
		      return doubleValue * doubleValue;
		   }
		   
			// square method with float argument
		   public static float square(float floatValue)
		   {
		      System.out.printf("%nCalled square with float argument: %f%n",
		    		  floatValue);
		      return floatValue * floatValue;
		   }
		} // end class MethodOverload


