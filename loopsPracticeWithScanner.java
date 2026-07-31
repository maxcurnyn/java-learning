import java.util.Scanner;
public class loopsPracticeWithScanner {
    public static void main(String[] args) {
System.out.println();
int secretNumber = 7;

System.out.println("I am thinking of a number between 1 and 10.");
System.out.println("Guess:");
Scanner keyboard = new Scanner(System.in);

int userGuess = keyboard.nextInt();

while (userGuess != 7) {
    System.out.println("Bad guess.");
    System.out.println("Guess again:");
    userGuess = keyboard.nextInt();
}

System.out.println("Correct!");

    }
}
