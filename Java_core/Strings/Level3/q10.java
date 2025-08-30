package Java_core.Strings.Level3;

import java.util.Arrays;
import java.util.Scanner;

public class q10 {
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int r = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }

    public static String[][] distribute(String[] deck, int players, int cards) {
        if (players * cards > deck.length) {
            System.out.println("Not enough cards to distribute!");
            return new String[0][0];
        }
        String[][] res = new String[players][cards];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cards; j++) {
                res[i][j] = deck[index++];
            }
        }
        return res;
    }

    public static void display(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            System.out.println(Arrays.toString(players[i]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cards = sc.nextInt();
        String[][] distributed = distribute(deck, players, cards);
        display(distributed);
    }
}
