package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Create_Target_Array_in_the_Given_Order {
	public static void createTargetArray(int[] nums, int[] index) {
		
//		List<Integer> result = new ArrayList<>();
//		
//		for (int i = 0; i < nums.length; i++) {
//			result.add(index[i], nums[i]);
//		}
//		int[] res = new int[nums.length]; // convert list to array
//        for (int i = 0; i < index.length; i++) res[i] = result.get(i);
//		
//        System.out.println(Arrays.toString(res));
		 int n = nums.length;
	        int[] a = new int[n];
	        for(int i = 0; i < n; ++i) {
	            a[i] = i;
	        }
	        helper(a, 0, n, index, new int[n]);
	        int[] result = new int[n];
	        for(int i = 0; i < n; ++i) {
	            result[index[i]] = nums[i];
	        }
	    
	}
	
	static void helper(int[] a, int i, int j, int[] index, int[] tmp) {
        if (j - i <= 1) {
            return;
        }
        int k = (i + j) >>> 1;
        helper(a, i, k, index, tmp);
        helper(a, k, j, index, tmp);
        int x = i;
        int y = k;
        int z = 0;
        int count = 0;
        while(x < k && y < j) {
            while(y < j && index[a[y]] <= index[a[x]] + count) {
                ++count;
                tmp[z++] = a[y++];
            }
            index[a[x]] += count;
            tmp[z++] = a[x++];
        }
        while(x < k) {
            index[a[x]] += count;
            tmp[z++] = a[x++];
        }
        while(y < j) {
            tmp[z++] = a[y++];
        }
        for(int p = i, q = 0; p < j; ++p, ++q) {
            a[p] = tmp[q];
        }
    }
	
	
	public static void main(String[] args) {
		int[] nums = new int[] {0,1,2,3,4};
		int[] index = new int[] {0,1,2,2,1};
		
		createTargetArray(nums,index);
		//[0,4,1,3,2]
	}
}
