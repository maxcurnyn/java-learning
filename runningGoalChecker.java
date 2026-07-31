import java.util.Scanner;
public class runningGoalChecker {
    public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in); 

System.out.println("What is your name?");
String userName = keyboard.nextLine();

System.out.println("Huh. " + userName + ". Weird name. Anyways, how many miles did you run today?");
double milesRan = keyboard.nextDouble();

System.out.println("Alright, you ran " + milesRan + " miles today... Now, how many days did you run this week?");
int daysRan = keyboard.nextInt();

System.out.println("Hm. Let's take a look at this... " + milesRan + " miles today... " + daysRan + " days of running this week...");

if (milesRan >= 8 && daysRan >= 5) {
    System.out.println("Hey, great work, " + userName + "!");
}
else if (milesRan == 5 || daysRan >= 4) {
    System.out.println("Well, " + userName + "... I guess this is fine...");
}

else {
    System.out.println("Really " + userName + "? What a shitty effort...");
}
    }
}
