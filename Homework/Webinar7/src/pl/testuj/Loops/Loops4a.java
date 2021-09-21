package pl.testuj.Loops;

/*
Napisać program w którym użytkownik podaje na początku dwie liczby: początekZakresu oraz koniecZakresu.
Upewnij się że początekZakresu < koniecZakresu, a następnie:
a. pobierz od użytkownika kolejną liczbę - dzielnik. Po pobraniu dzielnika
wypisz wszystkie liczby od początekZakresu do koniecZakresu które są
podzielne przez dzielnik.
b. *pobierz od użytkownika iloscDzielnikow, a następnie wczytaj wszystkie
dzielniki. Po wczytaniu wszystkich dzielnikow wypisz wszystkie liczby od
poczatekZakresu do koniecZakresu które są podzielne przez wszystkie
dzielniki.
 */

import java.util.Scanner;

public class Loops4a {

    public static void main(String[] args) {
        int[] userRange = askForRange();
        boolean shouldContinue = verifyNumbers(userRange[0], userRange[1]);
        if (shouldContinue) {
            int divider = askForDivider();
            printNumbers(userRange[0], userRange[1], divider);
        }
    }

    public static int userDefinedNumber(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        int userDefinedNumber = scanner.nextInt();
        return userDefinedNumber;
    }

    public static int[] askForRange() {
        int[] range = new int[2];
        range[0] = userDefinedNumber("Wprowadź liczbę całkowitą - początek zakresu");
        range[1] = userDefinedNumber("Wprowadź liczbę całkowitą - koniec zakresu");
        return range;
    }

    public static boolean verifyNumbers(int min, int max) {
        if (min < max) {
            return true;
        } else {
            System.out.println("Początek zakresu jest większy niż koniec zakresu - nie można wykonać operacji");
            return false;
        }
    }

    public static int askForDivider() {
        int divider = userDefinedNumber("Wprowadź dzielnik");
        return divider;
    }

    public static void printNumbers(int min, int max, int divider) {
        System.out.println("Liczby z zakresu podzielne przez dzielnik");
        boolean numbersExist = false;
        for (int i=min; i<=max; i++) {
            if (i%divider==0) {
                System.out.println(i);
                numbersExist = true;
            }
        }
        if (!numbersExist) {
            System.out.println("brak");
        }
    }

}
