package _04_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {

		String answer = JOptionPane.showInputDialog("Are you happy?");

		if (answer.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever your doing!");
		}

		else {
			answer = JOptionPane.showInputDialog("Do you want to be happy?");
			if (answer.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");

			} else if (answer.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever your doing!");
			}

			else {
				JOptionPane.showMessageDialog(null, "Please answer yes or no!");
			}
		}
	}
}
