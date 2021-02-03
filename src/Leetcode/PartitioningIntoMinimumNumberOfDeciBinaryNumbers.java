package Leetcode;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {

	public static int minPartitions(String n) {

//			int tmp = Character.getNumericValue(n.charAt(i));
		int result = 0;

		int i = 0;

		while (i<5) {
			String tmp = Integer.toBinaryString(i);
			System.out.println(tmp);
			result += Integer.valueOf(tmp);
			System.out.println(result);
			
			if (n.equals(String.valueOf(result))) {
				return i;
			}
			i++;
		}
		return i;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		minPartitions("32");
	}

}
