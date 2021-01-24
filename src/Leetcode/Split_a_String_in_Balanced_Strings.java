package Leetcode;

public class Split_a_String_in_Balanced_Strings {

	public static void balancedStringSplit(String s) {
		
		int result = 0, cnt = 0;
		
		for (int i = 0; i < s.length(); i++) {
			cnt += s.charAt(i) == 'L' ? 1 : -1;
			if (cnt == 0) result++;
			
		}
		
		System.out.println(result);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		balancedStringSplit("RLRRRLLRLL");
	}

}
