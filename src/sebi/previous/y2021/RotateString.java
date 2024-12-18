package sebi.previous.y2021;

import java.util.*;


public class RotateString {

	public static String rotateAntiClockwise(String s, int k) {

		int l = s.length();

		return s.substring(l - k) + s.substring(0, l - k);
	}

	public static String rotateClockwise(String s, int k) {

		int l = s.length();

		return s.substring(k, l) + s.substring(0, k);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(rotateAntiClockwise(s, 2));
		System.out.println(rotateClockwise(s, 2));
	}

}
