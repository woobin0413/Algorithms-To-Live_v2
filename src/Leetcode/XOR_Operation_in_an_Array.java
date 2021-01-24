package Leetcode;

public class XOR_Operation_in_an_Array {
	public static void xorOperation(int n, int start) {

		int res = 0;
		
		for (int i = 0; i < n; i++) {
		
			res = start + 2*i ^ res;
			
			
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xorOperation(1,7);
	}

}
