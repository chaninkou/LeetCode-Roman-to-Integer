package roman;

public class Main {
	public static void main(String[] args) {
		String s = "XXVII";
		
		System.out.println("Input: " + s);
		
		FindIntegerOfRomanFunction solution = new FindIntegerOfRomanFunction();
		
		System.out.println("Solution: " + solution.romanToInt(s));
	}
}
