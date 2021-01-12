package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Max_Number_of_K_Sum_Pairs {

	public static int maxOperations(int[] nums, int k) {
//
//		Arrays.sort(nums);
//		
//		int result=0,i=0,j=nums.length-1;
//		
//		while(i<j) {
//			if(nums[i]+nums[j]<k) i++;
//			else if(nums[i]+nums[j]>k) j--;
//			else {i++;j--;result++;}
		HashMap<Integer, Integer> map = new HashMap<>();
		int result = 0;
		Arrays.sort(nums);
		if (nums.length <= 1) {
			return 0;
		}

		for (int i : nums) {
			// getOrDefault => if i exist in the map, return value, otherwise put 0 as a
			// default value
			if (map.getOrDefault(k - i, 0) > 0) {
				map.put(k - i, map.get(k - i) - 1);
				result++;
			} else {
				map.put(i, map.getOrDefault(i, 0) + 1);
			}

		}
		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] { 3, 1, 3, 4, 3 };
		maxOperations(nums, 5);
	}

}
