import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        CardStack playerDeck = new CardStack(30);
        CardStack playerHand = new CardStack(10);
        CardStack discardPile = new CardStack(30);

        int deckCount = 30;
        int discardCount = 0;

        for (int i = 1; i <= 30; i++) {
            playerDeck.push(new Card("Card " + i));
        }

        int round = 1;

        while (!playerDeck.isEmpty()) {
            System.out.println("\nRound " + round);

            int command = rand.nextInt(3);
            int x = rand.nextInt(5) + 1;

            if (command == 0) {
                System.out.println("Command: Draw " + x + " cards");
                for (int i = 0; i < x; i++) {
                    if (playerDeck.isEmpty()) {
                        break;
                    }
                    playerHand.push(playerDeck.pop());
                    deckCount--;
                }
            } else if (command == 1) {
                System.out.println("Command: Discard " + x + " cards");
                for (int i = 0; i < x; i++) {
                    if (playerHand.isEmpty()) {
                        break;
                    }
                    discardPile.push(playerHand.pop());
                    discardCount++;
                }
            } else {
                System.out.println("Command: Get " + x + " cards from discarded pile");
                for (int i = 0; i < x; i++) {
                    if (discardPile.isEmpty()) {
                        break;
                    }
                    playerHand.push(discardPile.pop());
                    discardCount--;
                }
            }

            System.out.println("\nPlayer Hand:");
            playerHand.printStack();

            System.out.println("Remaining cards in player deck: " + deckCount);
            System.out.println("Number of cards in discarded pile: " + discardCount);

            if (playerDeck.isEmpty()) {
                System.out.println("\nPlayer deck is empty. Game over.");
                break;
            }

            System.out.println("\nPress Enter to proceed to next turn...");
            scanner.nextLine();

            round++;
        }

        scanner.close();
    }
}