package strings;

import java.util.*;

public class Equal012 {

	public static long getSubstringWithEqual012(String str) {
		int n = str.length();
		
		List<String>  list = new ArrayList<>();
		
		//Generating all Substrings
		for(int i = 0; i < n; i++) {
			
			for(int j = i; j < n; j++) {
				String s1 = "";
				for(int k = i; k <= j; k++) {
					s1+= str.charAt(k);
				}
				list.add(s1);
			}
		}
		
		//System.out.println(list);
		
		int equalcount = 0;
		int oneCount , twoCount , zeroCount ;
		
		for(int i = 0; i < list.size(); i++) {
			oneCount = 0;
			twoCount = 0;
			zeroCount = 0;
			String currString = list.get(i);
			
			for(int j = 0; j < currString.length(); j++) {
				if(currString.charAt(j) == '1') oneCount++;
				if(currString.charAt(j) == '2') twoCount++;
				if(currString.charAt(j) == '0') zeroCount++;
			}
			
			if(oneCount == twoCount && twoCount == zeroCount) {
				equalcount++;
			}
				
		}
		
		return equalcount;
	}

	public static void main(String[] args) {
		System.out.println(getSubstringWithEqual012("102100211"));
	}

}
