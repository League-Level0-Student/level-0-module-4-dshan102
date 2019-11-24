package _07_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
        int result = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION); 
        if(result == JOptionPane.YES_OPTION) {
        	int result1 = JOptionPane.showConfirmDialog(null, "Are you on vacation?", "Vacation", JOptionPane.YES_NO_OPTION);
        	if(result1 == JOptionPane.YES_OPTION) {
        		JOptionPane.showMessageDialog(null, "Sleep in.");
        	}
        	if (result1 == JOptionPane.NO_OPTION) {
        		JOptionPane.showMessageDialog(null, "Wake up lazybones!");
        	}	
        }
        if (result == JOptionPane.NO_OPTION) {
        	JOptionPane.showMessageDialog(null, "Sleep in.");
        }
        

        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }
}
