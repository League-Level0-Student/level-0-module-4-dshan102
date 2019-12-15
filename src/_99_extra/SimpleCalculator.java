package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
		for (int i=0; i<4; i++) {
		// 1. Get 2 numbers from the user and convert them to integer.
		String num1s = JOptionPane.showInputDialog("Give me an integer.");
		int num1 = Integer.parseInt(num1s);
		String num2s = JOptionPane.showInputDialog("Give me another integer.");
		int num2 = Integer.parseInt(num2s);

		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "The question", "Simple Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Divide", "Multiply", "Subtract", "Add" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		if(operation == 3) {
		add(num1, num2);}
		if(operation == 2) {
		subtract(num1, num2);}
		if(operation == 1) {
		multiply(num1, num2);}
		if(operation == 0) {
		divide(num1, num2);}
		}

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	static void add(int num1, int num2) {
		JOptionPane.showMessageDialog(null, num1+num2);
	}
	static void subtract(int num1, int num2) {
		JOptionPane.showMessageDialog(null, num1-num2);
	}
	static void multiply(int num1, int num2) {
		JOptionPane.showMessageDialog(null, num1*num2);
	}
	static void divide(int num1, int num2) {
		JOptionPane.showMessageDialog(null, num1/num2);
	}

	// 4. Create similar methods for subtraction, multiplication and division.
}
