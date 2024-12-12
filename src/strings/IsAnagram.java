package strings;

import java.util.*;

public class IsAnagram {
	
	public static boolean isAnagrams(String s1, String s2) {
		int l1 = s1.length();
		int l2 = s2.length();
		
		if(l1 != l2) return false;
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < l1; i++) {
			map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
		}
		
		for(int i = 0; i < l2; i++) {
			if(map.containsKey(s2.charAt(i)) && map.get(s2.charAt(i)) > 0) {
				map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) - 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() > 0)
				return false;
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		System.out.println(isAnagrams(s1, s2));
		sc.close();
	}

}
