package GCLab14;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		Player human = new ConsolePlayer(scnr, "David ");
		Roshambo humanChoice = human.generateRoshambo();
		System.out.println(human.getName() + "played " + humanChoice);
		
		//Create the player
		Player opponent = new RockPlayer("Dwayne ");
		// Get the player's choice
		Roshambo opponentChoice = opponent.generateRoshambo();
		
		
		System.out.println(opponent.getName() + "played " + opponentChoice);
		
	}

}
