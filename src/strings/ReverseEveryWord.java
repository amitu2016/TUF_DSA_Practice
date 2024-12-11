package strings;

import java.util.ArrayList;
import java.util.List;

public class ReverseEveryWord {
	
	public static String reverseEveryWord(String s) {
		int n = s.length();
		
		List<String> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			while(i < n) {
				
				while(i < n && s.charAt(i) == ' ') i++;
					if(i >= n) break;
					int start = i;
					
				while(i < n && s.charAt(i) != ' ') i++;
					int end = i - 1;
					
				list.add(s.substring(start, end + 1));		
			}
		
			
		}
		
		//System.out.println(list);
		
		String ans = "";
		
		for(int i = list.size() - 1; i >= 0; i--) {
			ans += list.get(i);
			
			if(i > 0)
				ans+=" ";
		}
		
		return ans;
	}

	public static void main(String[] args) {
		String s = " Welcome to CDAC ";
		
		System.out.println(reverseEveryWord(s));

	}

}
