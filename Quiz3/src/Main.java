import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        ArrayQueue queue = new ArrayQueue(10);

        int gamesMade = 0;
        int playerId = 1;
        int turn = 1;

        while (gamesMade < 10) {
            System.out.println("\nTurn " + turn);

            int x = rand.nextInt(7) + 1;
            System.out.println(x + " players entered the queue.");

            for (int i = 0; i < x; i++) {
                queue.enqueue(new Player(playerId, "Player " + playerId, rand.nextInt(100) + 1));
                playerId++;
            }

            queue.printQueue();

            while (queue.size() >= 5 && gamesMade < 10) {
                System.out.println("\nGame found! Starting a match with:");
                for (int i = 0; i < 5; i++) {
                    System.out.println("- " + queue.dequeue());
                }
                gamesMade++;
                System.out.println("Total games made: " + gamesMade);
            }

            if (gamesMade == 10) {
                System.out.println("\n10 games have been successfully made. Program terminating.");
                break;
            }

            System.out.print("\nPress Enter to proceed to next turn...");
            scanner.nextLine();
            turn++;
        }

        scanner.close();
    }
}