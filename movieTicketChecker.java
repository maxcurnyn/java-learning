import java.util.Scanner;
public class movieTicketChecker {
    
public static double calculatePrice(int age) {
double calculatedPrice;

    if (age >= 65) {
        calculatedPrice = 5.00;
    }
    else if (age <= 64 && age >= 12) {
        calculatedPrice = 10.00;
    }
    else {
        calculatedPrice = 7.00;
    }
    return calculatedPrice;
}

public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Welcome to the movie theater!");
    System.out.println("How old are you?");
    int age = keyboard.nextInt();
    double returnedPrice = calculatePrice(age);
    System.out.println("You said you're " + age + "? Okay, then that'll be... $" + returnedPrice + ", please.");
}

















}
