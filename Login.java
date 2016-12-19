import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txt_usr;
	private JTextField txt_pass;
	String user,pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 361);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_usr = new JTextField();
		txt_usr.setText("Username");
		txt_usr.setBounds(151, 88, 189, 29);
		contentPane.add(txt_usr);
		txt_usr.setColumns(10);
		
		txt_pass = new JTextField();
		txt_pass.setText("Password");
		txt_pass.setColumns(10);
		txt_pass.setBounds(151, 143, 189, 29);
		contentPane.add(txt_pass);
		
		JButton btn_login = new JButton("Login");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				user = txt_usr.getText();
				pass = txt_pass.getText();
				if(user.equals("test") && pass.equals("12345")) {
					AccountHome reg = new AccountHome();
					reg.setVisible(true);
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null,"Wrong Password / Username");
					txt_usr.setText("");
					txt_pass.setText("");
					txt_usr.requestFocus();
				}
			}
		});
		btn_login.setBounds(251, 193, 89, 29);
		contentPane.add(btn_login);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(new Color(245, 245, 245));
		canvas.setBounds(104, 49, 272, 215);		
		contentPane.add(canvas);
		
		
	}
}
