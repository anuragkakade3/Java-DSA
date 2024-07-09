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
}

public class Magicalarea {
    static Random random = new Random();

    public static int rollDie() {
        return random.nextInt(6) + 1; // 1 to 6 sided die
    }

    public static void fight(Player attacker, Player defender, char a, char b) {
        int attackRoll = rollDie();
        int defenseRoll = rollDie();

        int attackDamage = attacker.attack * attackRoll;
        int defenseStrength = defender.strength * defenseRoll;

        int damageTaken = Math.max(0, attackDamage - defenseStrength);
        defender.health -= damageTaken;

        System.out.println(
                "Attacker " + a + " rolls die: " + attackRoll + " , Defender " + b + " rolls die: " + defenseRoll);
        System.out.println("Attack damage: " + attackDamage + ", Defense strength: " + defenseStrength);
        System.out.println("Defender " + b + " health reduced by " + damageTaken + " to " + defender.health + "\n");
    }

    public static void main(String[] args) {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        while (playerA.health > 0 && playerB.health > 0) {
            if (playerA.health < playerB.health) {
                fight(playerA, playerB, 'A', 'B');
                if (playerB.health <= 0) {
                    System.out.println("Player A wins!");
                    break;
                }
                fight(playerB, playerA, 'B', 'A');
                if (playerA.health <= 0) {
                    System.out.println("Player B wins!");
                    break;
                }
            } else {
                fight(playerB, playerA, 'B', 'A');
                if (playerA.health <= 0) {
                    System.out.println("Player B wins!");
                    break;
                }
                fight(playerA, playerB, 'A', 'B');
                if (playerB.health <= 0) {
                    System.out.println("Player A wins!");
                    break;
                }
            }
        }
    }
}