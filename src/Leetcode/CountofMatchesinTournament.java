package Leetcode;

public class CountofMatchesinTournament {
	public static int numberOfMatches(int n) {
		int result = 0;

		while (n > 1) {
			if (n % 2 == 0) {
				result = result + n / 2;

			} else {
				n = n - 1;
				result = result + n / 2 + 1;
			}
			n = n / 2;

		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberOfMatches(8);
	}

}
