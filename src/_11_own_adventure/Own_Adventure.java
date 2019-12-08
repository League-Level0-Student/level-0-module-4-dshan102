package _11_own_adventure;

import javax.swing.JOptionPane;

public class Own_Adventure {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Your name is Person. You are one of the top detectives in the world. Many people condsider you 'Sherlock Holmes in the flesh'.");
	JOptionPane.showMessageDialog(null, "Shortly after finishing your latest mission, you are assigned a new mission. Your mission is to uncover the culprit of a series of robberies in your city.");
	String location1 = JOptionPane.showInputDialog("The robberies happened at a local grocery store and a local barbershop. Will you investigate the barbershop or the grocery store first?");
	if (location1.equalsIgnoreCase("Grocery store")) {
		JOptionPane.showMessageDialog(null, "You decide to check the grocery store first. After investigating the store, you discover two possible suspects: bot1 and bot2.");
		String next = JOptionPane.showInputDialog("Would you like to look into the suspects or investigate the barber shop?");
		if (next.equalsIgnoreCase("investigate")) {
			JOptionPane.showMessageDialog(null, "You decide to further investigate the suspects. You discover that bot2 has an extensive criminal record, but bot1 is innocent.");
			String end = JOptionPane.showInputDialog("Would you like to investigate the barber shop to confirm your suspicions about bot2 or just go with your gut.");
			if (end.equalsIgnoreCase("confirm")) {
				JOptionPane.showMessageDialog(null, "You decide to make sure that bot2 is truly the culprit by searching the barber shop.  Sure enough, you find that he is also a suspect of the robbery.");
				JOptionPane.showMessageDialog(null, "Using the evidence you have gathered, you are able to correctly identify bot2 as the culprit and your reputation remains perfect.  The End!");
			}
			else if (end.equalsIgnoreCase("trust")) {
				JOptionPane.showMessageDialog(null, "You decide to trust your gut on this one. Unfortunately, the rest of the police think that your evidence is unsubstantial and they let bot2 go.  You failed.  The End!");
			}
		}
		else if (next.equalsIgnoreCase("barber shop")) {
			JOptionPane.showMessageDialog(null, "You decide to make sure that bot2 is truly the culprit by searching the barber shop.  Sure enough, you find that he is also a suspect of the robbery.");
			JOptionPane.showMessageDialog(null, "Using the evidence you have gathered, you are able to correctly identify bot2 as the culprit and your reputation remains perfect.  The End!");
		}
			
	}	
	else if (location1.equalsIgnoreCase("barber shop")){
		JOptionPane.showMessageDialog(null, "You decide to investigate the barber shop first.  After investigating the barber shop, you discover two suspects: bot2 and bot3.");
		String next1 = JOptionPane.showInputDialog("Would you like to further investigate the suspects or search the grocery store?");
			if(next1.equalsIgnoreCase("continue")) {
				JOptionPane.showMessageDialog(null, "You decide to further investigate the suspects. You discover that bot2 has an extensive criminal record, but bot3 is innocent.");
				String end1 = JOptionPane.showInputDialog("Would you like to investigate the barber shop to confirm your suspicions about bot2 or just go with your gut.");
				if (end1.equalsIgnoreCase("confirm")) {
					JOptionPane.showMessageDialog(null, "You decide to make sure that bot2 is truly the culprit by searching the grocery store.  Sure enough, you find that he is also a suspect of the robbery.");
					JOptionPane.showMessageDialog(null, "Using the evidence you have gathered, you are able to correctly identify bot2 as the culprit and your reputation remains perfect.  The End!");
				}
				else if (end1.equalsIgnoreCase("trust")) {
					JOptionPane.showMessageDialog(null, "You decide to trust your gut on this one. Unfortunately, the rest of the police think that your evidence is unsubstantial and they let bot2 go.  You failed.  The End!");
				}
			}
			else if (next1.equalsIgnoreCase("barber shop")) {
				JOptionPane.showMessageDialog(null, "You decide to make sure that bot2 is truly the culprit by searching the grocery store.  Sure enough, you find that he is also a suspect of the robbery.");
				JOptionPane.showMessageDialog(null, "Using the evidence you have gathered, you are able to correctly identify bot2 as the culprit and your reputation remains perfect.  The End!");
			}
		}

	
}
}
