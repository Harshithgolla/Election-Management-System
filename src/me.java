import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;

public class me {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					me window = new me();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public me() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1001, 597);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItem("Add Candidate");
		comboBox.addItem("View Candidate");
		comboBox.addItem("Update Candidate");
		comboBox.setSelectedItem(null);
		comboBox.setBounds(244, 194, 206, 37);
		frame.getContentPane().add(comboBox);
	}

}
