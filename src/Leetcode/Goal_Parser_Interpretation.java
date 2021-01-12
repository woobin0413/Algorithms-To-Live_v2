package Leetcode;

public class Goal_Parser_Interpretation {

	public static String interpret(String command) {
		String newCommand = "";
				
		newCommand = command.replace("()", "o").replace("(al)", "al");
				
		return newCommand;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interpret("G()()()()(al)");
	}

}
