package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRoman {
	
	//https://webrewrite.com/convert-integer-to-roman-numeral/
	
	public static String integerToRoman(int num) {
		
		/*
	       Create a map of Roman numerals and it's corresponding 
	       integer value. Also include it's subtractive cases.
	 
	       LinkedHashMap is used to maintain insertion order.
	      */
	        Map<String, Integer> mp = new LinkedHashMap<>();
	        mp.put("M", 1000);
	        mp.put("CM",900);
	        mp.put("D", 500);
	        mp.put("CD", 400);
	        mp.put("C", 100);
	        mp.put("XC", 90);
	        mp.put("L", 50);
	        mp.put("XL", 40);
	        mp.put("X", 10);      
	        mp.put("IX", 9);
	        mp.put("V", 5);
	        mp.put("IV", 4);
	        mp.put("I", 1);
	        
	        StringBuilder sb = new StringBuilder();
	        
	        for(Map.Entry<String, Integer> entry : mp.entrySet()) {
	        
	        	while(num >= entry.getValue()) {
	        		num -= entry.getValue();
	        		sb.append(entry.getKey());
	        	}
	        }
		
		return sb.toString();
		
	}

	public static void main(String[] args) {
		System.out.println(integerToRoman(45));
	}

}
