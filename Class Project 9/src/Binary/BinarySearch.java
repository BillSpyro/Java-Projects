package Binary;

import java.util.Scanner;

class BinarySearch { 
	
    int BinarySearch(int stack[], int left, int right, int x) 
    { 
        if (right >= left) { 
            int mid = left + (right - left) / 2; 
  
            if (stack[mid] == x) 
                return mid; 
  
            if (stack[mid] > x) 
                return BinarySearch(stack, left, mid - 1, x); 
  
            return BinarySearch(stack, mid + 1, right, x); 
        } 

        return -1; 
    } 
  
    public static void main(String args[]) 
    { 
    	Scanner input = new Scanner(System.in);
    	
        BinarySearch ob = new BinarySearch(); 
        
        int stack[] = { 1, 2, 5, 8, 10, 15, 20, 30, 40, 50, 100 };
        
        int n = stack.length; 
        
        System.out.println("What number to search for? ");
        int x = input.nextInt();
        
        int result = ob. BinarySearch(stack, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Number is not in array"); 
        else
            System.out.println("Number is at position " + result); 
    } 
} 
