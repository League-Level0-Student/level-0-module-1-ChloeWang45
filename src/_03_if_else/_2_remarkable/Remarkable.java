package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
	String a = "Alex is a very competitive in sports.";
	String b = "Bella is very smart and good at solving mysteries.";
	String c = "Connor is very kind and generous.";
	String d = "Dora is very humorous and great at making jokes.";
		// 2. Ask the user to enter a name. Store their answer in a variable.
	String name = JOptionPane.showInputDialog("Enter a name. Choose from Alex, Bella, Connor, and Dora.");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
	if(name.equals("Alex")) {
		System.out.println(a);
	}
	else if(name.equals("Bella")) {
		System.out.println(b);
	}
	else if(name.equals("Connor")) {
		System.out.println(c);
	}
	else if(name.equals("Dora")) {
		System.out.println(d);
	}
}
}

