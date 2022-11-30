package Strings;

import java.util.Arrays;

public class StringAnagram {
	public static boolean areAnagram(char[] str1, char[] str2) {
		int m = str1 .length;
		int n = str2.length;
		if(m != n)
			return false;
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		for ( int i = 0; i < m; i ++)
			if(str1[i] != str2[i])
				return false;
		
		return true;
	}

	public static void main(String[] args) {
		char[] str1 = { 't', 'e', 's', 't' };
        char[] str2 = { 't', 't', 'e', 'w' };

        // Function Call
        if (areAnagram(str1, str2))
            System.out.println("The two strings are"
                    + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");

	}

}
