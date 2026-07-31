import java.util.Scanner;

public class runningCalc {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

System.out.println();

System.out.println("How many miles did you run?");
double milesRan = keyboard.nextDouble();
System.out.println();

if (milesRan <= 0) {
    System.out.println("You ran 0 miles? Why are you even here?");
    System.exit(0);
}

System.out.println("How many minutes did it take?");
double minutes = keyboard.nextDouble();
System.out.println();

double averagePace = minutes / milesRan;
System.out.println("Your average pace was " + averagePace + " minutes per mile.");

if (averagePace <= 8.0) {
    System.out.println("That's pretty good! Try harder next time though, that's pretty slow. For me. But it's fast for you. Since you're slow.");
}

else if (averagePace > 8.0) {
    System.out.println("You're pretty slow.");
}

    }
}
