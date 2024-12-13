package sebi.previous.y2022;

import java.util.*;

public class RemoveDuplicateWords {
	
	public static String removeDuplicateWords(String s) {
		int l = s.length();
		
		String[] strArray = s.split(" ");
		
		Set<String> set = new LinkedHashSet<>();
		
		for(int i = 0; i < strArray.length; i++) {
			set.add(strArray[i]);
		}
		
		String ans = "";
		
		int index = 0;
		for(String str : set) {
			ans+=str;
			
			
			if(index != set.size() - 1)
				ans+=" ";
			index++;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(removeDuplicateWords(s));
	}

}
