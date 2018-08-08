
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

import java.text.*;
  


public class tictactoe implements ActionListener {
    JFrame window = new JFrame("Tic Tac Toe");
    JButton b[] = new JButton[9];
    
   

    String letter = "";
    Icon defaultIcon ;
//    int i=0;
    ImageIcon X;
    ImageIcon O;
    ImageIcon ltr;
    int value = 0;
    boolean win = false;
    String[] letters = new String[9];
    
    private void StartingWindow() {
    	
    	
    	
    }
    
    private void reset() {
    	//letters array empty string
    	for (int i = 0; i < 9; i++) {
    		letters[i] = "";
    		value = 0;
    		win = false;
    		b[i].setIcon(defaultIcon);
    		
    	}
    	
    }
    public tictactoe() {
        // Initialize Array
        for (int i = 0; i < 9; i++) {
            letters[i] = "";
        }

        // Assign images
        X = new ImageIcon(getClass().getResource("X.png"));
        O = new ImageIcon(getClass().getResource("O.png"));
        // Create the Window
        window.setSize(736,497);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new GridLayout(3,3));

        // Add Buttons
        
        JMenuBar menuBar = new JMenuBar(); 
        JMenu fileMenu = new JMenu("Game"); 
        fileMenu.setMnemonic('G');
         
        JMenu editMenu = new JMenu("Help"); 
        editMenu.setMnemonic('H');
        JMenuItem btn = new JMenuItem("Main Menu");
        JMenuItem newMenuItem = new JMenuItem("NewGame"); 
        JMenuItem openMenuItem = new JMenuItem("Scores"); 
        JMenuItem saveMenuItem = new JMenuItem("Save"); 
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        JMenuItem new1MenuItem = new JMenuItem("help"); 
        JMenuItem new2MenuItem = new JMenuItem("about"); 
        fileMenu.add(btn);
        fileMenu.add(newMenuItem); 
        fileMenu.add(openMenuItem); 
        fileMenu.add(saveMenuItem); 
        fileMenu.add(exitMenuItem); 
        editMenu.add(new1MenuItem);
         
        editMenu.add(new2MenuItem);
         
         
        menuBar.add(fileMenu); 
        menuBar.add(editMenu); 
         
        window.setJMenuBar(menuBar);
         
        for (int i = 0; i < 9; i++) {
            b[i] = new JButton();
            window.add(b[i]);
            
        }

        defaultIcon = b[0].getIcon();
        // Add ActionListener
        for (int i = 0; i < 9; i++) {
            b[i].addActionListener(this);
        }
        btn.addActionListener(new ActionListener()
        {public void actionPerformed(ActionEvent ae)
        {Gui1 objn=new Gui1();
		objn.setVisible(true);
		window.dispose();
		
        }
        });
            newMenuItem.addActionListener(new ActionListener()
            {public void actionPerformed(ActionEvent ae)
            {new tictactoe();
            }
            });
            exitMenuItem.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent m)
                {
                	if(JOptionPane.showConfirmDialog(window, "Confirm if you want to exit","Tic Tac Toe",
    						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
    						System.exit(0);
    				}
                }
            });
            new2MenuItem.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent n)
                {
                    JOptionPane.showMessageDialog(window,"this game is developed by three Members");
                    
                }
            });
            openMenuItem.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent x)
                {
                	SimpleTableExample maintictactoe    = new SimpleTableExample();
                    maintictactoe.setVisible( true );
                     
                     
                }
             
             } );
             
            new1MenuItem.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent u)
                {
                    JOptionPane.showMessageDialog(window,"simple game played by two players with the help of mouse click");
                }
            });
             
        

        window.setVisible(true);
    }

    public void actionPerformed(ActionEvent a) {
        value++;
        // Who's Turn
        if (value % 2 == 1) {
            ltr = X;
            letter = "X";
        }
        if (value % 2 == 0) {
            ltr = O;
            letter = "O";
        }

        // Display Letters
        for (int i = 0; i < 9; i++) {
            if (a.getSource() == b[i]) {
            	
                b[i].setIcon(ltr);
                b[i].setDisabledIcon(ltr);
                b[i].setEnabled(false);
                letters[i] = letter;
            }
        }

        // Who Won

        // Horizontal
        if (letters[0].equals(letters[1]) && letters[1].equals(letters[2]) && !letters[0].equals("")) {
            win = true;
        } else if (letters[3].equals(letters[4]) && letters[4].equals(letters[5]) && !letters[3].equals("")) {
            win = true;
        } else if (letters[6].equals(letters[7]) && letters[7].equals(letters[8]) && !letters[6].equals("")) {
            win = true;
        }

        // Vertical
        if (letters[0].equals(letters[3]) && letters[3].equals(letters[6]) && !letters[0].equals("")) {
            win = true;
        } else if (letters[1].equals(letters[4]) && letters[4].equals(letters[7]) && !letters[1].equals("")) {
            win = true;
        } else if (letters[2].equals(letters[5]) && letters[5].equals(letters[8]) && !letters[2].equals("")) {
            win = true;
        }

        // Diagonal
        if (letters[0].equals(letters[4]) && letters[4].equals(letters[8]) && !letters[0].equals("")) {
            win = true;
        } else if (letters[2].equals(letters[4]) && letters[4].equals(letters[6]) && !letters[2].equals("")) {
            win = true;
        }

        if (win) {
            JOptionPane.showMessageDialog(window, "Player " + letter + " wins!");
            if(JOptionPane.showConfirmDialog(window, "Do you want to Restart","Tic Tac Toe",
					JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {

//					System.exit(0);
            	reset();
            }
//            for (JButton i : b) {
//                i.setEnabled(false);
//            }
        } else if (!win && value == 9) {
            JOptionPane.showMessageDialog(window, "The game ended in a tie.");
            if(JOptionPane.showConfirmDialog(window, "Do you want to Restart","Tic Tac Toe",
					JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					//System.exit(0);
            	reset();
            		
        }
        }}
    

    public static void main(String[] args) {
    	
    	
        new tictactoe();
        
    }

	public void setVisible(boolean c) {
		// TODO Auto-generated method stub
		
	}
}
class Static {
	 
public static int check_wins=0;
public static int check_wins1=0;
public static int total_games=0;
public static int percentage_games;
public static int percentage_games1;
}