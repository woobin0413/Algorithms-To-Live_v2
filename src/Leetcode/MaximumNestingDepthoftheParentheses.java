package Leetcode;

public class MaximumNestingDepthoftheParentheses {
	public static int maxDepth(String s) {
		int res = 0, cnt = 0;
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') {
				res = Math.max(res, ++cnt);
			}
			if(s.charAt(i) == ')') {
				cnt--;
			}
		}
		
		
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
	}

}
