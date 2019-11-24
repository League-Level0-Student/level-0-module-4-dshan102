package _06_test_scores;

import javax.swing.JOptionPane;

public class test_scores {
public static void main(String[] args) {
	String score = JOptionPane.showInputDialog("What did you get on the test?");
	double score1 = Double.parseDouble(score);
	if (score1<=70) {
		JOptionPane.showMessageDialog(null, "You failed. :(");
	}
	if (score1>70 && score1<=90) {
		JOptionPane.showMessageDialog(null, "You did okay.");
	}
	if (score1>=90 && score1<100) {
		JOptionPane.showMessageDialog(null, "You did great.");
	}
	if(score1==100) {
		JOptionPane.showMessageDialog(null, "You did amazing. :)");
	}
}
}
