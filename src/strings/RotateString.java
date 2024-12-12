package strings;

import java.util.*;

public class RotateString {

	//Check if strings are rotations of each other
	public static boolean rotateString(String s, String goal) {
		if(s.length() != goal.length()) {
			return false;
		}
		
		String s1 = s.concat(s);
		
		return s1.contains(goal);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String goal = sc.nextLine();
		
		System.out.println(rotateString(s, goal));
		
	}

}
