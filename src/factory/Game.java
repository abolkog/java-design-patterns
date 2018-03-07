package factory;

import java.util.Random;
import java.util.Scanner;

/**
 * Dummy Example of Factory Pattern :)
 * Replace the Mario Class with Factory pattern
 * @author Khalid Elshafie <abolkog@gmail.com>
 * @created 08/03/2018.
 */
public class Game {
    static Random random = new Random();

    public static void main(String[] args) {

        Mario luigi = new Mario("luigi");
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Game On.%nYou are playing using[%s]. Jump Attach is [%d] and Mushroom is [%d]%n", luigi.getName(), luigi.getJumpAttack(), luigi.getMushroomAttack());

        int counter = 0;

        while (luigi.getHealth() > 0) {
            int id = EnemyFactory.BIRD;
            int random = getRandom(0, 20);
            if (random >= 0 && random < 5) id = EnemyFactory.BIRD;
            if (random >= 5 && random < 15) id = EnemyFactory.TURTLE;
            if (random >= 15 && random < 20) id = EnemyFactory.DINOSAUR;


            Enemy enemy = EnemyFactory.createEnemy(id);


            enemy.showUp();
            System.out.println("\n");


            play(luigi, enemy, scanner);

            counter++;
            if (counter >= 4) break;

        }
        scanner.close();
        System.out.println("You Won!!!! Tat Tart Tart Ta");

    }

    public static void play(Mario hero, Enemy enemy, Scanner scanner) {

        while (enemy.getHealth() > 0 || hero.getHealth() > 0) {
            System.out.print("What do you want to do? [1=Jump Attack/2=Mushroom Attack]");
            int answer = scanner.nextInt();
            int heroAttack = 0;
            if (answer == 1) heroAttack = hero.getJumpAttack();
            if (answer == 2) heroAttack = hero.getMushroomAttack();

            enemy.takeDamage(heroAttack);


            if (enemy.getHealth() <= 0) {
                System.out.printf("%s died%n", enemy.getName());
                break;
            }

            System.out.printf("%s is attaching ...%n", enemy.getName());
            hero.setHealth(hero.getHealth() - enemy.attack());


            System.out.printf("%s's Health is [%d]%n%n", hero.getName(), hero.getHealth());



            if (hero.getHealth() <= 0) {
                System.out.printf("%s is Dead. Health [%d]%n", hero.getName(), hero.getHealth());
                System.out.println("Game Over");
                System.exit(0);
            }

        }


    }

    public static int getRandom(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }
}
