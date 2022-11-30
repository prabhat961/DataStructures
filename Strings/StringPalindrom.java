package Strings;

public class StringPalindrom {
	public static boolean isPalindrom(String str) {
		str = str.toLowerCase();
		if(str.length() <= 1)
			return false;
		for(int i = 0; i < str.length()/2; i++) {
			int start = str.charAt(i);
			int end = str.charAt(str.length() - 1 - i);
			
			if(start != end)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String str = "Malayalam";
        System.out.println("The given String is palindrome:"+isPalindrom(str));

	}

}
