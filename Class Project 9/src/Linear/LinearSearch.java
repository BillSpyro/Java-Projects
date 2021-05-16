package Linear;

import java.util.Scanner;

class LinearSearch { 

public static int Search(int stack[], int x)
{
    int n = stack.length;
    for (int i = 0; i < n; i++) 
    {
        if (stack[i] == x)
            return i;
    }
    return -1;
}

public static void main(String args[])
{
	
	Scanner input = new Scanner(System.in);
	
    int stack[] = { 1, 2, 5, 8, 10, 15, 20, 30, 40, 50, 100 };
    
    System.out.println("What number to search for? ");
    int x = input.nextInt();

    int result = Search(stack, x);
    if (result == -1)
        System.out.print(
            "Number is not in array");
    else
        System.out.print("Number is at position "
                         + result);
}
}
