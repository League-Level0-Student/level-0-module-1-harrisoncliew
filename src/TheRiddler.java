import javax.swing.JOptionPane;

public class TheRiddler {
	public static void main(String[] args) {
		int score = 0;
		String answer = JOptionPane
				.showInputDialog("Solve this riddle: What loses its head during the day and gets it back at night?");
		if (answer.equals("a pillow")) {
			JOptionPane.showMessageDialog(null, "YOU ARE FINALLY RIGHT!!!!!!!!!!!!!");
			score++;
			JOptionPane.showMessageDialog(null, "Your score is 1!");
		} else {
			JOptionPane.showMessageDialog(null, "WRONG! The answer is a pillow!");

		}
		String riddle = JOptionPane.showInputDialog("Solve this riddle: Who is a good java programmer? ");
		if (riddle.equals("Aidan")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
			JOptionPane.showMessageDialog(null, "Your score is 2!");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong the correct answer is Aidan.");
		}
		String cool = JOptionPane.showInputDialog(
				"Solve this riddle: What thing do you throw away the outside, cook the inside, then  eat the outside and throw away the inside. ");
		if (cool.equals("corn")) {
			JOptionPane.showMessageDialog(null, "YOU ARE FINALLY RIGHT!!!!!!!!!!!!!");
			score++;
			JOptionPane.showMessageDialog(null, "Your score is 3!");
		} else {
			JOptionPane.showMessageDialog(null, "WRONG! The answer is corn.");
		}
	}
}
