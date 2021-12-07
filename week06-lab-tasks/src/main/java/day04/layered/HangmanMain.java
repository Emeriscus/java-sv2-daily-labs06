package day04.layered;

import java.util.Scanner;

public class HangmanMain {

    public static void main(String[] args) {

        System.out.println("Üdvözöllek az akasztófa játékban!");
        System.out.println();
        new HangmanMain().run();
    }

    private void run() {
        BusinessModel businessModel = new BusinessModel("almafa", 8);
        Scanner scanner = new Scanner(System.in);
        do {
            printStatus(businessModel);
            String guess = inputGuess(scanner);
            boolean success = businessModel.takeGuess(guess);
            if (success) {
                System.out.println("Jó a tipp.");
            } else {
                System.out.println("Nem jó a tipp.");
            }
        } while (!businessModel.won() && businessModel.hasMoreChance());

        printResult(businessModel);
    }

    private void printResult(BusinessModel businessModel) {
        if (businessModel.won()) {
            System.out.println();
            System.out.println("Nyertél!");
        } else {
            System.out.println();
            System.out.println("Vesztettél!");
        }
    }

    private void printStatus(BusinessModel businessModel) {
        System.out.println("Jelenleg itt tartasz: " + businessModel.getWordFound());
        System.out.println("Ennyi lehetőséged van még: " + businessModel.getChances());
    }

    private String inputGuess(Scanner scanner) {
        System.out.println("Mi a tipped?");
        return scanner.nextLine();
    }
}