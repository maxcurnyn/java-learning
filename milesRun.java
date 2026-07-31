public class Day3 {
    public static void main(String[] args) { 

int milesRun = 7;

// Classify run length

if (milesRun < 5) { 
    System.out.println("Short run");
}

else if (milesRun >=5 && milesRun <= 9) {
    System.out.println("Medium Run");
}

else { 
    System.out.println("Long run");
}

// Print every completed mile

for (int i = 1; i <= milesRun; i++) { 
    System.out.println("Mile " + i);
}


    }
}
