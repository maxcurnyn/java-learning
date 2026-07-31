// This imports the scanner so you can use it later.
import java.util.Scanner;

// This is just the class. You do not need to mess with this.
public class learningMethodsAndReturnValues {
    
// This is the method that the main method will call upon when it needs the value of the average.
public static double calculateAverage(double grade1, double grade2, double grade3) {
    double average = (grade1 + grade2 + grade3) / 3;
    return average;
}

// This is the main method. Within this, you will collect user input, throw it into variables,
// then eventually those same variables will be used in the other method to calculate the
// value of the variable average. This value will be returned back to the main method so it can
// be used by the main method again.
public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
    System.out.println("Welcome to the Grade Analyzer!");
    System.out.println("Enter your first grade:");
    double grade1 = keyboard.nextDouble();
    System.out.println("Enter your second grade:");
    double grade2 = keyboard.nextDouble();
    System.out.println("Enter your third grade:");
    double grade3 = keyboard.nextDouble();

    double average = calculateAverage(grade1, grade2, grade3);






}

// This is the boolean method. It'll basically look at the value of the variable average
// and assess it. If average is above 60, then it's a pass. If it's below 60, it's a fail.
public static boolean hasPassed(double average) {

if (average < 60.00) {
    return false;
}
else{
    return true;
}
}
}