package Leetcode;

public class RunningSumof1dArray {
	public int[] runningSum(int[] nums) {
//		int[] res = new int[nums.length];
//		int sum = 0;
//		for (int i = 0; i < nums.length; i++) {
//			sum += nums[i];
//			res[i] = sum;
//		}
//		return res;
		
		for (int i = 1; i < nums.length; ++i) {
	        nums[i] += nums[i - 1];
	    }
	    return nums;
	}
}
