package Leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Count_the_Number_of_Consistent_Strings {

	public static void countConsistentStrings(String allowed, String[] words) {
		int result = 0;
		HashSet<Character> allowedLetters = new HashSet<>(); // added Set to search in O(1)

		for(char letter : allowed.toCharArray())
		{
			allowedLetters.add(letter);
		}
		
		for (String word : words) {
			for (int i = 0; i < word.length(); i++) {
				if(!allowedLetters.contains(word.charAt(i))) {
					break;
				}
				if(i==word.length()-1) {
					result++;
				}
				
			}
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = new String[] { "ad", "bd", "aaab", "baa", "badab" };

		countConsistentStrings("ab", str);

	}

}
