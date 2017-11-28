package ANSEN;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JSplitPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class mainPage {

	private JFrame frame;
	private JTextField userField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				String test= null;
				Database data2=new Database();

				if(data2.getConnection()==true){
					test="Succesfully Connected";
				}else{
					test="Failed to connect";
				}
				try {
					mainPage window = new mainPage();
					window.frame.setVisible(true);
					JOptionPane.showMessageDialog(null,test );
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,test );
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
		String url4="res/resources/main2.png";
		ImageIcon background = new ImageIcon(url4);
		JLabel label = new JLabel();
		label.setBounds(0, 0, 100, 100);
		label.setIcon(background);
		
		JButton btnGuestLogin = new JButton("Guest");
		btnGuestLogin.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		btnGuestLogin.setBounds(115, 336, 153, 39);
		btnGuestLogin.setOpaque(false);
		btnGuestLogin.setContentAreaFilled(false);
		frame.getContentPane().add(btnGuestLogin);
		
		JPanel staffPanel = new JPanel();
		staffPanel.setBounds(396, 0, 588, 720);
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
		userField.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		userField.setBounds(250, 228, 212, 32);
		staffPanel.add(userField);
		userField.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		btnLogin.setBounds(309, 334, 153, 39);
		staffPanel.add(btnLogin);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('▪');
		passwordField.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		passwordField.setBounds(250, 274, 212, 32);
		staffPanel.add(passwordField);
		
		JLabel label_2 = new JLabel("");
		URL url = mainPage.class.getResource("/resources/part 2.png");
		ImageIcon icon = new ImageIcon(url);
		label_2.setIcon(icon);

		label_2.setBounds(0, 0, 588, 680);
		staffPanel.add(label_2);
		frame.setBounds(100, 100, 1000, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		staffPanel.setVisible(false);
		
		JButton btnStaffLogin = new JButton("Staff Login");
		btnStaffLogin.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		btnStaffLogin.setBounds(115, 249, 153, 39);
		btnStaffLogin.setOpaque(false);
		btnStaffLogin.setContentAreaFilled(false);
		frame.getContentPane().add(btnStaffLogin);
		
		JLabel lblNewLabel = new JLabel("New label");
		URL url2= mainPage.class.getResource("/resources/main2.png");
		ImageIcon icon2= new ImageIcon(url2);
		lblNewLabel.setIcon(icon2);
		lblNewLabel.setBounds(0, 0, 984, 681);
		frame.getContentPane().add(lblNewLabel);

		btnGuestLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guestPage guest= new guestPage();
				guest.mainGuestPage();
			}
		});
		
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
				char[] pass=passwordField.getPassword();
				String password = new String(pass);
				if(password.equals(pw)&&userField.getText().equals(id)){
					staffPage.staffMainPage();
				}else{
					JOptionPane.showMessageDialog(null, "Access Denied! Invalid usrname or password");
					
				}
			}
		});
		
	}
}
