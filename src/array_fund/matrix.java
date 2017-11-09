package array_fund;

public class matrix {
	//Matrix is another name for a multi-dimentsional array
	//For example: a 2d array is often called a matrix
	//2D like a checkerboard, chess board, ect.
	
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
		System.out.println("\nPrint initial game board, player starts in the middle\n");
		for (int row = 0; row < game.length; row++) {
			for (int col = 0; col < game[0].length; col++) {
				System.out.print(game[row][col]+ " ");
			}
			System.out.println();
		}
		System.out.println("\nMake the 1 move\n");
		realGame[0][0] = 'X';
		realGame[1][1] = 'X';
		realGame[2][2] = 'O';
		for (int row = 0; row < realGame.length; row++) {
			for (int col = 0; col < realGame[0].length; col++) {
				System.out.print(realGame[row][col]+ " ");
			}
			System.out.println();
		}

	}
	
}// end of Matrix
