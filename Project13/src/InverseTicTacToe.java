//Cory Parker Section 5
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.*;
import java.awt.Graphics;

public class InverseTicTacToe  {
	
	Font f1 = new Font("Helvetica", Font.PLAIN, 18);
	boolean playerTurn=false;//player or computer
	boolean gameOn = false;//track if game is on
	Random r = new Random();
	JPanel title = new JPanel();//game title
	JPanel gameSpots = new JPanel();//board
	JLabel text = new JLabel();//text for top
	JButton[] buttons = new JButton[9];//board buttons
	JFrame window = new JFrame();//main window
	mouseClicker m1 = new mouseClicker();//check for click
	
	JLabel square = new JLabel();
	JLabel diamond = new JLabel();
	
	
	
	
	
	public static void main(String[] args) {
		InverseTicTacToe i1 = new InverseTicTacToe();
		i1.createBoard();
		i1.turnName();
		while (i1.gameOn == true) {//game here
			if (i1.playerTurn ==true) {//player turn
				
				
			}
			else {//computer turn
				int ranSpot = i1.r.nextInt(9-1+1)+1;
				System.out.println(ranSpot);
			}
		}
		
		
		// TODO Auto-generated method stub

	}

	
	public void createBoard(){//creates board
		gameOn = true;
		window.setSize(240,320);
		window.setTitle("Tic-Tac-Toe");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.DARK_GRAY);
		window.setLayout(new BorderLayout());
		window.setVisible(true);
		
		
		text.setBackground(Color.GRAY);
		text.setHorizontalAlignment(JLabel.CENTER);
		text.setFont(f1);
		
		title.setLayout(new BorderLayout());
		title.setBounds(0,0,480,75);//x,y,width,height
		title.add(text);
		
		
		for (int i=0; i<9;i++) {//create buttons
			buttons[i] = new JButton();
			buttons[i].addMouseListener(m1);
			gameSpots.add(buttons[i]);
			
		}
		
		gameSpots.setLayout(new GridLayout(3,3));
		gameSpots.setBackground(Color.BLACK);
		
		
		window.add(gameSpots);
		window.add(title,BorderLayout.NORTH);

		
	}

	
	public void drawSquare(){
		
	}
	
	public void drawDiamond() {
		
	}
	
	
	public void turnName(){
		if (playerTurn= true) {
			text.setText("Player's Turn (Square)");
		}
		else {
			text.setText("NPC's Turn (Diamond)");
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
	
	
	
	public void winCheck(){//winner/loser
		
	}

	
	public class mouseClicker extends MouseAdapter{
		
		public void mousePressed(MouseEvent e) {
		      System.out.println(e.getSource());
		      System.out.println(e.getX()+", "+e.getY());
		      System.out.println();
		      ((JButton)e.getSource()).setText("X");
		      
		      
		   }
	}
	
	
	
	//create board
	//no x and o, square and diamonds
	//when user clicks square use mouseClicked event to detect
	//place users piece in square, computer random spot
	//check for win
	//when win found display winner, make game over obvious
	//user can close game
	
	
}
