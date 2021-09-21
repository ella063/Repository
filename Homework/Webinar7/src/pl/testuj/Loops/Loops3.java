package pl.testuj.Loops;

/*
Napisz program, który wypisuje “Hello World” dopóki użytkownik podaje liczby większe od 0.
 */

import java.util.Scanner;

public class Loops3 {

    public static void main(String[] args) {
        printHelloWorld();
    }

    public static int userDefinedNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę całkowitą");
        int userDefinedNumber = scanner.nextInt();
        return userDefinedNumber;
    }

    public static void printHelloWorld() {
        boolean print = true;
        while (print) {
            int number = userDefinedNumber();
            if (number == 0) {
                print = false;
                break;
            }
            System.out.println("Hello World");
        }

    }

}
