package strings;

import java.util.*;

public class MinDelToPalindrome {

	public static int minDeletions(String str, int n) {
		int longestPalindromeLength = LongestCommonPalindromicSubsequence.longestPalindromeLength(str);
		return n - longestPalindromeLength;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = str.length();
		System.out.println(minDeletions(str, n));
		sc.close();
	}

}
