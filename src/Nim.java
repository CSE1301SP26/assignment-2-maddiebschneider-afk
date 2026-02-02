import java.util.Scanner;
import java.util.Random;

public class Nim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("What is the starting amount of sticks?");
        int sticks = input.nextInt(); 

        while (sticks > 0) {
            System.out.println("\nSticks remaining: " + sticks );

            // human turn
            int humanTake;
            do { 
                System.out.println("Do you take 1 or 2 sticks?");
                humanTake = input.nextInt();
            } while (humanTake < 1 || humanTake > 2 || humanTake > sticks);

            sticks -= humanTake;
            System.out.println("You took " + humanTake + " stick(s).");

            if (sticks == 0) { 
                System.out.println("You win!");
                break;
            }
            // computer turn
            int computerTake;
            if (sticks == 1) {
                computerTake = 1;
            } else {
                computerTake = rand.nextInt(2) + 1; // 1 or 2

            }
            
            sticks -= computerTake;
            System.out.println("Computer took " + computerTake + " stick(s).");

            if (sticks == 0) {
                System.out.println("Computer wins!");
                break;
            }
        }
    }
}


