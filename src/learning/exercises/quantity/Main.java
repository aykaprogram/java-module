package learning.exercises.quantity;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How long will your Break be in Minutes?");
        double time = scanner.nextDouble();
        int calculatedTime = (int)(time/2.5);
        System.out.println("You can watch " + calculatedTime + " papi Videos.");
    }
}
