package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("What pet would you like to buy?");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i=0; i<10; i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What would you like to do with your pet?", "HappyPet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Feed", "Walk", "Clean" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (task == 0) {
				feed();
			}
			else if (task == 1){
				walk();
			}
			else if (task == 2) {
				clean();
			}
			System.out.println(happinessLevel);
			if (happinessLevel == 7) {
				JOptionPane.showMessageDialog(null, "You love your pet.");
				break;
			}
		}

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		

	}

	// 4. Create methods to handle each of your user selections. 
		public static void feed() {
			JOptionPane.showMessageDialog(null, "Your pet enjoys its food.");
			happinessLevel+=1;
		}
		public static void walk() {
			JOptionPane.showMessageDialog(null, "Your pet enjoys its walk.");
			happinessLevel+=1;
		}
		public static void clean() {
			JOptionPane.showMessageDialog(null, "Your pet hates its cleaning.");
			happinessLevel-=1;
		}
		
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}