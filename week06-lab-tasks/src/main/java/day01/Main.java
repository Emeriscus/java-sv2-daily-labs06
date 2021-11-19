package day01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PositiveNumberContainer positiveNumberContainer = new PositiveNumberContainer();

        Scanner scanner = new Scanner(System.in);
        double number;

        do {
            System.out.println("Kérek egy valós számot:");
            number = scanner.nextDouble();
            if (number>=0){
                positiveNumberContainer.addNumbers(number);
            }

        } while (number>0);

        System.out.println(positiveNumberContainer.getNumbers());
    }
}
