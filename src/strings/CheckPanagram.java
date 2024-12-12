package strings;

import java.util.*;

public class CheckPanagram {

	// Panagram means the string should contain all the alphabets from a to z
	public static boolean checkPangram(String s) {
		int l = s.length();

		//Scanning all alphabets from a to z
		for (char ch = 'a'; ch <= 'z'; ch++) {
			boolean found = false;

			//Scanning through the string to find out if the alphabet is present in string
			for (int i = 0; i < l; i++) {
				if (Character.toLowerCase(s.charAt(i)) == ch) {
					found = true;
					break;
				}
			}

			if (!found)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(checkPangram(s));
	}

}
