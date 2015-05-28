package my.datastructure;

import java.util.Stack;

public class StackDemo {

	public static void doStack() {
		Stack<String> stack = new Stack<String>();
		String strArray[] = {"A", "B", "C"};
		for (String str : strArray) {
			stack.push(str);
		}
		
		for (int i=0; i<strArray.length; i++) {
			System.out.println(stack.pop());
		}
	}
	
	public static void main(String[] args) {
		doStack();
	}

}
