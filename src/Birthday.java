import javax.swing.JOptionPane;

public class Birthday {
	public static void main (String[] args) {
		String birthday = JOptionPane.showInputDialog("What's your birthday");
		String today = "06/16";
		if (birthday == today) {
			JOptionPane.showMessageDialog(null, "Happy Birthday!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Happy Unbirthday");
		}
		
	}
}

