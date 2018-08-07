import javax.swing.JOptionPane;

public class UnBirthday5 {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("When is your birthday? (month/day)");
		if (answer.equals("8/7")) {
			JOptionPane.showMessageDialog(null, "Have a happy birthday!");

		} else {
			JOptionPane.showMessageDialog(null, "Have a very merry UNbirthday!");
		}
	}

}
