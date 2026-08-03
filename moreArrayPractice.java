import java.util.Scanner;
public class moreArrayPractice {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);

String[] books = {
    "1984",
    "The Long Way to a Small, Angry Planet",
    "The Anthropocene Reviewed",
    "Neverwhere",
    "Anansi Boys",
};

System.out.println("Press enter to get a random book recommendation");
System.out.println("Press q to quit");
String userChoice = input.nextLine();

if (userChoice.equals("")) {
    System.out.println("It works.");
}
else if (userChoice.equals("q")) {
    System.out.println("Quitting...");
}


// This little mini-project thing is unfinished. I'll work on it a bit more later.



    } // main method
} // class
