package Leetcode;


public class Richest_Customer_Wealth {
	public int maximumWealth(int[][] accounts) {
		int res = 0;
		for (int i = 0; i < accounts.length; i++) {
			int sum = 0;
			for (int j = 0; j < accounts[i].length; j++) {
				sum += accounts[i][j];
			}
			res = Math.max(res, sum);
		}

		// stream => for loop 처럼 streaming for each
		// maptoint => array 에서 int로 변형시켜 하나하나 loop을 돌린다
		// i 는 array안에있는 integer중 하나
		// return Arrays.stream(accounts).mapToInt(i ->
		// Arrays.stream(i).sum()).max().getAsInt();
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
