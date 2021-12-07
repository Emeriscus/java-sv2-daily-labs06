package day04.hangman;

import java.util.Scanner;

public class HangmanMain {

    private String wordToFind = "számítógép";
    private String wordFound = "_".repeat(wordToFind.length());
    private int chances = 8;

    public static void main(String[] args) {
        System.out.println("Üdvözöllek az akasztófa játékban!");
        new HangmanMain().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Jelenleg itt tartasz: " + wordFound);
            System.out.println("Ennyi lehetőséged van még: " + chances);
            System.out.println("Mi a tipped");

            String guess = scanner.nextLine();
            if (!guess.equals("") && wordToFind.contains(guess)) {
                System.out.println("Jó a tipp.");
                wordFound = updateWordFound(wordToFind, wordFound, guess);
            } else {
                System.out.println("Nem jó a tipp.");
                chances--;
            }

        } while (!(wordToFind.equals(wordFound)) && (chances > 0));

        if (wordToFind.equals(wordFound)) {
            System.out.println();
            System.out.println("Nyertél!");
        } else {
            System.out.println();
            System.out.println("Vesztettél!");
        }
    }

    private String updateWordFound(String wordToFind, String status, String guess) {
        char[] chars = status.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (wordToFind.charAt(i) == guess.charAt(0)) {
                chars[i] = guess.charAt(0);
            }
        }
        return new String(chars);
    }
}