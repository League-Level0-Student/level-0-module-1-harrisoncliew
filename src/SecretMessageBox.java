import javax.swing.JOptionPane;

public class SecretMessageBox {
	public static void main(String[] args) {

		String password = ("Ruhmit");
		String answer = JOptionPane.showInputDialog("Give me a secret message!");
		String cool = JOptionPane
				.showInputDialog("You can only know the secret messsage if you guess the password below correctly.");
		if (cool.equals("Ruhmit")) {
			JOptionPane.showMessageDialog(null, answer);

		} else {
			JOptionPane.showMessageDialog(null, "INTRUDER!!!!!!!!!");

		}

	}
}
