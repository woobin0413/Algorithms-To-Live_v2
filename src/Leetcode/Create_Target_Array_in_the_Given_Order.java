package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Create_Target_Array_in_the_Given_Order {
	public static void createTargetArray(int[] nums, int[] index) {
		
		List<Integer> result = new ArrayList<>();
		
		for (int i = 0; i < nums.length; i++) {
			result.add(index[i], nums[i]);
		}
		int[] res = new int[nums.length]; // convert list to array
        for (int i = 0; i < index.length; i++) res[i] = result.get(i);
		
        System.out.println(Arrays.toString(res));
	}
	
	public static void main(String[] args) {
		int[] nums = new int[] {0,1,2,3,4};
		int[] index = new int[] {0,1,2,2,1};
		
		createTargetArray(nums,index);
		//[0,4,1,3,2]
	}
}
