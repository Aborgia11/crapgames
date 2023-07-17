import java.util.Scanner;
import java.util.Random;

public class crapsgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        while (playAgain) {
            int dice1 = rollDice(random);
            int dice2 = rollDice(random);
            int sum = dice1 + dice2;
            System.out.println("Rolling the dice...");
            System.out.println("Die 1: " + dice1);
            System.out.println("Die 2: " + dice2);
            System.out.println("Sum: " + sum);
            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Craps! You lose!");
            }
            else if
            (sum == 7 || sum == 11) {
                System.out.println("Natural! You win!");
            }
            else
            {
                System.out.println("Point is set to " + sum);
                boolean continueRolling = true;
                while (continueRolling) {
                    int nextRoll = rollDice(random);
                    System.out.println("Next roll: " + nextRoll);
                    if (nextRoll == sum) {
                        System.out.println("Made the point! You win!");
                        continueRolling = false;
                    } else if (nextRoll == 7) {

                        System.out.println("Got a seven! You lose!");
                        continueRolling = false;
                    } else {

                        System.out.println("Trying for point...");
                    }
                }
            }
            System.out.print("Play again? (Y/N): ");
            String choice = scanner.nextLine();
            playAgain = choice.equalsIgnoreCase("Y");
        }
    } private static int rollDice(Random random) {
        return random.nextInt(6) + 1;
    }
}

