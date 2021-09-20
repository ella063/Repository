package pl.testuj.Excercise4;

/*
Napisać program, który utworzy tablicę 20 liczb całkowitych z przedziału 1 . . . 10 a następnie wypisze na ekranie ile razy każda z liczb z tego przedziału powtarza się w tablicy.
Przykład:
liczby: 6 5 4 5 10 5 8 3 10 6 6 6 4 3 2 8 1 3 4 7
Wystąpienia:
1 - 1
2 - 1
3 - 3
4 - 3
5 - 3
6 - 4
7 - 1
8 - 2
9 - 0
10 - 2
 */

public class Excercise4 {

    public static void main(String[] args) {
        int[] myNumbers = {6, 5, 4, 5, 10, 5, 8, 3, 10, 6, 6, 6, 4, 3, 2, 8, 1, 3, 4, 7};
        countElements(myNumbers);
    }

    static void countElements(int[] myNumbers) {
        int numberOf1 = 0;
        int numberOf2 = 0;
        int numberOf3 = 0;
        int numberOf4 = 0;
        int numberOf5 = 0;
        int numberOf6 = 0;
        int numberOf7 = 0;
        int numberOf8 = 0;
        int numberOf9 = 0;
        int numberOf10 = 0;
        for (int i : myNumbers) {
            if (i == 1) {
                numberOf1++;
            } else if (i == 2) {
                numberOf2++;
            } else if (i == 3) {
                numberOf3++;
            } else if (i == 4) {
                numberOf4++;
            } else if (i == 5) {
                numberOf5++;
            } else if (i == 6) {
                numberOf6++;
            } else if (i == 7) {
                numberOf7++;
            } else if (i == 8) {
                numberOf8++;
            } else if (i == 9) {
                numberOf9++;
            } else if (i == 10) {
                numberOf10++;
            } else {
                System.out.println("Unknown number - " + i);
            }
        }
        System.out.println("1 - " + numberOf1);
        System.out.println("2 - " + numberOf2);
        System.out.println("3 - " + numberOf3);
        System.out.println("4 - " + numberOf4);
        System.out.println("5 - " + numberOf5);
        System.out.println("6 - " + numberOf6);
        System.out.println("7 - " + numberOf7);
        System.out.println("8 - " + numberOf8);
        System.out.println("9 - " + numberOf9);
        System.out.println("10 - " + numberOf10);
    }

}
