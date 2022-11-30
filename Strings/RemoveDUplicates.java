package Strings;

import java.util.HashSet;

public class RemoveDUplicates {
	//Approach 1:
	public static void duplicateRemoval(String str) {
		HashSet<Character>h = new HashSet<>();
		for(int i = 0; i <= str.length() -1; i++) {
			h.add(str.charAt(i));
		}
		for(char ch:h) {
			System.out.print(ch+ " ");
		}
	}
	
	//Approach 2:
	public static String RemDup(String str) {
		String newStr = " ";
		for(int i = 0 ; i <= str.length() - 1; i++) {
			char c = str.charAt(i);
			if(newStr.indexOf(c) == -1) {
				newStr = newStr + c;
			}
		}
		return newStr;
	}

	public static void main(String[] args) {
		String str = "geekforgeeks";
		//duplicateRemoval(str);
		System.out.println("New String is:"+RemDup(str));
	}

}
