package roman;

import java.util.HashMap;
import java.util.Map;

public class FindIntegerOfRomanFunction {
	public int romanToInt(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}

		Map<Character, Integer> map = new HashMap();

		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		// Result always start from the last character of the string,
		// if there is only 1 symbol, it will just return result
		int result = map.get(s.charAt(s.length() - 1));

		// Read from right to left, using length -2 since result is already the
		// last element
		for (int i = s.length() - 2; i >= 0; i--) {
			// if current is bigger or equal to next character
			if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
				// Then add it to the result
				result += map.get(s.charAt(i));
			} else { // if current is less than the next character
				// Then delete from result
				result -= map.get(s.charAt(i));
			}
		}

		return result;
	}
}
