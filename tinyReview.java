import java.util.Scanner;
public class tinyReview {
	public static void main(String[] args) {
		System.out.println();
		System.out.print("Enter a number: ");
		Scanner input = new Scanner(System.in);
		int userInput = input.nextInt();
		input.nextLine();

boolean running = true;

while (running == true) {
	if (userInput > 0) {
	System.out.println("Your number is positive.");
}
else if (userInput == 0) {
	System.out.println("Your number is 0.");
}
else if (userInput < 0) {
	System.out.println("Your number is negative.");
}

if (userInput % 2 == 0) {
	System.out.println("Your number is even.");
}
else if (userInput % 2 != 0) {
	System.out.println("Your number is odd.");

}

System.out.println();
System.out.println("Would you like to enter another number?");
System.out.print("Please type either y or n: "); 
String userContinue = input.nextLine();

if (userContinue.equals("y")) {
	System.out.println();
	System.out.println("Enter another number: ");
	userInput = input.nextInt();
	input.nextLine();
}
else if (userContinue.equals("n")) {
	running = false;
}
}
}
}
