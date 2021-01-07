package Leetcode;

import java.util.Iterator;

public class Palindrome {
	public boolean isPalindrome(int x) {
//		if (x < 0 || String.valueOf(x).substring(String.valueOf(x).length() - 1) == "0") {
//			return false;
//		}
//
//		if (x == 0) {
//			return true;
//		} else {
//
//			String str = String.valueOf(x);
//			String str_new = "";
//			//System.out.println(str);
//
//			for (int i = str.length() - 1; i >= 0; i--) {
//				str_new += str.charAt(i);
//
//			}
//		//	System.out.println(str_new);
//			return (str.equals(str_new)) ? true : false;
//
//		}
		
		if(x<0 || (x!=0 && x%10 == 0)) return false;
		int y = x;
        int res = 0;
        while(y != 0) {
            res = res * 10 + y % 10;
            y /= 10;
        }
        return x == res;
		
	}

	public static void main(String[] args) {
		Palindrome p = new Palindrome();

		System.out.println(p.isPalindrome(121));
		System.out.println(p.isPalindrome(-121));
		System.out.println(p.isPalindrome(10));
		System.out.println(p.isPalindrome(-101));
	}
}
