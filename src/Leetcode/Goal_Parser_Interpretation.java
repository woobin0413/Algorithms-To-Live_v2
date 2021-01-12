package Leetcode;

public class Goal_Parser_Interpretation {

	public static void interpret(String command) {
		String newCommand = "";
				
		newCommand = command.replace("()", "o").replace("(al)", "al");
				

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interpret("G()()()()(al)");
	}

}
