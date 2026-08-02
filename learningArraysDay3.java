import java.util.Scanner;
public class learningArraysDay3 {
    public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);

boolean running = true;

    String[] gameTitles = {
    "The Legend of Zelda: Ocarina of Time",
    "The Legend of Zelda: Majora's Mask",
    "Splatoon 3",
    "Persona 5 Royal",
    "Xenoblade Chronicles 3",
    "Chex Quest",
    "Metroid Dread",
    "Terraria",
    "Portal",
    "Hollow Knight: Silksong"
};

while (running == true) {

System.out.println();
System.out.println("1. View games");
System.out.println("2. Search for a game");
System.out.println("3. Count games");
System.out.println("4. Quit");
System.out.println();
System.out.print("Enter menu number to select: ");
int menuSelection = keyboard.nextInt();
keyboard.nextLine();



if (menuSelection == 1) {
System.out.println();
for (int i = 0; i < gameTitles.length; i++) {
    System.out.println((i + 1) + ". " + gameTitles[i]);
}
System.out.println();
}

else if (menuSelection == 2) {
    searchForAGame(keyboard);
}

else if (menuSelection == 3) {
    int numberOfGames = gameTitles.length;
    System.out.println("You have " + numberOfGames + " games in your collection.");
}

else if (menuSelection == 4) {
    running = false;
}
} // This bracket closes the while loop.
} // This bracket closes the main method.




// 2. Everything below belongs to the "Search for a game" part of the menu. DO NOT TOUCH, I'VE ALREADY FINISHED THIS PART.
public static void searchForAGame(Scanner keyboard) {
System.out.println();
System.out.println("Your game collection:");
System.out.println();
String[] gameTitles = {
    "The Legend of Zelda: Ocarina of Time",
    "The Legend of Zelda: Majora's Mask",
    "Splatoon 3",
    "Persona 5 Royal",
    "Xenoblade Chronicles 3",
    "Chex Quest",
    "Metroid Dread",
    "Terraria",
    "Portal",
    "Hollow Knight: Silksong"
};

for (int i = 0; i < gameTitles.length; i++) {
    System.out.println((i + 1) + ". " + gameTitles[i]);
}

System.out.println();
System.out.print("Enter a game title: ");
String userChoice = keyboard.nextLine();

boolean found = false;

for (int i = 0; i < gameTitles.length; i++) {
    if (userChoice.equals(gameTitles[i])) {
        System.out.println("You have this game in your collection!");
        found = true;
        break;
}
    }

if (!found) {
    System.out.println("That game title does not exist.");
}
} // This bracket closes the searchForAgame method.
}
