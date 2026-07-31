import java.util.Scanner;
public class anotherMiniProjectToReviewStuffWith {
    public static void main(String [] args) { 

// This just sets up a Scanner named keyboard.
Scanner keyboard = new Scanner(System.in);

System.out.println("What is your name?");
String userName = keyboard.nextLine();

System.out.println("How old are you?");
int userAge = keyboard.nextInt();

System.out.println("Do you have a pass?");
System.out.println("Please type 'true' or 'false'.");
boolean hasPass = keyboard.nextBoolean();

System.out.println("Checking your information...");

for (int i = 1; i <= 3; i++) {
    System.out.println("Checking...");
}

if (userAge >= 18 && hasPass) {
    System.out.println("Welcome in, " + userName + "!");
}
else if (userAge >= 18 && hasPass == false) {
    System.out.println("You're old enough, but you still need a pass to get in.");
}
else {
    System.out.println("Under 18? Sorry, with or without a pass, I can't let you in, " + userName + "...");
}



    }
}
