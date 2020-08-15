//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String first = JOptionPane.showInputDialog("What is greater than God, more evil than the devil, the poor have it, the rich need it, and if you eat it, you'll die?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(first.equals("nothing")) {
			System.out.println("Correct!");
			score++;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
			System.out.println("Wrong!");
		}
		
		// 6. Add some more riddles
		String second = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
		if(second.equals("stamp")) {
			System.out.println("Correct!");
			score++;
		}
		else {
			System.out.println("Wrong!");
		}
		
		String third = JOptionPane.showInputDialog("I'm tall when I'm young and I'm short when I'm old. What am I?");
		if(third.equals("candle")) {
			System.out.println("Correct!");
			score++;
		}
		else {
			System.out.println("Wrong!");
		}
		
		String fourth = JOptionPane.showInputDialog("If you have me, you want to share me. If you share me, you haven't got me. What am I?");
		if(fourth.equals("secret")) {
			System.out.println("Correct!");
			score++;
		}
		else {
			System.out.println("Wrong!");
		}
		// 2. Make a pop up to show the score.
		System.out.println("Your final score is " + score);
	
}
}
