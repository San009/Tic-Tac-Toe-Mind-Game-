import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class startt extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					startt frame = new startt();
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
	public startt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 736, 497);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterPlayer = new JLabel("Enter Player 1 Name");
		lblEnterPlayer.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblEnterPlayer.setBounds(137, 132, 177, 22);
		contentPane.add(lblEnterPlayer);
		
		JLabel lblEnterPlayer_1 = new JLabel("Enter Player 2 Name");
		lblEnterPlayer_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblEnterPlayer_1.setBounds(137, 198, 177, 22);
		contentPane.add(lblEnterPlayer_1);
		
		textField = new JTextField();
		textField.setBounds(324, 135, 207, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(324, 201, 207, 20);
		contentPane.add(textField_1);
		
		JButton btnPlay = new JButton("Play");
		
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			     
				tictactoe bbj=new tictactoe();
				bbj.setVisible(true);
				dispose();
				
				
				
						
			}
		});
		btnPlay.setBackground(Color.ORANGE);
		btnPlay.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnPlay.setBounds(442, 277, 89, 23);
		contentPane.add(btnPlay);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Gui1 objn=new Gui1();
				objn.setVisible(true);
				dispose();
				
			}
		});
		btnBack.setBackground(Color.ORANGE);
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnBack.setBounds(324, 276, 89, 25);
		contentPane.add(btnBack);
		
		
		
	}
}
