package strings;

public class CountAndSay {

	public static String countAndSay(int n) {
		if(n == 1) return "1";
		
		String prev = countAndSay(n - 1);
		
		int len = prev.length();
		
		String ans = "";
		
		int count = 1;
		
		for(int i = 1; i< len; i++) {
			
			if(prev.charAt(i) == prev.charAt(i - 1))
				count++;
			else {
				ans += (char) ('0' + count);
				ans += prev.charAt(i - 1);
				count = 1;
			}
		}
		
		ans += (char) ('0' + count);
		ans += prev.charAt(len - 1);
		
		return ans;
	}

	public static void main(String[] args) {
		String ans = countAndSay(4);
		System.out.println(ans);
	}

}
