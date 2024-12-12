package strings;

import java.util.*;
public class IsomorphicStrings {
	
	public static boolean areIsomorphic(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        
        if(l1 != l2) return false;
        
        Map<Character, Character> map = new HashMap<>();
        
        for(int i = 0; i < l1; i++) {
        	char original = s1.charAt(i);
        	char replacement = s2.charAt(i);
        	
        	if(!map.containsKey(original)) {
        		if(!map.containsValue(replacement)) {
        			map.put(original, replacement);
        		}else {
        			return false;
        		}
        	}else {
        		char mappedCharacter = map.get(original);
        		if(mappedCharacter != replacement)
        			return false;
        	}
        }
        
        return true;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		//yktbvpmxnuo
		//murlidsaris
		
		System.out.println(areIsomorphic(s1, s2));
	}

}
