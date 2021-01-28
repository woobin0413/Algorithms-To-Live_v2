package Leetcode;

public class FindtheHighestAltitude {

	 public int largestAltitude(int[] gain) {
	        int result=0;
	        int curr=0;
	        for(int i=0;i<gain.length;i++){
	            curr+=gain[i]; 
	            result=Math.max(curr, result);
	        }
	        return result;
	    }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
