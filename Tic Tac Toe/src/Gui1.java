import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;

public class Gui1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui1 frame = new Gui1();
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
	public Gui1() {
		setBackground(Color.GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 736, 497);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Start Match");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				startt obj=new startt();
				obj.setVisible(true);
			dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(454, 87, 140, 52);
		contentPane.add(btnNewButton);
		
		JButton btnScore = new JButton("Score");
		btnScore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnScore.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnScore.setBackground(Color.ORANGE);
		btnScore.setBounds(454, 205, 140, 52);
		contentPane.add(btnScore);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(JOptionPane.showConfirmDialog(contentPane, "Confirm if you want to exit","Tic Tac Toe",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
						System.exit(0);
			}
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnExit.setBackground(Color.ORANGE);
		btnExit.setBounds(454, 328, 140, 52);
		contentPane.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\$AN\\Documents\\tic-tac-toe-2-638.jpg"));
		lblNewLabel.setBounds(10, 87, 434, 293);
		contentPane.add(lblNewLabel);
		
		JLabel lblWelcomeToMind = new JLabel("Welcome to Mind Game(Tic Tac Toe)");
		lblWelcomeToMind.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblWelcomeToMind.setBounds(108, 11, 445, 34);
		contentPane.add(lblWelcomeToMind);
		
		
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNewMatch = new JMenuItem("New Match");
		mnFile.add(mntmNewMatch);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(JOptionPane.showConfirmDialog(contentPane, "Confirm if you want to exit","Tic Tac Toe",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
						System.exit(0);
				}
			}
		});
		mnFile.add(mntmExit);
	
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmWelcome = new JMenuItem("Welcome");
		mnHelp.add(mntmWelcome);
		
		
		
		JMenuItem mntmAboutGame = new JMenuItem("About Game");
		mnHelp.add(mntmAboutGame);
	}
}
