public class personalizedGreeting {
    
public static String greeting(String userName) {
    String collectedGreeting = "Hello, " + userName + "!";




    return collectedGreeting;
}

public static void main(String[] args) {
    String userName = "Max";
    String completedGreeting = greeting(userName);
    System.out.println(completedGreeting);





}
}
