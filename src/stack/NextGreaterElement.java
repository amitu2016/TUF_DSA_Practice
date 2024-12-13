package stack;

import java.util.*;

public class NextGreaterElement {

	public int[] nextLargerElement(int[] arr) {
		// Stack to keep track of elements for finding the next greater element
		Stack<Integer> st = new Stack<>();

		// Get the size of the input array
		int n = arr.length;

		// Array to store the next greater element for each element in the input array
		int[] nge = new int[n];

		// Traverse the array from right to left
		for (int i = n - 1; i >= 0; i--) {
			// Remove elements from the stack that are less than or equal to the current element
			// These elements cannot be the next greater element for the current element
			while (!st.isEmpty() && st.peek() <= arr[i]) {
				st.pop();
			}

			// If the stack is empty, it means there is no greater element on the right
			if (st.isEmpty()) {
				nge[i] = -1; // No next greater element
			} else {
				// The top element of the stack is the next greater element
				nge[i] = st.peek();
			}

			// Push the current element onto the stack
			// It will be considered as a candidate for the next greater element
			// for the elements to its left
			st.push(arr[i]);
		}

		// Return the array containing the next greater elements
		return nge;
	}

}
