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

public class Loops4b {

    public static void main(String[] args) {
        int[] userRange = askForRange();
        boolean shouldContinue = verifyRange(userRange[0], userRange[1]);
        if (shouldContinue) {
            int[] dividers = askForDividers();
            printNumbers(userRange[0], userRange[1], dividers);
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

    public static boolean verifyRange(int min, int max) {
        if (min < max) {
            return true;
        } else {
            System.out.println("Początek zakresu jest większy niż koniec zakresu - nie można wykonać operacji");
            return false;
        }
    }

    public static int[] askForDividers() {
        int numberOfDividers = userDefinedNumber("Wprowadź liczbę dzielników");
        int[] dividers = new int[numberOfDividers];
        for (int i=1; i <= numberOfDividers; i++) {
            int divider = userDefinedNumber("Wprowadź dzielnik");
            dividers[i-1] = divider;
        }
        return dividers;
    }

    public static void printNumbers(int min, int max, int[] dividers) {
        System.out.println("Liczby z zakresu podzielne przez dzielnik");
        boolean numbersExist = false;
        for (int i=min; i<=max; i++) {
            int shouldPrint = 0;
            for (int d : dividers) {
                if (i%d!=0) {
                    shouldPrint++;
                }
            }
            if (shouldPrint == 0) {
                System.out.println(i);
                numbersExist = true;
            }
        }
        if (!numbersExist) {
            System.out.println("brak");
        }
    }

}
