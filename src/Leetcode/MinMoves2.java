package Leetcode;

import java.util.Arrays;

public class MinMoves2 {

	public int minMovesMethod(int[] nums) {

		Arrays.sort(nums);
		int i = 0, j = nums.length - 1;
		int count = 0;
		
		while (i < j) {
			count += nums[j] - nums[i];
			i++;
			j--;
		}
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinMoves2 m2 = new MinMoves2();
		int[] test = new int[] { 1, 2, 3 };
		System.out.println(m2.minMovesMethod(test));
	}

}
