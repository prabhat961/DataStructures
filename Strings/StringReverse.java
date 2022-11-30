package Strings;

public class StringReverse {
	
	public static void reverse(String str) {
		String rev = " ";
		for( int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev.toString());
	}

	public static void main(String[] args) {
		String name = "chitra";
		reverse(name);

	}

}
