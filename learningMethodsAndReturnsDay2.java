import java.util.Scanner;
public class learningMethodsAndReturnsDay2 {

public static int doubleNumberMethod(int originalNumber) {
int doubledNumberVariable = originalNumber * 2;
return doubledNumberVariable;
}

public static void main(String[] args) {

int originalNumber = 5;
int doubledComplete = doubleNumberMethod(originalNumber);

System.out.println(doubledComplete);

}

}
