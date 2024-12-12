package strings;
import java.util.*;
public class LongestCommonPalindromicSubsequence {

	public static boolean isPalindrome(String s, int i, int j) {
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			} else {
				i++;
				j--;
			}
		}
		return true;
	}

	public static String longestPalindrome(String s) {
		int n = s.length();
		int maxLength = 0;
		int first = 0;
		int last = 0;

		for (int i = 0; i < n; i++) {

			for (int j = i; j < n; j++) {
				if (isPalindrome(s, i, j)) {
					int length = j - i + 1;
					if (length > maxLength) {
						maxLength = length;
						first = i;
						last = j;
					}
				}
			}

		}

		return s.substring(first, last + 1);

	}
	
	//If length is required
	public static int longestPalindromeLength(String s) {
		int n = s.length();
		int maxLength = 0;
		int first = 0;
		int last = 0;

		for (int i = 0; i < n; i++) {

			for (int j = i; j < n; j++) {
				if (isPalindrome(s, i, j)) {
					int length = j - i + 1;
					if (length > maxLength) {
						maxLength = length;
						first = i;
						last = j;
					}
				}
			}

		}

		return maxLength;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		System.out.println(longestPalindrome(s));
		System.out.println(longestPalindromeLength(s));
		
	}

}
