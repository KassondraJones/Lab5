/*
 * Kassondra Jones
 * Lab 5
 * January 25, 2018
 * 
 */
import java.util.Random;
import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int dieSides;
		String userResponse;

		System.out.println("Welcome to the Grand Circus Casino!");
		System.out.println(" ");

		int i = 0;
		do {
			i++;
			System.out.println(" ");
			System.out.print("How many sides should each die have? ");
			dieSides = scan.nextInt();

			int die1 = randomNum1(dieSides);
			int die2 = randomNum2(dieSides);
			
			System.out.println(" ");
			System.out.println("Roll " + i + ": ");
			System.out.println(die1);
			System.out.println(die2);
			
			if ((die1 + die2 == 7) || (die1 + die2) == 11) {
				System.out.println("CRAPS!");
			}
			if (die1 == 1 && die2 == 1) {
				System.out.println("SNAKE EYES!");
			}
			if (die1 == 6 && die2 == 6) {
				System.out.println("BOX CARS!");
			}

			System.out.println(" ");
			System.out.println("Roll again?  (y/n):");
			userResponse = scan.next();

		} while (userResponse.contains("y"));

		System.out.println("Thank you for your time!");
		System.out.println("Goodbye!");

		scan.close();

	}

	public static int randomNum1(int dieSides) {
		Random randGen = new Random(); // New random number generator
		int randomNumOne = randGen.nextInt(dieSides) + 1;
		return randomNumOne;
	}

	public static int randomNum2(int dieSides) {
		Random randGen = new Random(); // New random number generator
		int randomNumTwo = randGen.nextInt(dieSides) + 1;
		return randomNumTwo;
	}

}
