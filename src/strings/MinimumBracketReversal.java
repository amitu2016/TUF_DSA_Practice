package strings;

public class MinimumBracketReversal {

	public static int countRev(String s) {

		int n = s.length();

		if (n % 2 != 0)
			return -1;

		int open = 0, close = 0;

		// Find out number of unbalanced brackets
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '(') {
				open++;
			} else {
				if (open > 0) {
					open--;
				} else {
					close++;
				}
			}
		}

		// Calculate the minimum bracket reversal required
		return (open / 2) + (open % 2) + (close / 2) + (close % 2);

	}

	public static void main(String[] args) {
		String s = "(()((()(())((";
		System.out.println(countRev(s));
	}

}
