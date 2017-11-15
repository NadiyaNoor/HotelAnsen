package database;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mainPage {

	private JFrame frame;
	private JTextField userField;
	private JTextField passField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainPage window = new mainPage();
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
	public mainPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Monotype Corsiva", Font.PLAIN, 17));
		frame.getContentPane().setLayout(null);
		
		
		JButton btnGuestLogin = new JButton("Guest Login");
		btnGuestLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guestPage guest= new guestPage();
				guest.mainGuestPage();
			}
		});
		btnGuestLogin.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		btnGuestLogin.setBounds(116, 335, 153, 39);
		frame.getContentPane().add(btnGuestLogin);
		
		JLabel lblWelcomeToAnsen = new JLabel("Welcome");
		lblWelcomeToAnsen.setFont(new Font("Monotype Corsiva", Font.PLAIN, 33));
		lblWelcomeToAnsen.setBounds(49, 53, 440, 56);
		frame.getContentPane().add(lblWelcomeToAnsen);
		
		JLabel lblTo = new JLabel("to");
		lblTo.setFont(new Font("Monotype Corsiva", Font.PLAIN, 33));
		lblTo.setBounds(146, 100, 63, 56);
		frame.getContentPane().add(lblTo);
		
		JLabel lblAnsenHotel = new JLabel("ANSEN Hotel");
		lblAnsenHotel.setFont(new Font("Monotype Corsiva", Font.PLAIN, 33));
		lblAnsenHotel.setBounds(169, 147, 212, 56);
		frame.getContentPane().add(lblAnsenHotel);
		
		JPanel staffPanel = new JPanel();
		staffPanel.setBounds(396, 0, 588, 681);
		frame.getContentPane().add(staffPanel);
		staffPanel.setLayout(null);
		
		JLabel userName = new JLabel("Username: ");
		userName.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		userName.setBounds(137, 228, 120, 22);
		staffPanel.add(userName);
		
		JLabel passWord = new JLabel("Password: ");
		passWord.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		passWord.setBounds(137, 276, 120, 22);
		staffPanel.add(passWord);
		
		userField = new JTextField();
		userField.setBounds(250, 228, 212, 32);
		staffPanel.add(userField);
		userField.setColumns(10);
		
		passField = new JTextField();
		passField.setColumns(10);
		passField.setBounds(250, 271, 212, 32);
		staffPanel.add(passField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		btnLogin.setBounds(337, 333, 125, 32);
		staffPanel.add(btnLogin);
		frame.setBounds(100, 100, 1000, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		staffPanel.setVisible(false);
		
		JButton btnStaffLogin = new JButton("Staff Login");
		btnStaffLogin.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		btnStaffLogin.setBounds(116, 249, 153, 39);
		frame.getContentPane().add(btnStaffLogin);

		btnStaffLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				staffPanel.setVisible(true);
			}
		});
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				staffPage staffPage= new staffPage();
				String id="admin";
				String pw="password";
				
				if(passField.getText().equals(pw)&&userField.getText().equals(id)){
					staffPage.staffMainPage();
				}else{
					JOptionPane.showMessageDialog(null, "Access Denied! Invalid usrname or password");
				}
			}
		});
		
	}
}
