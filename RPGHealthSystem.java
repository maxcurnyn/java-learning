public class RPGHealthSystem {
    public static void main(String[] args) {

double health = 100.00;
double damage = 20.00;
boolean hasShield = true;
boolean isPoisoned = true;

if (hasShield) {
    damage = damage / 2;
}

else if (hasShield == false);
    damage = 20.00;

if (isPoisoned) {
    health = health - 2.50;
    System.out.println("You are poisoned.");
}

else if (isPoisoned == false) {
    health = health - 0.00;
    System.out.println("You are not poisoned.");
}
    

if (isPoisoned && hasShield) {
    health = health - 2.50;
}

if (health <= 0) {
    System.out.println("You died. GAME OVER.");
}

else if (health <=25) {
    System.out.println("Danger! Low health.");
}

else if (health >= 90) {
    System.out.println("Health is steady.");
}

System.out.println(health);

    }
}
