import java.util.Scanner;
public class anotherMovieTicketThingDay6Or7ByNow {
    
public static int calculatePrice(int age, int tickets) {
int price = 0;
int fullCalculatedPrice = 0;

    if (age < 12) {
        price = 8;
    }
    else if (age >= 12 && age <= 64) {
        price = 12;
    }
    else {
        price = 10;
    }

fullCalculatedPrice = price * tickets;

    return fullCalculatedPrice;
}

public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);

    System.out.println("How many tickets are you purchasing?");
    int tickets = keyboard.nextInt();
    System.out.println("How old are you?");
    int age = keyboard.nextInt();
    int finalPrice = calculatePrice(age, tickets);
    System.out.println("That'll cost $" + finalPrice + ".");

}
}
