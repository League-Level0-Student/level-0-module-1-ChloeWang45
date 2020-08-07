package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	
	String birthday = JOptionPane.showInputDialog("When is your birthday? (Format: MM/DD)");
	if(birthday.equals("08/07")) {
		System.out.println("Happy birthday!");
	}
	else {
		System.out.println("Have a very merry UNbirthday!");
	}
}
}
