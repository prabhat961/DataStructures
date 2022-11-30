package Strings;

public class Occurance {
	public static void printOccurance(String a) {
		 for (char ch = 'a';ch <= 'z';ch++){
	            int count = 0;
	            for( int i = 0; i <= a.length() - 1;i++){
	                if (a.charAt(i) == ch)
	                    count++;
	            }
	            if (count != 0)
	                System.out.println(ch + " "+count);
	        }
	}

	public static void main(String[] args) {
		String name = "prabhat";
		printOccurance(name);

	}

}
