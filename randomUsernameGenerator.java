import java.util.Scanner;
public class randomUsernameGenerator {

public static String generateUsername() {

String[] adjectives = {
    "Strong",
    "Weak",
    "Small",
    "Large",
    "Silent",
    "Amazing",
    "Foolish",
};

String[] nouns = {
    "Pasta",
    "Joker",
    "Octopus",
    "Pen",
    "Sunglasses",
    "Mechanic",
    "Palace",
};

String[] numbers = {
    "1",
    "2",
    "3",
    "4",
    "5",
    "6",
    "7"
};

String[] moreNumbers = {
    "1",
    "2",
    "3",
    "4",
    "5",
    "6",
    "7"
};

int adjectivesIndexChoice = (int)(Math.random() * adjectives.length);
int nounsIndexChoice = (int)(Math.random() * nouns.length);
int numbersIndexChoice = (int)(Math.random() * numbers.length);
int moreNumbersIndexChoice = (int)(Math.random() * moreNumbers.length);

String username = adjectives[adjectivesIndexChoice] + nouns[nounsIndexChoice] + numbers[numbersIndexChoice] + moreNumbers[moreNumbersIndexChoice];
return username;
} // This closes the generateUsername method.

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

boolean running = true;

while (running) {

System.out.println();
System.out.println("Press Enter to generate a username or q to quit.");
System.out.println();

String userChoice = keyboard.nextLine();

if (userChoice.equals("")) {
    System.out.println(generateUsername());
}

if (userChoice.equals("q")) {
    System.out.println("Quitting...");
    running = false;
}
} // This closes the boolean.
    } // This closes the main method.
} // This closes the class.
