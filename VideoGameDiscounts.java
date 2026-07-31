public class VideoGameDiscounts {
    public static void main(String[] args) {

double price;
int age = 17;
boolean hasMembership = true;
boolean isSaleDay = true;

if (age < 13) {
    price = 30.00;
}

else if (age >= 13 && age <= 64) {
    price = 60.00;
}

else {
    price = 40.00;
}

if (hasMembership) {
    price = price - 10.00;
}

if (isSaleDay && price >= 50.00) {
    price = price - 5.00;
}

System.out.println(age);
System.out.println(hasMembership);
System.out.println(isSaleDay);
System.out.println(price);

    }
}
