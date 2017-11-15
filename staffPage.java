package database;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import java.awt.event.ActionEvent;

public class staffPage {

	Connection con=null;
	PreparedStatement pst=null;
	ResultSet rs = null;
	
	private JFrame frame;
	private JTextField firstName;
	private JTextField middleName;
	private JTextField lastName;
	private JTextField dateBirth;
	private JTextField phoneNum;
	private JTextField emailAdd;
	private JTextField checkIN;
	private JTextField checkOUT;
	private JTextField deleteID;
	private JTextField ED_FN;
	private JTextField ED_MN;
	private JTextField ED_LN;
	private JTextField ED_DOB;
	private JTextField ED_PN;
	private JTextField ED_E;
	private JTextField ED_CIN;
	private JTextField ED_COUT;
	private JTextField ED_NA;
	private JTextField ED_NC;
	private JTextField SearchID;

	/**
	 * Launch the application.
	 */
	public static void staffMainPage() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					staffPage window = new staffPage();
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
	public staffPage() {
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
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 984, 681);
		frame.getContentPane().add(tabbedPane);
		
		
		//Panel 1 Items and commands
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Add Guest", null, panel, null);
		panel.setLayout(null);
		
		JLabel FirstName = new JLabel("First Name");
		FirstName.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		FirstName.setBounds(68, 122, 123, 32);
		panel.add(FirstName);
		
		JLabel MiddleName = new JLabel("Middle Name");
		MiddleName.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		MiddleName.setBounds(359, 122, 123, 32);
		panel.add(MiddleName);
		
		JLabel LastName = new JLabel("Last Name");
		LastName.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		LastName.setBounds(645, 122, 123, 32);
		panel.add(LastName);
		
		firstName = new JTextField();
		firstName.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		firstName.setBounds(68, 159, 260, 32);
		panel.add(firstName);
		firstName.setColumns(10);
		
		middleName = new JTextField();
		middleName.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		middleName.setColumns(10);
		middleName.setBounds(359, 159, 260, 32);
		panel.add(middleName);
		
		lastName = new JTextField();
		lastName.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		lastName.setColumns(10);
		lastName.setBounds(645, 159, 260, 32);
		panel.add(lastName);
		
		JLabel DateBirth = new JLabel("DOB");
		DateBirth.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		DateBirth.setBounds(68, 237, 123, 32);
		panel.add(DateBirth);
		
		dateBirth = new JTextField();
		dateBirth.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		dateBirth.setColumns(10);
		dateBirth.setBounds(68, 274, 260, 32);
		panel.add(dateBirth);
		
		JLabel PhoneNumber = new JLabel("Phone Number");
		PhoneNumber.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		PhoneNumber.setBounds(359, 237, 176, 32);
		panel.add(PhoneNumber);
		
		phoneNum = new JTextField();
		phoneNum.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		phoneNum.setColumns(10);
		phoneNum.setBounds(359, 274, 260, 32);
		panel.add(phoneNum);
		
		JLabel EmailAddress = new JLabel("Email");
		EmailAddress.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		EmailAddress.setBounds(645, 237, 123, 32);
		panel.add(EmailAddress);
		
		emailAdd = new JTextField();
		emailAdd.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		emailAdd.setColumns(10);
		emailAdd.setBounds(645, 274, 260, 32);
		panel.add(emailAdd);
		
		JLabel adult = new JLabel("Number of Adult");
		adult.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		adult.setBounds(68, 356, 193, 32);
		panel.add(adult);
		
		JLabel lblNumberOfChildren = new JLabel("Number of Children");
		lblNumberOfChildren.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		lblNumberOfChildren.setBounds(359, 356, 176, 32);
		panel.add(lblNumberOfChildren);
		
		JComboBox numAdult = new JComboBox();
		numAdult.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		numAdult.setBounds(68, 399, 260, 32);
		numAdult.addItem("1");
		numAdult.addItem("2");
		numAdult.addItem("3");
		numAdult.addItem("4");
		numAdult.addItem("5");
		numAdult.addItem("6");
		numAdult.addItem("7");
		numAdult.addItem("8");
		panel.add(numAdult);
		
		JComboBox numChildren = new JComboBox();
		numChildren.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		numChildren.setBounds(359, 399, 260, 32);
		numChildren.addItem("1");
		numChildren.addItem("2");
		numChildren.addItem("3");
		numChildren.addItem("4");
		numChildren.addItem("5");
		numChildren.addItem("6");
		numChildren.addItem("7");
		numChildren.addItem("8");
		panel.add(numChildren);
		
		JLabel lblCheckIn = new JLabel("Check IN");
		lblCheckIn.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		lblCheckIn.setBounds(68, 496, 123, 32);
		panel.add(lblCheckIn);
		
		checkIN = new JTextField();
		checkIN.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		checkIN.setColumns(10);
		checkIN.setBounds(68, 533, 260, 32);
		panel.add(checkIN);
		
		JLabel lblCheckOut = new JLabel("Check OUT");
		lblCheckOut.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		lblCheckOut.setBounds(359, 496, 176, 32);
		panel.add(lblCheckOut);
		
		checkOUT = new JTextField();
		checkOUT.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		checkOUT.setColumns(10);
		checkOUT.setBounds(359, 533, 260, 32);
		panel.add(checkOUT);
		
		JButton restButton = new JButton("Rest");
		restButton.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		restButton.setBounds(782, 476, 123, 39);
		panel.add(restButton);
		
		JButton saveButton = new JButton("Save");
		saveButton.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		saveButton.setBounds(782, 526, 123, 39);
		panel.add(saveButton);
		
		JLabel lblNewLabel = new JLabel("Fill out the guest's information");
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		lblNewLabel.setBounds(230, 35, 266, 32);
		panel.add(lblNewLabel);
		
		JLabel lblId = new JLabel("ID: ");
		lblId.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		lblId.setBounds(547, 35, 38, 32);
		panel.add(lblId);
		
		JLabel randomID = new JLabel("");
		randomID.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		randomID.setBounds(590, 40, 208, 22);
		panel.add(randomID);
		
		JButton IDbutton = new JButton("ID");
		IDbutton.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		IDbutton.setBounds(803, 35, 102, 32);
		panel.add(IDbutton);
		
		//Buttons commands and action listeners
		IDbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random rand = new Random();
				int num =(rand.nextInt(9000000) + 1000000);
				randomID.setText(Integer.toString(num));
			}
		});
		
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String sql ="INSERT INTO ANSENHotelV2(FirstName, MiddleName, LastName, DOB, Phone, Email,"
							+ " Adult, Children, CheckIN, CheckOUT, ID)"
							+ " VALUES (?,?,?,?,?,?,?,?,?,?,?)";
					String driver = "com.mysql.jdbc.Driver";
					String url = "jdbc:mysql://sql9.freesqldatabase.com:3306/sql9205304";
					String username = "sql9205304";
					String password = "bPu1AfIP8D";
					Class.forName(driver);
					String midName="";
					if(middleName.getText().equals(null)){
						midName=" ";
					}else{
						midName=middleName.getText();
					}

					con = DriverManager.getConnection(url,username,password);
					pst=con.prepareStatement(sql);
					pst.setString(1, firstName.getText());
					pst.setString(2, midName);
					pst.setString(3, lastName.getText());
					pst.setString(4, dateBirth.getText());
					pst.setString(5, phoneNum.getText());
					pst.setString(6, emailAdd.getText());
					pst.setString(7, numAdult.getSelectedItem().toString());
					pst.setString(8, numChildren.getSelectedItem().toString());
					pst.setString(9, checkIN.getText());
					pst.setString(10, checkOUT.getText());
					pst.setString(11, randomID.getText());
					
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Saved");
					
					
				}catch(Exception el){
					JOptionPane.showMessageDialog(null, el);
				}
			}
		});
		
		restButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstName.setText(null);
				middleName.setText(null);
				lastName.setText(null);
				dateBirth.setText(null);
				phoneNum.setText(null);
				emailAdd.setText(null);
				checkIN.setText(null);
				checkOUT.setText(null);
				randomID.setText(null);
			}
		});
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Search", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel label_11 = new JLabel("ID: ");
		label_11.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_11.setBounds(67, 65, 38, 32);
		panel_1.add(label_11);
		
		SearchID = new JTextField();
		SearchID.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		SearchID.setColumns(10);
		SearchID.setBounds(115, 68, 211, 32);
		panel_1.add(SearchID);
		
		JButton button = new JButton("Search");
		button.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		button.setBounds(336, 68, 103, 32);
		panel_1.add(button);
		
		JLabel label_12 = new JLabel("First Name");
		label_12.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_12.setBounds(67, 139, 123, 32);
		panel_1.add(label_12);
		
		JLabel label_13 = new JLabel("Middle Name");
		label_13.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_13.setBounds(358, 139, 123, 32);
		panel_1.add(label_13);
		
		JLabel label_14 = new JLabel("Last Name");
		label_14.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_14.setBounds(644, 139, 123, 32);
		panel_1.add(label_14);
		
		JLabel label_15 = new JLabel("DOB");
		label_15.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_15.setBounds(67, 254, 123, 32);
		panel_1.add(label_15);
		
		JLabel label_16 = new JLabel("Phone Number");
		label_16.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_16.setBounds(358, 254, 176, 32);
		panel_1.add(label_16);
		
		JLabel label_17 = new JLabel("Email");
		label_17.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_17.setBounds(644, 254, 123, 32);
		panel_1.add(label_17);
		
		JLabel label_18 = new JLabel("Number of Adult");
		label_18.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_18.setBounds(67, 373, 193, 32);
		panel_1.add(label_18);
		
		JLabel label_19 = new JLabel("Number of Children");
		label_19.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_19.setBounds(358, 373, 176, 32);
		panel_1.add(label_19);
		
		JLabel label_20 = new JLabel("Check IN");
		label_20.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_20.setBounds(67, 513, 123, 32);
		panel_1.add(label_20);
		
		JLabel label_21 = new JLabel("Check OUT");
		label_21.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_21.setBounds(358, 513, 176, 32);
		panel_1.add(label_21);
		
		JLabel S_FN = new JLabel("");
		S_FN.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		S_FN.setBounds(67, 176, 260, 32);
		panel_1.add(S_FN);
		
		JLabel S_MN = new JLabel("");
		S_MN.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		S_MN.setBounds(358, 176, 260, 32);
		panel_1.add(S_MN);
		
		JLabel S_LN = new JLabel("");
		S_LN.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		S_LN.setBounds(644, 176, 260, 32);
		panel_1.add(S_LN);
		
		JLabel S_E = new JLabel("");
		S_E.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		S_E.setBounds(644, 291, 260, 32);
		panel_1.add(S_E);
		
		JLabel S_PN = new JLabel("");
		S_PN.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		S_PN.setBounds(358, 291, 260, 32);
		panel_1.add(S_PN);
		
		JLabel S_DOB = new JLabel("");
		S_DOB.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		S_DOB.setBounds(67, 291, 260, 32);
		panel_1.add(S_DOB);
		
		JLabel S_NC = new JLabel("");
		S_NC.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		S_NC.setBounds(358, 410, 260, 32);
		panel_1.add(S_NC);
		
		JLabel S_NA = new JLabel("");
		S_NA.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		S_NA.setBounds(67, 410, 260, 32);
		panel_1.add(S_NA);
		
		JLabel S_CIN = new JLabel("");
		S_CIN.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		S_CIN.setBounds(67, 556, 260, 32);
		panel_1.add(S_CIN);
		
		JLabel S_COUT = new JLabel("");
		S_COUT.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		S_COUT.setBounds(358, 556, 260, 32);
		panel_1.add(S_COUT);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
					pst.setString(1,SearchID.getText());
					
					rs=pst.executeQuery();
					if(rs.next()){
						String first=rs.getString("FirstName");
						S_FN.setText(first);
						String middle=rs.getString("MiddleName");
						S_MN.setText(middle);
						String last=rs.getString("LastName");
						S_LN.setText(last);
						String dob=rs.getString("DOB");
						S_DOB.setText(dob);
						String phone=rs.getString("Phone");
						S_PN.setText(phone);
						String email=rs.getString("Email");
						S_E.setText(email);
						
						String adult=rs.getString("Adult");
						S_NA.setText(adult);
						String child=rs.getString("Children");
						S_NC.setText(child);
						
						String checkin=rs.getString("CheckIN");
						S_CIN.setText(checkin);
						String checkout=rs.getString("CheckOUT");
						S_COUT.setText(checkout);
						
					}
					
					
				}catch(Exception ell){
					JOptionPane.showMessageDialog(null, ell);
				}	
			}
		});
		
		
		
		
		
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Edit & Delete", null, panel_2, null);
		panel_2.setLayout(null);
		
		JButton deleteButton = new JButton("Delete");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String sql ="DELETE FROM ANSENHotelV2 WHERE ID=?";
					String driver = "com.mysql.jdbc.Driver";
					String url = "jdbc:mysql://sql9.freesqldatabase.com:3306/sql9205304";
					String username = "sql9205304";
					String password = "bPu1AfIP8D";
					Class.forName(driver);

					con = DriverManager.getConnection(url,username,password);
					pst=con.prepareStatement(sql);
					pst.setString(1,deleteID.getText());
					
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Succesfuly deleted");
					
					
				}catch(Exception el){
					JOptionPane.showMessageDialog(null, el);
				}
			}
		});
		deleteButton.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		deleteButton.setBounds(779, 511, 116, 39);
		panel_2.add(deleteButton);
		
		JLabel label = new JLabel("ID: ");
		label.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label.setBounds(58, 29, 38, 32);
		panel_2.add(label);
		
		deleteID = new JTextField();
		deleteID.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		deleteID.setBounds(106, 32, 211, 32);
		panel_2.add(deleteID);
		deleteID.setColumns(10);
		
		JButton searchButton = new JButton("Search");
		
		searchButton.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		searchButton.setBounds(327, 32, 103, 32);
		panel_2.add(searchButton);
		
		JLabel label_1 = new JLabel("First Name");
		label_1.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_1.setBounds(58, 103, 123, 32);
		panel_2.add(label_1);
		
		ED_FN = new JTextField();
		ED_FN.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		ED_FN.setColumns(10);
		ED_FN.setBounds(58, 140, 260, 32);
		panel_2.add(ED_FN);
		
		JLabel label_2 = new JLabel("Middle Name");
		label_2.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_2.setBounds(349, 103, 123, 32);
		panel_2.add(label_2);
		
		ED_MN = new JTextField();
		ED_MN.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		ED_MN.setColumns(10);
		ED_MN.setBounds(349, 140, 260, 32);
		panel_2.add(ED_MN);
		
		JLabel label_3 = new JLabel("Last Name");
		label_3.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_3.setBounds(635, 103, 123, 32);
		panel_2.add(label_3);
		
		ED_LN = new JTextField();
		ED_LN.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		ED_LN.setColumns(10);
		ED_LN.setBounds(635, 140, 260, 32);
		panel_2.add(ED_LN);
		
		JLabel label_4 = new JLabel("DOB");
		label_4.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_4.setBounds(58, 218, 123, 32);
		panel_2.add(label_4);
		
		ED_DOB = new JTextField();
		ED_DOB.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		ED_DOB.setColumns(10);
		ED_DOB.setBounds(58, 255, 260, 32);
		panel_2.add(ED_DOB);
		
		JLabel label_5 = new JLabel("Phone Number");
		label_5.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_5.setBounds(349, 218, 176, 32);
		panel_2.add(label_5);
		
		ED_PN = new JTextField();
		ED_PN.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		ED_PN.setColumns(10);
		ED_PN.setBounds(349, 255, 260, 32);
		panel_2.add(ED_PN);
		
		JLabel label_6 = new JLabel("Email");
		label_6.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_6.setBounds(635, 218, 123, 32);
		panel_2.add(label_6);
		
		ED_E = new JTextField();
		ED_E.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		ED_E.setColumns(10);
		ED_E.setBounds(635, 255, 260, 32);
		panel_2.add(ED_E);
		
		JLabel label_7 = new JLabel("Number of Children");
		label_7.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_7.setBounds(349, 337, 176, 32);
		panel_2.add(label_7);
		
		JLabel label_8 = new JLabel("Number of Adult");
		label_8.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_8.setBounds(58, 337, 193, 32);
		panel_2.add(label_8);
		
		JLabel label_9 = new JLabel("Check IN");
		label_9.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_9.setBounds(58, 477, 123, 32);
		panel_2.add(label_9);
		
		ED_CIN = new JTextField();
		ED_CIN.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		ED_CIN.setColumns(10);
		ED_CIN.setBounds(58, 514, 260, 32);
		panel_2.add(ED_CIN);
		
		JLabel label_10 = new JLabel("Check OUT");
		label_10.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		label_10.setBounds(349, 477, 176, 32);
		panel_2.add(label_10);
		
		ED_COUT = new JTextField();
		ED_COUT.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		ED_COUT.setColumns(10);
		ED_COUT.setBounds(349, 514, 260, 32);
		panel_2.add(ED_COUT);
		
		JButton editButton = new JButton("Update");
		editButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String sql ="UPDATE ANSENHotelV2 SET FirstName=?,MiddleName=?,LastName=?,DOB=?,Phone=?,"
							+ "Email=?,Adult=?,Children=?,CheckIN=?,CheckOUT=? WHERE ID=?";
					String driver = "com.mysql.jdbc.Driver";
					String url = "jdbc:mysql://sql9.freesqldatabase.com:3306/sql9205304";
					String username = "sql9205304";
					String password = "bPu1AfIP8D";
					Class.forName(driver);
					String midName="";
					if(ED_MN.getText().equals(null)){
						midName=" ";
					}else{
						midName=ED_MN.getText();
					}

					con = DriverManager.getConnection(url,username,password);
					pst=con.prepareStatement(sql);
					pst.setString(1, ED_FN.getText());
					pst.setString(2, midName);
					pst.setString(3, ED_LN.getText());
					pst.setString(4, ED_DOB.getText());
					pst.setString(5, ED_PN.getText());
					pst.setString(6, ED_E.getText());
					pst.setString(7, ED_NA.getText());
					pst.setString(8, ED_NC.getText());
					pst.setString(9, ED_CIN.getText());
					pst.setString(10, ED_COUT.getText());
					pst.setString(11, deleteID.getText());
					
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Successfully updated");
					
					
				}catch(Exception el){
					JOptionPane.showMessageDialog(null, el);
				}
			}
		});
		
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
					pst.setString(1,deleteID.getText());
					
					rs=pst.executeQuery();
					if(rs.next()){
						String first=rs.getString("FirstName");
						ED_FN.setText(first);
						String middle=rs.getString("MiddleName");
						ED_MN.setText(middle);
						String last=rs.getString("LastName");
						ED_LN.setText(last);
						String dob=rs.getString("DOB");
						ED_DOB.setText(dob);
						String phone=rs.getString("Phone");
						ED_PN.setText(phone);
						String email=rs.getString("Email");
						ED_E.setText(email);
						
						String adult=rs.getString("Adult");
						ED_NA.setText(adult);
						String child=rs.getString("Children");
						ED_NC.setText(child);
						
						String checkin=rs.getString("CheckIN");
						ED_CIN.setText(checkin);
						String checkout=rs.getString("CheckOUT");
						ED_COUT.setText(checkout);
						
					}
					
					
				}catch(Exception ell){
					JOptionPane.showMessageDialog(null, ell);
				}	
			}
		});
		editButton.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		editButton.setBounds(779, 463, 116, 39);
		panel_2.add(editButton);
		
		ED_NA = new JTextField();
		ED_NA.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		ED_NA.setColumns(10);
		ED_NA.setBounds(57, 380, 260, 32);
		panel_2.add(ED_NA);
		
		ED_NC = new JTextField();
		ED_NC.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		ED_NC.setColumns(10);
		ED_NC.setBounds(349, 380, 260, 32);
		panel_2.add(ED_NC);
	}
}
