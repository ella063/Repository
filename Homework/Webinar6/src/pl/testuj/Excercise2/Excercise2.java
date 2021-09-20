package pl.testuj.Excercise2;

/*
Napisz metodę odwracającą string (zwracającą string napisany wspak). Czyli np dla TESTUJ ma zwrócić JUTSET
 */

public class Excercise2 {

    public static void main(String[] args) {
        System.out.println(revertString("TESTUJ"));
    }

    static char[] revertString(String myString) {
        char[] myStringArray = myString.toCharArray();
        char[] revertedStringArray = new char[myString.length()];
        int newElement = myString.length() - 1;
        int oldElement = 0;
        for (char i : myStringArray) {
            revertedStringArray[newElement--] = myStringArray[oldElement++];
        }
        return revertedStringArray;
    }

}
