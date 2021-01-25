package Leetcode;

import java.util.Arrays;

public class CheckIfTwoStringArraysareEquivalent {
	public static void arrayStringsAreEqual(String[] word1, String[] word2) {
		
//		String a="",b="";
//		
//		for (String str : word1) {
//			a+= str;
//		}
//		for (String str : word2) {
//			b+= str;
//		}
//		
		
		System.out.println((String.join("",  word1)).equals(String.join("",  word2)));
	}

	public static void main(String[] args) {
		String[] word1 = new String[] {"a", "cb"};
		String[] word2 = new String[] {"ab", "c"};
		
		arrayStringsAreEqual(word1,word2);
	}
}
