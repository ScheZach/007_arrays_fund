package array_fund;

public class runner {

	public static void main(String[] args) {
		
		confirmMain("We are in main()");
		
		arrayFund learnArrays = new arrayFund();
		learnArrays.showInstruction();
		learnArrays.intArrayExample();
		
		matrix my2D = new matrix();
		my2D.test2D();
		my2D.gameBoard();
		
	}

	private static void confirmMain(String string) {
		System.out.println(string);
		
	}

}
