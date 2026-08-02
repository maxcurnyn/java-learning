import java.util.Scanner;
public class arrayGradeTracker {
    public static void main (String[] args) {

Scanner input = new Scanner(System.in);
int userChoice = 0;

double[] grades = {
92.5,
89.4,
90.1,
100.0,
75.8,
82.5
};

System.out.println("1. View grades");
System.out.println("2. Find Average");
System.out.println("3. Find lowest grade");
System.out.println("4. Replace a grade");
System.out.println("5. Quit");
userChoice = input.nextInt();

if (userChoice == 1) {
    System.out.println();
    int i = 0;
    while (i <= grades.length) {
    System.out.println(grades[i]);
    i++;
} // Closes while loop
} // Closes if body

else if (userChoice == 2) {
    System.out.println();

}












} // Closes the main method
} // Closes the class