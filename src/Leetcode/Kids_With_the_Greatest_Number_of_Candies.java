package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Kids_With_the_Greatest_Number_of_Candies {

	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//		List<Boolean> result = new LinkedList<Boolean>();
//		int[] copyArr = Arrays.copyOf(candies, candies.length);
//		
//		// create a new list to avoid modification
//		// in the original list
//
//		Arrays.sort(copyArr);
//		int max = copyArr[copyArr.length];
//
//		for (int i = 0; i < candies.length; i++) {
//
//			if (max <= candies[i]+extraCandies) {
//				result.add(true);
//
//			} else {
//				result.add(false);
//			}
//		}
		
		List<Boolean> result = new ArrayList<>(candies.length);
		int max = 0;
	    for (int i = 0; i < candies.length; ++i) {
	    	max = Math.max(max, candies[i]);
	    }
	    for (int i = 0; i < candies.length; ++i) {
	        result.add(candies[i] + extraCandies >= max);
	    }
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
