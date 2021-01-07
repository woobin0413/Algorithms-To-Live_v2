package Leetcode;

public class Running_Sum_of_1d_Array {
	public int[] runningSum(int[] nums) {
//		int[] intArray = new int[nums.length];
//		int sum = 0;
//		for (int i = 0; i < nums.length; i++) {
//
//			sum += nums[i];
//			intArray[i] = sum;
//
//		}
//		
//		for (int i : intArray) {
//			System.out.println(i);
//		}
//		return intArray;
		
		int i = 1;
		
		while (i<nums.length) {
			nums[i] += nums[i-1];
			i++;
		}
		return nums;
	}
	
	public static void main(String[] args) {
		 int[] arr = new int[] {3,1,2,10,1};
		 Running_Sum_of_1d_Array method1 = new Running_Sum_of_1d_Array();
		 
		 method1.runningSum(arr); 
	}
}
