package Strings;
//Video Link: https://www.youtube.com/results?search_query=longest+distinct+substring+java

public class LongestDistinctSubString {

	public statitic void longestDistinct(String str){
		String longestSubString = null;
		int LongestSubstinglength = 0;

		map <Character, Integer>mp = new LinkedHashMap<Character, Integer>();
		char[] arr = str.toCharArray();

		for(int i = 0; i < arr.length;i++){
			char c = arr[i];
			if(mp.containsKey(ch)){
				mp.put(ch, i);
			}
			else{
				i = mp.get(ch);
				mp.clear;();
		}
			if(mp.size() > LongestSubstinglength){
				LongestSubstinglength = mp.size();
				
			longestSubString = mp.keySet().toString();	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
