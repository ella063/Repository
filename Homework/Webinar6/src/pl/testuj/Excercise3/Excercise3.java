package pl.testuj.Excercise3;

/*
Napisz aplikację w której zadeklaruj tablicę 10 elementów a następnie: a. wypełnij je wartościami z przedziału -10 - 10
b. wypisz na ekranie zawartość tablicy
c. wyznacz najmniejszy oraz największy element tablicy (wypisz je)
d. wypisz średnią arytmetyczną tablicy (*spróbuj zrobić to samo z tablicą liczb zmiennoprzecinkowych)
e. wypisz ilość elementów większych/mniejszych od średniej
f. wypisz tablicę w odwrotnej kolejności
Przykład:
liczby:
-3 9 2 -10 -3 -4 -1 -5 -10 8
Min: -10, max: 9
Średnia: -1,00
Mniejszych od śr.: 6
Większych od śr.: 3
Liczby w odwrotnej kolejności:
8 -10 -5 -1 -4 -3 -10 2 9 -3
 */

public class Excercise3 {

    public static void main(String[] args) {
        int[] myNumbers = {-3, 9, 2, -10, -3, -4, -1, -5, -10, 8};
        printElements(myNumbers);
        calculeMinAndMax(myNumbers);
        System.out.println("Average number is " + calculateAverage(myNumbers) + "\n");
        countGreaterAndSmallerThanAverage(myNumbers);
        printElementsReversed(myNumbers);
        }

    static void printElements(int[] numbers) {
        System.out.println("Your array contains the following elements:");
        for (int i : numbers) {
            System.out.println(i);
        }
        System.out.println("\n");
    }

    static void calculeMinAndMax(int[] numbers) {
        int minElement = numbers[0];
        for (int i : numbers) {
            if (i < minElement) {
                minElement = i;
            }
        }
        System.out.println("Min element is " + minElement);
        int maxElement = numbers[0];
        for (int i : numbers) {
            if (i > maxElement) {
                maxElement = i;
            }
        }
        System.out.println("Min element is " + maxElement);
        System.out.println("\n");
    }

    static float calculateAverage (int[] numbers) {
        float sumOfElements = 0.00f;
        int numberOfElements = numbers.length;
        for (int i : numbers) {
            sumOfElements = sumOfElements + i;
            }
        return sumOfElements / numberOfElements;
    }

    static void countGreaterAndSmallerThanAverage(int[] numbers) {
        int greaterElements = 0;
        int smallerElements = 0;
        float average = calculateAverage(numbers);
        for (int i : numbers) {
            if (i > average) {
                greaterElements++;
            } else if (i < average) {
                smallerElements++;
            }
        }
        System.out.println("Number of greater elements is " + greaterElements);
        System.out.println("Number of smaller elements is " + smallerElements);
        System.out.println("\n");
    }

    static void printElementsReversed(int[] numbers) {
        System.out.println("Your reversed array contains the following elements:");
        int elementIndex = numbers.length - 1;
        for (int i : numbers) {
            System.out.println(numbers[elementIndex--]);
        }
        System.out.println("\n");
    }


}
