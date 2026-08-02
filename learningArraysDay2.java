import java.util.Scanner;
public class learningArraysDay2 {
    public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);

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

    }
}