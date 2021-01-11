package Leetcode;

public class NumberofGoodPairs {

	public static int numIdenticalPairs(int[] nums) {
//		int result = 0;
//		int j = 1, i = 0;
//
//		while (i < nums.length && j < nums.length) {
//			if (nums[i] == nums[j]) {
//				result++;
//				System.out.println(nums[i] + ", " + nums[j]);
//			}
//			
//
//			if (j == nums.length - 1) {
//				j = i + 1;
//				i++;
//			}
//			j++;
//		}
//		System.out.println(result);
//		return result;

		int res = 0, count[] = new int[101];

		for (int a : nums) {
			res += count[a]++;
			System.out.println(res + "," + count[a]);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 1, 2, 3, 1, 1, 3 };
		numIdenticalPairs(arr);
	}

}
