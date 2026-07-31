// This allows the program to use the Scanner class.
import java.util.Scanner;

public class scannerMathMachine {
    public static void main(String[] args) {

// This actually creates the scanner, gives it a name, and makes the keyboard the input device.
Scanner keyboard = new Scanner (System.in);

System.out.println( );
System.out.println("Welcome to the Math Machine!");
System.out.println( );

System.out.println("Enter your first number:");
int firstNumber = keyboard.nextInt();
System.out.println( );

System.out.println("Enter your second number:");
int secondNumber = keyboard.nextInt();
System.out.println( );

int sum = firstNumber + secondNumber;
System.out.println("The sum is: " + sum);

int difference = firstNumber - secondNumber;
System.out.println("The difference is: " + difference);

int product = firstNumber * secondNumber;
System.out.println("The product is: " + product);
System.out.println( );

System.out.println("One more question: Is the product your favorite number? 1 for yes, 2 for no.");
int favoriteNumberInquiry = keyboard.nextInt();
if (favoriteNumberInquiry == 1) { 
    System.out.println("Cool.");
}

else if (favoriteNumberInquiry == 2) {
    System.out.println("Well, sucks to be you I guess.");
}

else {
    System.out.println("That wasn't an option, bud.");
}

keyboard.close();

}

    }
