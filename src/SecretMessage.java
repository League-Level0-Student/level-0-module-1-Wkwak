import javax.swing.JOptionPane;

public class SecretMessage {

	public static void main (String[] args) {
		String password = "Password";
		String message = JOptionPane.showInputDialog("Set a secret message");
		String attempt = JOptionPane.showInputDialog("Do you know the password?");
		
		if (attempt.equals(password)) {
			JOptionPane.showMessageDialog(null, "pretty good the secret message is" + message);
		}
		else {
			JOptionPane.showMessageDialog(null, "Keep on trying it's not like this computer will lock down");
		}
	}
}
