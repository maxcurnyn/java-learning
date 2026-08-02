import java.util.Scanner;
public class learnArrays {
    public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);

// array = a collection of values of the same data type
// think of it as a variable that can store more than 1 value
// String[] basically says "We have an array of Strings" -- more than one value, but same data type

String[] hadestownSong = {
    "Road to Hell",
    "Any Way the Wind Blows",
    "Come Home with Me",
    "Wedding Song",
    "Epic I",
    "Livin' it Up on Top",
    "All I've Ever Known",
    "Way Down Hadestown",
    "A Gathering Storm",
    "Epic II",
    "Chant",
    "Hey, Little Songbird",
    "When the Chips Are Down",
    "Gone, I'm Gone",
    "Wait for Me",
    "Why We Build the Wall",
    "Our Lady of the Underground",
    "Way Down Hadestown (Reprise)",
    "Flowers",
    "Come Home with Me (Reprise)",
    "Papers",
    "If It's True",
    "How Long?",
    "Chant (Reprise)",
    "Epic III",
    "Promises",
    "Word to the Wise",
    "His Kiss, the Riot",
    "Wait for Me (Reprise)",
    "Doubt Comes In",
    "Road to Hell (Reprise)",
    "We Raise Our Cups"
};

//String[] leadVocalist = {
//    "André De Shields",
//    "Eva Noblezada",
//    "Reeve Carney",
//    "Reeve Carney",
//    "Reeve Carney",
//};

int[] act = {
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    2,
    2,
    2,
    2,
    2,
    2,
    2,
    2,
    2,
    2,
    2,
    2,
    2,
    2,
    2,
    2,
};

for (int i = 0; i < hadestownSong.length; i++) {
    System.out.println((i + 1) + ". " + hadestownSong[i]);
    // The "(i + 1)" part simply makes sure the first item in the list starts at 1 and not 0. Just a visual thing.
}

System.out.print("Choose a track number: ");
int trackNumber = keyboard.nextInt();

if (trackNumber >= 1 && trackNumber <= hadestownSong.length) {
System.out.println("You selected: " + hadestownSong[trackNumber -1]);
//System.out.println("Lead vocalist: " + leadVocalist[trackNumber -1]);
System.out.println("Act: " + act[trackNumber - 1]);
}
else {
    System.out.println("Please choose a number between 1 and 32.");
}
}
}
