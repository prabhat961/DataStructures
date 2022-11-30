package Strings;

public class FindDuplicates {
	
	@SuppressWarnings("unused")
	public static void printDuplicates(String str) {
		char[] word = str.toCharArray();
		int count = 0;
		for( int i = 0; i < word.length; i++) {
			for(int j = i + 1; j < word.length; j++) {
				if(word[i] == word[j]) {
					System.out.print(word[i]+" ");
					count++;
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		String str =  "poojapapa";
        printDuplicates(str);

	}

}
