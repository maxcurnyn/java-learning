public class Day3 {
    public static void main(String[] args) { 

int evenCount = 0;
int oddCount = 0;

for (int i = 1; i <= 100; i++) { 
    // If i is perfectly divisible by 2, it is an even number, so increase evenCount by 1.
    if (i % 2 == 0) { 
        evenCount++;
    }
    // If i is not perfectly divisible by 2, it is an odd number, so increase oddCount by 1.
    else if (i % 2 != 0) { 
        oddCount++;
    }
}

System.out.println("Even numbers: " + evenCount);
System.out.println("Odd numbers: " + oddCount);

    }
}
