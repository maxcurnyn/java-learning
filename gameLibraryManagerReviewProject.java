import java.util.Scanner;

public class gameLibraryManagerReviewProject {
	public static void main(String[] args) {
		System.out.println();
		System.out.println("== GAME LIBRARY ==");
		System.out.println("1. View all games");
		System.out.println("2. Search for a game");
		System.out.println("3. Add a game");
		System.out.println("4. Remove a game");
		System.out.println("5. Quit");
		System.out.println();

boolean running = true;		
Scanner input = new Scanner(System.in);

	String[] games = {
    		"Minecraft",
    		"Elden Ring",
    		"Xenoblade Chronicles",
    		"Hades",
    		"Persona 5 Royal",
    		"Terraria"
	};

		System.out.print("Choose an option: ");
		int userChoice = input.nextInt();
		input.nextLine();
// Everything before this point works just fine. The variable userChoice has been collected.

if (userChoice == 1) {
System.out.println();
for (int i = 0; i < games.length; i++) {
	System.out.println(games[i]);
}
System.out.println();
} // Option 1 is fully programmed. Do not mess with it.
// Future self, I shall offer an explanation for how this stuff works in case you ever forget and need a good example:
// The for loop declares a new variable called i, and sets it to 0. This is because the first index of an array doesn't start at 1, it starts at 0. Thus, if you wanna make sure System.out.println("games[i]); actually prints everything within the array, you gotta make sure i actually starts at 0. The other stuff just specifies the condition of the loop and the change that'll occur after the loop runs. The loop shall run when the value of i is less than the number of indexes within the array called games, and i++ will simply add 1 to the value of i every time the loop finishes. So... hopefully that all makes sense. I don't really have any idea what I'm doing, I just pretend like I know what I'm doing and that seems to work most of the time.

else if (userChoice == 2) {
String userGameInput;
System.out.print("Type the exact name of the game you are looking for: ");
userGameInput = input.nextLine();

for (int i = 0; i < games.length; i++) {
	if (games[i].equals(userGameInput)){
		System.out.println();
		System.out.println("You own " + userGameInput + ".");
		System.out.println();
}
}
}

else if (userChoice == 3) {

}

else if (userChoice == 4) {

}

else if (userChoice == 5) {
	running = false;
	System.out.println("Quitting...");
} // Option 5 is fully programmed. Do not mess with it.		
		
		
	} // Closes the main method
} // Closes the class
