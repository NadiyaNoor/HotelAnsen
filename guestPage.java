package database;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class guestPage {
	
	Connection con=null;
	PreparedStatement pst=null;
	ResultSet rs = null;

	private JFrame frame;
	private JTextField G_ID;

	/**
	 * Launch the application.
	 */
	public static void mainGuestPage() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guestPage window = new guestPage();
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
	public guestPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("ID: ");
		label.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label.setBounds(72, 63, 38, 32);
		frame.getContentPane().add(label);
		
		G_ID = new JTextField();
		G_ID.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		G_ID.setColumns(10);
		G_ID.setBounds(120, 66, 211, 32);
		frame.getContentPane().add(G_ID);
		
		JButton SearchButton = new JButton("Search");
		SearchButton.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		SearchButton.setBounds(341, 66, 103, 32);
		frame.getContentPane().add(SearchButton);
		
		JLabel label_1 = new JLabel("First Name");
		label_1.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_1.setBounds(72, 137, 123, 32);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Middle Name");
		label_2.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_2.setBounds(363, 137, 123, 32);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Last Name");
		label_3.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_3.setBounds(649, 137, 123, 32);
		frame.getContentPane().add(label_3);
		
		JLabel G_FN = new JLabel("");
		G_FN.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		G_FN.setBounds(72, 174, 260, 32);
		frame.getContentPane().add(G_FN);
		
		JLabel G_MN = new JLabel("");
		G_MN.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		G_MN.setBounds(363, 174, 260, 32);
		frame.getContentPane().add(G_MN);
		
		JLabel G_LN = new JLabel("");
		G_LN.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		G_LN.setBounds(649, 174, 260, 32);
		frame.getContentPane().add(G_LN);
		
		JLabel label_7 = new JLabel("DOB");
		label_7.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_7.setBounds(72, 252, 123, 32);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("Phone Number");
		label_8.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_8.setBounds(363, 252, 176, 32);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("Email");
		label_9.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_9.setBounds(649, 252, 123, 32);
		frame.getContentPane().add(label_9);
		
		JLabel G_DOB = new JLabel("");
		G_DOB.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		G_DOB.setBounds(72, 289, 260, 32);
		frame.getContentPane().add(G_DOB);
		
		JLabel G_PN = new JLabel("");
		G_PN.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		G_PN.setBounds(363, 289, 260, 32);
		frame.getContentPane().add(G_PN);
		
		JLabel G_E = new JLabel("");
		G_E.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		G_E.setBounds(649, 289, 260, 32);
		frame.getContentPane().add(G_E);
		
		JLabel label_13 = new JLabel("Number of Adult");
		label_13.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_13.setBounds(72, 371, 193, 32);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("Number of Children");
		label_14.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_14.setBounds(363, 371, 176, 32);
		frame.getContentPane().add(label_14);
		
		JLabel G_NA = new JLabel("");
		G_NA.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		G_NA.setBounds(72, 408, 260, 32);
		frame.getContentPane().add(G_NA);
		
		JLabel G_NC = new JLabel("");
		G_NC.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		G_NC.setBounds(363, 408, 260, 32);
		frame.getContentPane().add(G_NC);
		
		JLabel label_17 = new JLabel("Check IN");
		label_17.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_17.setBounds(72, 511, 123, 32);
		frame.getContentPane().add(label_17);
		
		JLabel label_18 = new JLabel("Check OUT");
		label_18.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_18.setBounds(363, 511, 176, 32);
		frame.getContentPane().add(label_18);
		
		JLabel G_CIN = new JLabel("");
		G_CIN.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		G_CIN.setBounds(72, 554, 260, 32);
		frame.getContentPane().add(G_CIN);
		
		JLabel G_COUT = new JLabel("");
		G_COUT.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		G_COUT.setBounds(363, 554, 260, 32);
		frame.getContentPane().add(G_COUT);
		
		SearchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
					String sql ="SELECT FirstName, MiddleName, LastName, DOB, Phone, Email, "
							+ "Adult, Children, CheckIN, CheckOUT FROM ANSENHotelV2 WHERE ID=?";
					String driver = "com.mysql.jdbc.Driver";
					String url = "jdbc:mysql://sql9.freesqldatabase.com:3306/sql9205304";
					String username = "sql9205304";
					String password = "bPu1AfIP8D";
					Class.forName(driver);

					con = DriverManager.getConnection(url,username,password);
					pst=con.prepareStatement(sql);
					pst.setString(1,G_ID.getText());
					
					rs=pst.executeQuery();
					if(rs.next()){
						String first=rs.getString("FirstName");
						G_FN.setText(first);
						String middle=rs.getString("MiddleName");
						G_MN.setText(middle);
						String last=rs.getString("LastName");
						G_LN.setText(last);
						String dob=rs.getString("DOB");
						G_DOB.setText(dob);
						String phone=rs.getString("Phone");
						G_PN.setText(phone);
						String email=rs.getString("Email");
						G_E.setText(email);
						
						String adult=rs.getString("Adult");
						G_NA.setText(adult);
						String child=rs.getString("Children");
						G_NC.setText(child);
						
						String checkin=rs.getString("CheckIN");
						G_CIN.setText(checkin);
						String checkout=rs.getString("CheckOUT");
						G_COUT.setText(checkout);
						
					}
				}catch(Exception ell){
					JOptionPane.showMessageDialog(null, ell);
				}	
				
			}
		});
		
		
	}
}
