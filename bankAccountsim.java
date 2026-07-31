import java.util.Scanner;
public class bankAccountsim {
    public static void main(String[] args) {
System.out.println();
double balance = 100.00;

System.out.println("Welcome to the bank.");
System.out.println("Current balance: $" + balance);
System.out.println();
System.out.println("Would you like to:");
System.out.println("1. Deposit");
System.out.println("2. Withdraw");
System.out.println("(Type '1' or '2')");

Scanner keyboard = new Scanner(System.in);

int userChoice = keyboard.nextInt();

if (userChoice == 1) {
    System.out.println("How much would you like to deposit?");
    double depositAmount = keyboard.nextDouble();
    double newBalance = depositAmount + balance;
    System.out.println("Deposit successful.");
    System.out.println("New balance: $" + newBalance);
    
}

else if (userChoice == 2) {
    System.out.println("How much would you like to withdraw?");
    double withdrawAmount = keyboard.nextDouble();
    if (withdrawAmount > balance) {
        System.out.println("Insufficient funds.");
        System.exit(0);
    }
    double newBalance = balance - withdrawAmount;
    System.out.println("Withdrawal successful.");
    System.out.println("New balance: $" + newBalance);
}
    }
}
