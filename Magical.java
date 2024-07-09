import java.util.Random;

class Player {
    int health;
    int strength;
    int attack;

    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int rollDie() {
        Random random = new Random();
        return random.nextInt(6) + 1; // Random number between 1 and 6
    }

    public int attack() {
        int attackRoll = rollDie();
        return attack * attackRoll;
    }

    public int defend() {
        int defendRoll = rollDie();
        return strength * defendRoll;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "health=" + health +
                ", strength=" + strength +
                ", attack=" + attack +
                '}';
    }
}

public class Magical {

    public static void main(String[] args) {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        fight(playerA, playerB);
    }

    public static void fight(Player playerA, Player playerB) {
        while (playerA.isAlive() && playerB.isAlive()) {
            Player attacker, defender;

            if (playerA.health <= playerB.health) {
                attacker = playerA;
                defender = playerB;
            } else {
                attacker = playerB;
                defender = playerA;
            }

            int attackDamage = attacker.attack();
            int defendValue = defender.defend();

            int damageDealt = attackDamage - defendValue;
            if (damageDealt > 0) {
                defender.takeDamage(damageDealt);
            }

            System.out.println(attacker + " attacks " + defender);
            System.out.println("Damage dealt: " + damageDealt);
            System.out.println("Defender health: " + defender.health);
            System.out.println();

            // Swap roles
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        if (playerA.isAlive()) {
            System.out.println("Player A wins!");
        } else {
            System.out.println("Player B wins!");
        }
    }
}