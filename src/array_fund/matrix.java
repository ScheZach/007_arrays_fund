package array_fund;

import javax.swing.JOptionPane;

public class matrix {
	//Matrix is another name for a multi-dimentsional array
	//For example: a 2d array is often called a matrix
	//2D like a checkerboard, chess board, ect.
	String msg = "";
	boolean P1Turn = true;
	
	private int[][] ticTacToe = { 
		{0,1,2}, 
		{10,11,12}, 
		{20,21,22} 
	};//row, column
	
	private int[][] game = {
		{0,0,0},
		{0,1,0},
		{0,0,0}
	};
	
	private char[][] realGame = {
			{'_','_','_'},
			{'_','_','_'},
			{'_','_','_'}
	};
	
	String[][] checkers = new String[8][8];
	
	//printout by row and column
	public void test2D() {
		
		checkers[0][0]="red";
		checkers[0][7]="red king";
		checkers[3][4]=" ";
		checkers[7][0]="black";
		checkers[7][7]="black king";
		
		System.out.println("\nTest of 2D array\n");
		
		//System.out.println("\ntest ticTacToe[1][1] = " + ticTacToe[1][1]);
		for (int row = 0; row < ticTacToe.length; row++) {
			for (int col= 0; col < ticTacToe[0].length; col++) {
				System.out.println("test ticTacToe[" + row + "][" + col + "] = " + ticTacToe[row][col]);
			}
		}
		
		System.out.println();
		for (int row = 0; row < ticTacToe.length; row++) {
			for (int col = 0; col < ticTacToe[0].length; col++) {
				System.out.print(ticTacToe[row][col]+ " ");
			}
			System.out.println();
		}
		
	}
	
	public void gameBoard() {
		/*
		System.out.println("\nPrint initial game board, player starts in the middle\n");
		for (int row = 0; row < game.length; row++) {
			for (int col = 0; col < game[0].length; col++) {
				System.out.print(game[row][col]+ " ");
			}
			System.out.println();
		}
		*/
		System.out.println("\nWelcome to the game");
		createGameBoard();
		SelectRowCol();
		StatePlayer();
		SelectRowCol();
	}
	
	public void StatePlayer() {
		if (P1Turn == false) {
			msg = "Your turn player two";
			JOptionPane.showMessageDialog(null, msg);
		}
		else if (P1Turn == true) {
			msg = "Your turn player one";
			JOptionPane.showMessageDialog(null, msg);
		}
	}
	
	public void SelectRowCol() {
		msg = "What row would you like to select (1,2,3)";
		int rowSelect = Integer.parseInt(JOptionPane.showInputDialog(msg))-1;
		msg = "What column would you like to select (1,2,3)";
		int colSelect = Integer.parseInt(JOptionPane.showInputDialog(msg))-1;
		if (P1Turn == true) {
			realGame[rowSelect][colSelect] = 'X';
			P1Turn = false;
			System.out.println();
			createGameBoard();
		}
		else if (P1Turn == false) {
			realGame[rowSelect][colSelect] = 'O';
			P1Turn = true;
			System.out.println();
			createGameBoard();
		}
	}
	
	public void createGameBoard() {
		for (int row = 0; row < realGame.length; row++) {
			for (int col = 0; col < realGame[0].length; col++) {
				System.out.print(realGame[row][col]+ " ");
			}
			System.out.println();
		}
	}
	
}// end of Matrix
