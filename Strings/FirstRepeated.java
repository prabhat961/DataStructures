package Strings;
//Problem Statement:Given a string, find the first repeated character in it. We need to find the
//character that occurs more than once and whose index of second occurrence is smallest.

import java.util.HashSet;

public class FirstRepeated {
	public static char firstRepeater(char[] str) {
		HashSet<Character>h = new HashSet<>();
		for( int i = 0; i <= str.length -1; i++) {
			//char c = str[i];
		if(h.contains(str[i]))
			return str[i];
		else
			h.add(str[i]);
		}
		return '\0';
	}
	//Time Complexity: O(n)

	public static void main(String[] args) {

        String str = "geeksforgeeks";
        char[] arr = str.toCharArray();
        System.out.println(firstRepeater(arr));

	}

}
