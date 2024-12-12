package strings;

import java.util.*;

public class RotateBy2Places {
	public static boolean isRotated(String s1, String s2) {
		int l1 = s1.length();
		int l2 = s2.length();
		
        if(l1 != l2) return false;
        
        if(l1 <= 1 && l2 <= 1) {
        	if(s1.equals(s2))
        		return true;
        	else
        		return false;
        }
        
        String clockWise = s1.substring(2) + s1.substring(0,2);
        String antiClockwise = s1.substring(l1 - 2) + s1.substring(0, l1 - 2);
        
        
        
        return s2.equals(antiClockwise) || s2.equals(clockWise);
        
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		System.out.println(isRotated(s1, s2));
	}
}
