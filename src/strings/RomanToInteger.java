package strings;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static int romanToInteger(String s) {

		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int res = 0;

		for (int i = 0; i < s.length(); i++) {

			Character curr = s.charAt(i);

			if (i + 1 < s.length()) {

				Character next = s.charAt(i + 1);

				if (map.get(curr) < map.get(next)) {
					res += (map.get(next) - map.get(curr));
					i++;
				} else {
					res += map.get(curr);
				}
			} else {
				res += map.get(curr);
			}
		}

		return res;

	}

	public static void main(String[] args) {
		System.out.println(romanToInteger("MCMIV"));
	}

}
