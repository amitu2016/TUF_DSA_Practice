package strings;

import java.util.*;
public class KAnagrams {
	
	public static boolean areKAnagrams(String s1, String s2, int k) {
        int l1 = s1.length();
        int l2 = s2.length();
        
        if(l1 != l2) return false;
        
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < l1; i++) {
        	//For storing the frequency of each character
        	map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }
        
        for(int i = 0; i < l2; i++) {
        	if(map.containsKey(s2.charAt(i)) && map.get(s2.charAt(i)) > 0) {
        		//For decrementing the frequency of each character if found
            	map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0) - 1);
        	}
        }
        
        int count = 0;
        
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
        	count += entry.getValue();
        }
        
        return count <= k;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		int k = sc.nextInt();
		
		System.out.println(areKAnagrams(s1, s2, k));

	}

}
