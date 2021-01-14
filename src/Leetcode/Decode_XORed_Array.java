package Leetcode;

public class Decode_XORed_Array {

	public int[] decode(int[] encoded, int first) {
		int n = encoded.length, res[] = new int[n + 1];
		res[0] = first;
		for (int i = 0; i < n; ++i)
			res[i + 1] = res[i] ^ encoded[i];
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(2^33);
	}

}
