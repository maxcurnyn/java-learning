import java.util.Scanner;
public class rollerCoasterthing {
    
public static boolean canRideRollerCoaster(int height) {
    boolean yesOrNo = true;
    if (height >= 48) {
        yesOrNo = true;
}
    if (height < 48) {
        yesOrNo = false;
    }
    return yesOrNo;
    }

public static void main(String[] args) {
    Scanner keyboard = new Scanner (System.in);
    System.out.println("Welcome! How tall are you?");
    int height = keyboard.nextInt();
    boolean returnedYesOrNo = canRideRollerCoaster(height);
    if (returnedYesOrNo == true) {
        System.out.println("Alright,you're tall enough.");
    }
    else {
        System.out.println("Sorry, you're not tall enough.");
    }

}
}
