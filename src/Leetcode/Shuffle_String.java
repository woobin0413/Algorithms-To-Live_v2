package Leetcode;


public class Shuffle_String {

	public static void restoreString(String s, int[] indices) {
//	    TreeMap<Integer,Character> map =new TreeMap<Integer,Character>();
//		
//		if(s.length() != indices.length) {
//			return "";
//		}
//		
//		for (int i = 0; i < indices.length; i++) {
//			map.put(indices[i], s.charAt(i));
//		}
//		String result = "";
//		for (int i = 0; i < indices.length; i++) {
//			result += map.get(i);
//		}
//		
//		return result;
		
		char[] charArray = new char[s.length()];
		for(int i = 0; i < indices.length; i++) {
			int pos = indices[i];
			charArray[pos] = s.charAt(i);
			
		}
		System.out.println(String.valueOf(charArray));
		
	}

	public static void main(String[] args) {
		String s = "codeleet";
		int[] indices = new int[] { 4, 5, 6, 7, 0, 2, 1, 3 };
		restoreString(s,indices);
	}
}
