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

			System.out.println(" ");
			System.out.println("Roll " + i + ": ");
			System.out.println(randomNum1(dieSides));
			System.out.println(randomNum2(dieSides));
			
			if (((randomNum1(dieSides) + randomNum2(dieSides)) == 7) || ((randomNum1(dieSides) + randomNum2(dieSides)) == 11)) {
				System.out.println("CRAPS!");
			}
			if (((randomNum1(dieSides) == 1) && (randomNum2(dieSides) == 1))) {
				System.out.println("SNAKE EYES!");
			}
			if (((randomNum1(dieSides) == 6) && (randomNum2(dieSides) == 6))) {
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
