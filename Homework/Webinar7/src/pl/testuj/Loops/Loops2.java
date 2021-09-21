package pl.testuj.Loops;

/*
Napisz aplikację która przyjmuje parametr (ilość powtórzeń) ze scannera, a
następnie zadaną ilość razy wypisuje na ekran “Hello World” - pętlą for i while
 */

import java.util.Scanner;

public class Loops2 {

    public static void main(String[] args) {
        int iterations = askUserForIterations();
        printTextWithFor(iterations);
        printTextWithWhile(iterations);
    }

    public static int askUserForIterations(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile razy wydrukować tekst?");
        int iterations = scanner.nextInt();
        return iterations;
    }

    public static void printTextWithFor(int iterations) {
        System.out.println("FOR LOOP");
        for (int i=1; i <= iterations; i++) {
            System.out.println(i + ". " + "Hello World");
        }
    }

    public static void printTextWithWhile(int iterations) {
        System.out.println("WHILE LOOP");
        int i=1;
        while (i <= iterations) {
            System.out.println(i + ". " + "Hello World");
            i++;
        }
    }

}
