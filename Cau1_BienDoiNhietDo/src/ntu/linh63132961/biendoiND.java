package ntu.linh63132961;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class biendoiND {

	private JFrame frmPhpBini;
	private JTextField txtC;
	private JTextField txtKq;

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
		frmPhpBini.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		frmPhpBini.setTitle("Phép biến đổi cơ bản");
		frmPhpBini.setBounds(100, 100, 450, 300);
		frmPhpBini.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPhpBini.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập độ :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(41, 39, 87, 30);
		frmPhpBini.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Kết quả:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(41, 80, 87, 30);
		frmPhpBini.getContentPane().add(lblNewLabel_1);
		
		txtC = new JTextField();
		txtC.setBackground(Color.WHITE);
		txtC.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtC.setBounds(138, 40, 234, 30);
		frmPhpBini.getContentPane().add(txtC);
		txtC.setColumns(10);
		
		txtKq = new JTextField();
		txtKq.setForeground(Color.RED);
		txtKq.setBackground(Color.WHITE);
		txtKq.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtKq.setEditable(false);
		txtKq.setColumns(10);
		txtKq.setBounds(138, 81, 234, 30);
		frmPhpBini.getContentPane().add(txtKq);
		
		JButton btnF = new JButton("C -> F");
		btnF.setBackground(Color.GREEN);
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code xử lý độ F
				xuLyDoF();
			}
		});
		btnF.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnF.setBounds(41, 148, 107, 30);
		frmPhpBini.getContentPane().add(btnF);
		
		JButton btnK = new JButton("C -> K");
		btnK.setBackground(Color.GREEN);
		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xuLyDoK();
			}
		});
		btnK.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnK.setBounds(169, 148, 107, 30);
		frmPhpBini.getContentPane().add(btnK);
		
		JButton btnFC = new JButton("F -> C");
		btnFC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xuLyDoFC();
			}
		});
		btnFC.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnFC.setBackground(Color.GREEN);
		btnFC.setBounds(41, 189, 107, 30);
		frmPhpBini.getContentPane().add(btnFC);
		
		JButton btnFK = new JButton("F -> K");
		btnFK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xuLyDoFK();
			}
		});
		btnFK.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnFK.setBackground(Color.GREEN);
		btnFK.setBounds(169, 189, 107, 30);
		frmPhpBini.getContentPane().add(btnFK);
		
		JButton btnKC = new JButton("K -> C");
		btnKC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xuLyDoKC();
			}
		});
		btnKC.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnKC.setBackground(Color.GREEN);
		btnKC.setBounds(296, 148, 107, 30);
		frmPhpBini.getContentPane().add(btnKC);
		
		JButton btnKF = new JButton("K -> F");
		btnKF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xuLyDoKF();
			}
		});
		btnKF.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnKF.setBackground(Color.GREEN);
		btnKF.setBounds(296, 189, 107, 30);
		frmPhpBini.getContentPane().add(btnKF);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xuLyReset();
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnReset.setBackground(Color.RED);
		btnReset.setBounds(190, 222, 75, 30);
		frmPhpBini.getContentPane().add(btnReset);
	}
	//khởi tạo hàm
	void xuLyDoF() {
		String str_soC = txtC.getText();
		double soC = Double.parseDouble(str_soC);
		double kq = soC - (5/9) + 32;
		txtKq.setText(String.valueOf(kq));
	}
	void xuLyDoK() {
		String str_soC = txtC.getText();
		double soC = Double.parseDouble(str_soC);
		double kq = soC + 273.15;
		txtKq.setText(String.valueOf(kq));
	}
	void xuLyDoKC() {
		String str_soK = txtC.getText();
		double soK = Double.parseDouble(str_soK);
		double kq = soK - 273.15;
		txtKq.setText(String.valueOf(kq));
	}
	void xuLyDoKF() {
		String str_soK = txtC.getText();
		double soK = Double.parseDouble(str_soK);
		double kq = (soK - 273.15) * 1.8 + 32;
		txtKq.setText(String.valueOf(kq));
	}
}
