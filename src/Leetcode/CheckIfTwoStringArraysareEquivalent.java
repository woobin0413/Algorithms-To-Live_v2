package Leetcode;


public class CheckIfTwoStringArraysareEquivalent {
	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		
//		String a="",b="";
//		
//		for (String str : word1) {
//			a+= str;
//		}
//		for (String str : word2) {
//			b+= str;
//		}
//		
		
//		System.out.println((String.join("",  word1)).equals(String.join("",  word2)));
		
		int index1=0,index2=0,arrIdx1=0,arrIdx2=0;
		
		while(arrIdx1<word1.length && arrIdx2<word2.length) {
			if(word1[arrIdx1].charAt(index1) != word2[arrIdx2].charAt(index2)) return false;
			if(index1 == word1[arrIdx1].length()-1) {
				index1 = 0;
				arrIdx1 ++;
			} else {
				index1++;
			} if(index2 == word2[arrIdx2].length()-1) {
				index2 = 0;
				arrIdx2 ++;
			} else {
				index2++;
			}
			
		}
		
		return arrIdx1 == word1.length && arrIdx2 == word2.length;
	}

	public static void main(String[] args) {
		String[] word1 = new String[] {"a", "cb"};
		String[] word2 = new String[] {"ab", "c"};
		
		arrayStringsAreEqual(word1,word2);
	}
}
