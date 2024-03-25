package ntu.linh63132961;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;

public class biendoiND {

	private JFrame frmPhpBini;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					biendoiND window = new biendoiND();
					window.frmPhpBini.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public biendoiND() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPhpBini = new JFrame();
		frmPhpBini.setTitle("Phép biến đổi cơ bản");
		frmPhpBini.setBounds(100, 100, 450, 300);
		frmPhpBini.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPhpBini.getContentPane().setLayout(null);
	}
}
