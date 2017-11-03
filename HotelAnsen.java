package hotelAnsen;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Button;

public class HotelAnsen {
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HotelAnsen window = new HotelAnsen();
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
	public HotelAnsen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton searchRes = new JButton("Search Reservation");
		searchRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchRes.main(null);
			}
		});
		searchRes.setBounds(168, 97, 347, 85);
		frame.getContentPane().add(searchRes);

		JButton makeRes = new JButton("Make Reservation");
		makeRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MakeRes.main(null);
			}
		});
		makeRes.setBounds(168, 279, 347, 85);
		frame.getContentPane().add(makeRes);
	}
}

