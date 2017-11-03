import java.awt.EventQueue;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Font;

public class Add_Page {

	public class setVisible {

	}

	private JFrame frmAdd;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void newPage() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Page window = new Add_Page();
					window.frmAdd.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Add_Page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public static boolean frame2check = false;
	public static boolean getFrame2Check(){
		return frame2check;
	}
	private void initialize() {
		frmAdd = new JFrame();
		frmAdd.setTitle("Add");
		frmAdd.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		frmAdd.setBounds(100, 100, 628, 418);
		frmAdd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdd.getContentPane().setLayout(null);
		
		JLabel lblFillOfThe = new JLabel("Fill of the information");
		lblFillOfThe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFillOfThe.setBounds(235, 11, 147, 14);
		frmAdd.getContentPane().add(lblFillOfThe);
		
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAdd.setVisible(false);
				frame2check = true;
			}
		});
		btnSave.setBounds(500, 340, 89, 23);
		frmAdd.getContentPane().add(btnSave);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFirstName.setBounds(10, 48, 100, 14);
		frmAdd.getContentPane().add(lblFirstName);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(10, 73, 192, 32);
		frmAdd.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JLabel lblMiddle = new JLabel("Middle Name");
		lblMiddle.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMiddle.setBounds(212, 48, 100, 14);
		frmAdd.getContentPane().add(lblMiddle);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setBounds(212, 73, 192, 32);
		frmAdd.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLastName.setBounds(414, 48, 106, 14);
		frmAdd.getContentPane().add(lblLastName);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setBounds(414, 73, 192, 32);
		frmAdd.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDob.setBounds(10, 131, 46, 14);
		frmAdd.getContentPane().add(lblDob);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_3.setBounds(10, 156, 192, 32);
		frmAdd.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		
		JLabel lblNewLabel = new JLabel("Phone");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(212, 131, 70, 14);
		frmAdd.getContentPane().add(lblNewLabel);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_4.setBounds(212, 156, 192, 32);
		frmAdd.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(414, 131, 46, 14);
		frmAdd.getContentPane().add(lblEmail);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_5.setBounds(414, 156, 192, 32);
		frmAdd.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		
		JLabel lblOfAdult = new JLabel("# of Adult");
		lblOfAdult.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOfAdult.setBounds(10, 222, 100, 14);
		frmAdd.getContentPane().add(lblOfAdult);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setBounds(10, 247, 192, 32);
		frmAdd.getContentPane().add(comboBox);
		
		
		JLabel lblOfChildren = new JLabel("# of Children");
		lblOfChildren.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOfChildren.setBounds(212, 222, 114, 14);
		frmAdd.getContentPane().add(lblOfChildren);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_6.setBounds(212, 247, 192, 32);
		frmAdd.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		
		JLabel lblCheckInout = new JLabel("Check in/out");
		lblCheckInout.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCheckInout.setBounds(10, 332, 100, 14);
		frmAdd.getContentPane().add(lblCheckInout);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_7.setBounds(120, 331, 126, 32);
		frmAdd.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_8.setBounds(256, 331, 126, 32);
		frmAdd.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnReset.setBounds(500, 306, 89, 23);
		frmAdd.getContentPane().add(btnReset);
	}
	/*
	public void main(String [] args){
		String[] person1= new String[10];
		person1[0]=textField.getText();
		person1[1]=textField.getText();
		person1[2]=textField.getText();
		person1[3]=textField.getText();
		person1[4]=textField.getText();
		person1[5]=textField.getText();
		person1[6]=textField.getText();
		person1[7]=comboBox.getSelectedItem().toString();
		
	}
	*/
}
