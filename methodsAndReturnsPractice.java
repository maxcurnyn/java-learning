public class methodsAndReturnsPractice {

public static int addOneMethod(int originalNumber) {
    int oneAdded = originalNumber + 1;
    return oneAdded;
}

public static void main(String[] args) {
    int originalNumber = 8;
    int oneAddedComplete = addOneMethod(originalNumber);
    System.out.println(originalNumber + " + 1 = " + oneAddedComplete);
}

}
