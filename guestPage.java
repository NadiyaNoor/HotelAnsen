package ANSEN;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

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
		label.setBounds(68, 80, 38, 32);
		frame.getContentPane().add(label);
		
		G_ID = new JTextField();
		G_ID.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		G_ID.setColumns(10);
		G_ID.setOpaque(false);
		G_ID.setBorder(null);
		G_ID.setBounds(115, 81, 211, 32);
		frame.getContentPane().add(G_ID);
		
		JButton SearchButton = new JButton("Search");
		SearchButton.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		SearchButton.setBounds(336, 81, 103, 35);
		SearchButton.setOpaque(false);
		SearchButton.setContentAreaFilled(false);
		frame.getContentPane().add(SearchButton);
		
		JLabel label_1 = new JLabel("First Name");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_1.setBounds(68, 154, 123, 32);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Middle Name");
		label_2.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_2.setBounds(359, 154, 123, 32);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Last Name");
		label_3.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_3.setBounds(645, 154, 123, 32);
		frame.getContentPane().add(label_3);
		
		JLabel G_FN = new JLabel("");
		G_FN.setForeground(Color.BLUE);
		G_FN.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		G_FN.setBounds(68, 190, 252, 32);
		frame.getContentPane().add(G_FN);
		
		JLabel G_MN = new JLabel("");
		G_MN.setForeground(Color.BLUE);
		G_MN.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		G_MN.setBounds(359, 190, 252, 32);
		frame.getContentPane().add(G_MN);
		
		JLabel G_LN = new JLabel("");
		G_LN.setForeground(Color.BLUE);
		G_LN.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		G_LN.setBounds(645, 190, 252, 32);
		frame.getContentPane().add(G_LN);
		
		JLabel label_7 = new JLabel("DOB");
		label_7.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_7.setBounds(68, 269, 123, 32);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("Phone Number");
		label_8.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_8.setBounds(359, 269, 176, 32);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("Email");
		label_9.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_9.setBounds(645, 269, 123, 32);
		frame.getContentPane().add(label_9);
		
		JLabel G_DOB = new JLabel("");
		G_DOB.setForeground(Color.BLUE);
		G_DOB.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		G_DOB.setBounds(68, 305, 252, 32);
		frame.getContentPane().add(G_DOB);
		
		JLabel G_PN = new JLabel("");
		G_PN.setForeground(Color.BLUE);
		G_PN.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		G_PN.setBounds(359, 305, 252, 32);
		frame.getContentPane().add(G_PN);
		
		JLabel G_E = new JLabel("");
		G_E.setForeground(Color.BLUE);
		G_E.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		G_E.setBounds(645, 305, 252, 32);
		frame.getContentPane().add(G_E);
		
		JLabel label_13 = new JLabel("Number of Adult");
		label_13.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_13.setBounds(68, 388, 193, 32);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("Number of Children");
		label_14.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_14.setBounds(359, 388, 176, 32);
		frame.getContentPane().add(label_14);
		
		JLabel G_NA = new JLabel("");
		G_NA.setForeground(Color.BLUE);
		G_NA.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		G_NA.setBounds(68, 424, 252, 32);
		frame.getContentPane().add(G_NA);
		
		JLabel G_NC = new JLabel("");
		G_NC.setForeground(Color.BLUE);
		G_NC.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		G_NC.setBounds(359, 424, 252, 32);
		frame.getContentPane().add(G_NC);
		
		JLabel label_17 = new JLabel("Check IN");
		label_17.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_17.setBounds(68, 528, 123, 32);
		frame.getContentPane().add(label_17);
		
		JLabel label_18 = new JLabel("Check OUT");
		label_18.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_18.setBounds(359, 528, 176, 32);
		frame.getContentPane().add(label_18);
		
		JLabel G_CIN = new JLabel("");
		G_CIN.setForeground(Color.BLUE);
		G_CIN.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		G_CIN.setBounds(68, 564, 252, 32);
		frame.getContentPane().add(G_CIN);
		
		JLabel G_COUT = new JLabel("");
		G_COUT.setForeground(Color.BLUE);
		G_COUT.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		G_COUT.setBounds(359, 564, 252, 32);
		frame.getContentPane().add(G_COUT);
		
		JLabel lblTypeOfRoom = new JLabel("Type Of Room");
		lblTypeOfRoom.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		lblTypeOfRoom.setBounds(645, 388, 176, 32);
		frame.getContentPane().add(lblTypeOfRoom);
		
		JLabel typeRoom = new JLabel("");
		typeRoom.setForeground(Color.BLUE);
		typeRoom.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		typeRoom.setBounds(645, 424, 252, 32);
		frame.getContentPane().add(typeRoom);
		
		JLabel lblNewLabel = new JLabel("");
		URL url= guestPage.class.getResource("/resources/search.png");
		ImageIcon icon= new ImageIcon(url);
		lblNewLabel.setIcon(icon);
		//lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Nitharjan\\Desktop\\ANSEN\\search.png"));
		lblNewLabel.setBounds(0, 0, 984, 681);
		frame.getContentPane().add(lblNewLabel);
		
		SearchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
					Database data = new Database();
					data.getConnection();
					pst = data.getData(G_ID.getText());
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
						String room =rs.getString("typeRoom");
						typeRoom.setText(room);
						
						
					}
				}catch(Exception ell){
					JOptionPane.showMessageDialog(null, ell);
				}	
				
			}
		});
	}
}
