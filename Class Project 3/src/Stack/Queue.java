package Stack;

import java.util.Arrays;

public class Queue {
	public int[] stack = new int[5]; // instance variable
	public int position = 4;
	
	public int enqueue(int number) {
	
		if (arraySize() == 4) {
			System.out.println("Stack is overflowing!");
		} else {
			stack[position] = number;
			if (arraySize() == 4) {
				
			} else {
			position = position - 1;
			}
			System.out.println("Position Shifted up!");
			return stack[position];
		}
		return 0;
    }
	
	public int dequeue() {
		
		if (arraySize() == 0) {
			System.out.println("Stack is empty!");
		} else {
			if (arraySize() == 0) {
				
			} else {
			stack[4] = 0;
			}
			position = position + 1;
			System.arraycopy(stack, 0, stack, 1, stack.length-1);
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
		return stack[position + 1];

	}

	public int count() {
		
		return arraySize();

	}
	
	public int change(int number) {
		return stack[position + 1] = number;

	}
	
	public String display() {
		
		return Arrays.toString(stack);

	}
	
	public int arraySize() {
		return (int) Arrays.stream(stack).filter(i -> i !=0).count();
	}
}
