package pl.testuj.Loops;

/*
    // zadanie domowe - zaimplementować poniższą metodę
    // n - ile razy wykonać pętlę (ile razy wydrukować liczbę 'limit')
    // limit - liczba, którą chcemy wydrukować n razy
    // np printEachNthNumberBelow(3, 5)
    // 5
    // 5
    // 5
    public static void printEachNthNumberBelow(int n, int limit) {
 */

import java.util.Scanner;

public class ForLoopExample {

    public static void main(String[] args) {
        int limit = userDefinedNumber("What number should be printed?");
        int n = userDefinedNumber("How many times?");
        printEachNthNumberBelow(n, limit);
    }

    public static int userDefinedNumber(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        int userDefinedNumber = scanner.nextInt();
        return userDefinedNumber;
    }

    public static void printEachNthNumberBelow(int n, int limit) {
        for (int i=1; i<=n; i++) {
            System.out.println(limit);
        }
    }
}
