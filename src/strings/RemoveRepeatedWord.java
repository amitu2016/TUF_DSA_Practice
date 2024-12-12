package strings;

import java.util.*;

public class RemoveRepeatedWord {
	
	public static String removeRepeatedWord(String str) {
		String[] strArray = new String[str.length()];
		
		strArray = str.split(" ");
		
		//Linked Hashset because we want to maintain insertion order
		Set<String> set = new LinkedHashSet<>();
		
		for(int i = 0; i < strArray.length; i++) {
			set.add(strArray[i]);
		}
		
		String ans = "";
		
		int index = 0;
		for(String s : set) {
			ans+=s;
			if(index != set.size() - 1)
				ans+=" ";
			index++;
		}
		
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(removeRepeatedWord("Publish your own articles on GeeksforGeeks and share your knowledge with the world"));
	}

}
