import java.util.Scanner;
public class numberGuessingGame {
	public static void main(String[] args) {

int secretNumber = 42;

Scanner input = new Scanner(System.in);
System.out.println();
System.out.println("I'm thinking of a number between 1 and 100.");
System.out.println();
System.out.print("Guess: ");
int userGuess = input.nextInt();

while (userGuess != secretNumber) {
	if (userGuess > secretNumber) {
		System.out.println("Too high!");
			else if (userGuess < secretNumber) {
				System.out.println("Too low!");
} // Closes if
	} // Closes the main method
} // Closes the class
