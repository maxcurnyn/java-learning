import java.util.Scanner;
public class temperatureConverter {

public static double convertToFahrenheit(double celsius) {
    double convertedTemp = celsius * 9 / 5 + 32;
    return convertedTemp;
}

public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter temperature in Celcius:");
    double celsius = keyboard.nextDouble();
    double convertedTempCompleted = convertToFahrenheit(celsius);
    System.out.println("Celsius: " + celsius);
    System.out.println("Fahrenheit: " + convertedTempCompleted);

}
}
