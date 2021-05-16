package Stack;

import java.util.Arrays;

public class Stack {
	public int[] stack = new int[4]; // instance variable
	public int position = 0;
	
	public int push(int number) {
	
		if (arraySize() == 4) {
			System.out.println("Stack is overflowing!");
		} else {
			stack[position] = number;
			position = position + 1;
			System.out.println("Position Shifted up!");
			return stack[position - 1];
		}
		return 0;
    }
	
	public int pop() {
		
		if (arraySize() == 0) {
			System.out.println("Stack is empty!");
		} else {
			position = position - 1;
			stack[position] = 0;
			System.out.println("Position Shifted down!");
			return stack[position];
		}
		return 0;
    }
	
	public boolean isEmpty() {
		
		
		if (arraySize() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isFull() {
		
		
		if (arraySize() == 4) {
			return true;
		} else {
			return false;
		}
	}
	
	public int peak() {
		return stack[position - 1];

	}

	public int count() {
		
		return arraySize();

	}
	
	public int change(int number) {
		return stack[position - 1] = number;

	}
	
	public String display() {
		
		return Arrays.toString(stack);

	}
	
	public int arraySize() {
		return (int) Arrays.stream(stack).filter(i -> i !=0).count();
	}
	
	
}
