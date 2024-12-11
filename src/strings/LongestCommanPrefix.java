package strings;

import java.util.Arrays;

public class LongestCommanPrefix {
	
	public static String longestCommanPrefix(String[] arr) {
		
		Arrays.sort(arr);
		
		String first = arr[0];
		String last = arr[arr.length - 1];
		
		int minLength = Math.min(first.length(), last.length());
		
		int matchLength = 0;
		
		for(int i = 0; i < minLength; i++) {
			if(first.charAt(i) == last.charAt(i))
				matchLength++;
			else
				break;
		}
		
		String ans = "";
		
		ans = first.substring(0, matchLength);
		
		return ans;
		
	}
	
	public static void main(String[] args) {
		String[] arr = {"geeksforgeeks", "geeks", "geek", "geezer"};
		System.out.println(longestCommanPrefix(arr));
	}

}
