import java.util.Scanner;
public class numberGuessingGame {
	public static void main(String[] args) {

int userGuess = 0;

//int secretNumber = 42;

double secretNumber = (Math.random() * 10); //Generates a random decimal value between 0 and 1 AND multiplies it by 10 before checking if it can evenly be divided by 1 
System.out.println(secretNumber);


Scanner input = new Scanner(System.in);
System.out.println();
System.out.println("I'm thinking of a number between 1 and 100.");
System.out.println();
//System.out.print("Guess: ");
//int userGuess = input.nextInt();

while (userGuess != secretNumber) {
	System.out.print("Guess: ");
userGuess = input.nextInt();

	if (userGuess > secretNumber) {
		System.out.println("Too high!");
	}			
		else if (userGuess < secretNumber) {
				System.out.println("Too low!");
		}

} // Closes the while loop	

System.out.println();
System.out.println("You got it! The secret number was " + secretNumber + ".");
System.out.println();

} // Closes the main method
} // Closes the class
