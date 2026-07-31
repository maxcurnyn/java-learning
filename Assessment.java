public class Assessment {
    public static void main(String[] args) {

int age = 17;
boolean hasStudentID = true;
boolean isWeekend = true;
int price;

System.out.println(age);
System.out.println(hasStudentID);
System.out.println(isWeekend);

if (age < 12) {
    price = 5;
}

else if (age >= 12 && age <= 64) {
    price = 10;
}

else {
    price = 7;
}

if (isWeekend && hasStudentID) {
    price = price - 2;
}





System.out.println();
System.out.println(price);
}
    }
