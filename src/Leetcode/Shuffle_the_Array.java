package Leetcode;

import java.util.Iterator;

public class Shuffle_the_Array {

	public int[] shuffle(int[] nums, int n) {
		
//		
//		int newNumArr [] = new int[nums.length];
//		int count = 0;
//		int shuffCount = n;
//		
//		
//		for (int i = 0; i < nums.length; i=i+2) {
//			newNumArr[i] = nums[count];
//			newNumArr[i+1] = nums[shuffCount];
//			
//			count++;
//			shuffCount++;
//		}
//		
//		return newNumArr;
//		
//		
		int[] res = new int[2*n];
		for(int i = 0; i < n; i++){
		   res[2 * i] = nums[i]; //even
		   res[2 * i + 1] = nums[n+i]; //odd
		}
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums [] = new int[]{2,5,1,3,4,7};
		Shuffle_the_Array s1 = new Shuffle_the_Array();
		s1.shuffle(nums, 3);
		System.out.println(5/2);
	}

}
