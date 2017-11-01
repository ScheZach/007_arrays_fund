package array_fund;

import javax.swing.JOptionPane;

public class arrayFund {
	
	public void showInstruction() {
		
		String msg ="Essential rules for arrays";
		String msg1 = "1. Arrays have a FIXED length!!! At the time they are created.";
		String msg2 = "2. Two ways to set array size:";
		String msg3 = " -- One way is to set size when created with [size]";
		String msg4 = " -- other way is to set size from initial data {x, y, z}";
		String msg5 = "Dynamic - when program is running:";
		String msg6 = "Can NOT NOT NO WAY NO HOW change SIZE of the array!!";
		String msg7 = "You can change values";
		
		msg = (msg + "\n" + msg1 + "\n" + msg2 + "\n" + msg3 + "\n" + msg4);
		
		JOptionPane.showMessageDialog(null, msg);
	}//end of showInstruction
	
	public void intArrayExample() {
		//this is the two step method
		int[] intTest = new int [10];
		intTest[0] = 10;
		intTest[1] = 11;
		intTest[2] = 12;
		intTest[3] = 13;
		intTest[4] = 14;
		intTest[5] = 15;
		intTest[6] = 16;
		intTest[7] = 17;
		intTest[8] = 18;
		intTest[9] = 19;
		//this combines the assigning of length and values
		int[] intTwoTest = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		
		System.out.println("\nStarting test of intTest[]\n");
		for (int i = 0; i < intTest.length; i++) {
			System.out.println("intTest[" + i + "]: " + intTest[i]);
		}
		System.out.println("\nStarting test of intTwoTest[]\n");
		for (int i = 0; i < intTwoTest.length; i++) {
			System.out.println("intTest[" + i + "]: " + intTwoTest[i]);
		}
		
	}
	
}
