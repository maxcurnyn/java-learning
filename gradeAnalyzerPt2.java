import java.util.Scanner;
public class gradeAnalyzerPt2 {
    
public static double calculateAverage(double firstGrade, double secondGrade, double thirdGrade) {
    double gradeAverage = (firstGrade + secondGrade + thirdGrade) / 3;
    return gradeAverage;
}

public static void main(String [] args) {
    System.out.println("Enter your first grade:");
    Scanner keyboard = new Scanner(System.in);
    double firstGrade = keyboard.nextDouble();
    System.out.println("Enter your second grade:");
    double secondGrade = keyboard.nextDouble();
    System.out.println("Enter your third grade:");
    double thirdGrade = keyboard.nextDouble();

    double collectedGrade = calculateAverage(firstGrade, secondGrade, thirdGrade);

    System.out.println("Your final grade is " + collectedGrade + "%");

if (collectedGrade >= 92.5) {
    System.out.println("That's an A! Great job!");
}
else if (collectedGrade < 92.5 && collectedGrade >= 80) {
    System.out.println("Hey, that's a solid grade!");
}
else if (collectedGrade < 80 && collectedGrade >= 60) {
    System.out.println("Well, you're struggling, but still passing.");
}
else {
    System.out.println("Oof, yeah... You're definitely not gonna pass.");
}
}
}
