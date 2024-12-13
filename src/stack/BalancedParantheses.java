package stack;

import java.util.*;

public class BalancedParantheses {
	public static boolean isValid(String str) {
	    // Initialize a stack to keep track of opening brackets
	    Stack<Character> stack = new Stack<>();

	    // Get the length of the input string
	    int n = str.length();

	    // Iterate through each character in the string
	    for (int i = 0; i < n; i++) {
	        char currentChar = str.charAt(i);

	        // Check if the character is an opening bracket
	        if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
	            // Push the opening bracket onto the stack
	            stack.push(currentChar);
	        } else {
	            // If the stack is empty, it means there is no matching opening bracket
	            if (stack.isEmpty()) {
	                return false;
	            }

	            // Peek at the top element of the stack (most recent opening bracket)
	            char topChar = stack.peek();
	            stack.pop(); // Remove the top element from the stack

	            // Check if the current closing bracket matches the top opening bracket
	            if (topChar == '(' && currentChar != ')') {
	                return false; // Mismatched parentheses
	            } else if (topChar == '{' && currentChar != '}') {
	                return false; // Mismatched curly braces
	            } else if (topChar == '[' && currentChar != ']') {
	                return false; // Mismatched square brackets
	            }
	        }
	    }

	    // After processing all characters, the stack should be empty for a valid string
	    return stack.isEmpty();
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(isValid(str));
		sc.close();
	}
}
