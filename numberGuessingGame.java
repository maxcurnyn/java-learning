import java.util.Scanner;
public class numberGuessingGame {
	public static void main(String[] args) {

int userGuess = 999;

//int secretNumber = 42;

int secretNumber = (int) (Math.random() * 10 + 1); // I've never done the (int) thing before. It's called... Type casting? Converting one variable type to another. This basically tells the program to convert the double value produced by the Math.random part to an int instead of a double. Well, not really "convert"... It just chops off anything after the decimal. So 7.42 would turn into 7, 4.99 would turn into 4, etc. 
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
