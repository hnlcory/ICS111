//Cory Parker Section 5
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.*;
import java.awt.Graphics;
public class InverseTicTacToe implements ActionListener {
	
	Font f1 = new Font("Helvetica", Font.PLAIN, 18);
	boolean playerTurn;
	Random r = new Random();
	JPanel title = new JPanel();//game title
	JPanel gameSpots = new JPanel();//board
	JLabel text = new JLabel();//text for top
	JButton[] buttons = new JButton[9];//board buttons
	JFrame window = new JFrame();//main window
	
	
	
	public static void main(String[] args) {
		InverseTicTacToe i1 = new InverseTicTacToe();
		i1.createBoard();
		i1.turnName();
		// TODO Auto-generated method stub

	}

	
	public void createBoard(){//creates board
		window.setSize(480,640);
		window.setTitle("Tic-Tac-Toe");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.DARK_GRAY);
		window.setLayout(new BorderLayout());
		window.setVisible(true);
		
		
		text.setBackground(Color.GRAY);
		text.setHorizontalAlignment(JLabel.CENTER);
		text.setFont(f1);
		
		
		
		
		for (int i=0; i<9;i++) {//create buttons
			buttons[i] = new JButton();
			
			gameSpots.add(buttons[i]);
		}
		
		gameSpots.setLayout(new GridLayout(3,3));
		gameSpots.setBackground(Color.BLACK);
		window.add(gameSpots);
		
		title.setLayout(new BorderLayout());
		title.setBounds(0,0,480,75);//x,y,width,height
		title.add(text);
		window.add(title,BorderLayout.NORTH);
		
		
		
		
	}

	public void turnName(){
		if (playerTurn= true) {
			text.setText("Player's Turn");
		}
		else {
			text.setText("NPC's Turn");
		}
	}
	
	public void startingTurn(){//who begins
		int upperbound = 2;
		int turn = r.nextInt(upperbound);
		
		if (turn == 1) {
			playerTurn = true; 
		}
		else {
			playerTurn = false;
		}
	}
	
	public void actionPerformed(ActionEvent e) {//mouseClicked i think
		// TODO Auto-generated method stub
		
	}
	
	public void winCheck(){//winner/loser
		
	}
	
	
	
	
	
	//create board
	//no x and o, square and diamonds
	//when user clicks square use mouseClicked event to detect
	//place users piece in square, computer random spot
	//check for win
	//when win found display winner, make game over obvious
	//user can close game
	
	
}

