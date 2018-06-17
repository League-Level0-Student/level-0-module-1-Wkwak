import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {
		String answer1 = "needle";
		
		// 1. Make a variable to hold the score
		int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
			String attempt1 = JOptionPane.showInputDialog("What has an eye but can not see?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
			if (attempt1.equals(attempt1)) {
				JOptionPane.showMessageDialog(null, "Correct!");
				score++;
			}
		// 5. Otherwise, say "wrong" and tell them the answer
			if (attempt1 != answer1) {
				JOptionPane.showMessageDialog(null, "wrong, the answer is a needle");
			}
		// 6. Add some more riddles
			
		// 2. Make a pop up to show the score.
		
	}
}

