package learning.exercises.Fizzbuzz;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    /*zunächst löse ich das in einem closed ranged Stream weil nur bis 100
    je nach dem ob die Zahl durch 5, 7 oder beides dividerbar ist, wird die Zahl
    im Stream durch Fizz, Buzz oder Fizzbuzz ersetzt. Bei jeder Iteration wird dann
    das Ergebnis entweder als die Zahl oder das Wort ausgegeben.
     */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        boolean looping = true;
        while (looping) {
            System.out.println("how far?");
            x = scan.nextInt();
            if (x <= 1) {
                System.out.println("number is too small");

            } else {looping = false; }
        }

        IntStream.rangeClosed(1, x)
                .mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }

}
