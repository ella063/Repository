package pl.testuj.Loops;

public class Loops1For {

    public static void main(String[] args) {
        numbersInSeparateLines(1, 100);
        numbersInOneLine(1000, 1020);
        numbersDividedBy5(-30, 1000);
        numbersDividedBy3(1, 100);
        numbersDividedBy3And5(30, 300);
        oddNumbersInOneLine(-300, 300);
        evenNumbersInOneLine(-100, 100);
        printSmallLetters();
        printLargeLetters();
        printEverySecondLargeLetter();
        printEverySecondSmallLetter();
        printText("Hello World", 100);
    }

    //a. liczby z zakresu 1 - 100 w nowych liniach
    public static void numbersInSeparateLines(int userMin, int userMax) {
        for (int i=userMin; i <= userMax; i++) {
            System.out.println(i);
        }
    }

    //b. liczby z zakresu 1000 - 1020 w tej samej linii oddzielone przecinkami i spacją
    public static void numbersInOneLine(int userMin, int userMax) {
        String outputString = "";
        for (int i=userMin; i <= userMax; i++) {
            outputString = outputString + i;
            if (i == userMax) {
                break;
            }
            outputString = outputString + ", ";
        }
        System.out.println(outputString);
    }

    //c. liczby podzielne przez 5 z zakresu -30 - 1000 w nowych liniach
    public static void numbersDividedBy5(int userMin, int userMax) {
        for (int i=userMin; i <= userMax; i++) {
            if (i%5 == 0) {
                System.out.println(i);
            }
        }
    }


    //d. liczby podzielne przez 3 z zakresu 1 - 100 w nowych liniach
    public static void numbersDividedBy3(int userMin, int userMax) {
        for (int i=userMin; i <= userMax; i++) {
            if (i%3 == 0) {
                System.out.println(i);
            }
        }
    }

    //e. liczby podzielne przez 3, 5 z zakresu 30 - 300 w nowych liniach
    public static void numbersDividedBy3And5(int userMin, int userMax) {
        for (int i=userMin; i <= userMax; i++) {
            if (i%3 == 0 && i%5 == 0) {
                System.out.println(i);
            }
        }
    }

    //f. liczby nieparzyste z zakresu -300 - 300 w tej samej linii oddzielone średnikami
    public static void oddNumbersInOneLine(int userMin, int userMax) {
        String outputString = "";
        for (int i=userMin; i <= userMax; i++) {
            if (i%2 != 0) {
                outputString = outputString + i;
                outputString = outputString + ";";
            }
        }
        outputString = outputString.substring(0, outputString.length()-1);
        System.out.println(outputString);
    }

    //g. liczby parzyste z zakresu -100 - 100 w tej samej linii oddzielone średnikami
    public static void evenNumbersInOneLine(int userMin, int userMax) {
        String outputString = "";
        for (int i=userMin; i <= userMax; i++) {
            if (i%2 == 0) {
                outputString = outputString + i;
                outputString = outputString + ";";
            }
        }
        outputString = outputString.substring(0, outputString.length()-1);
        System.out.println(outputString);
    }

    //h. litery od 'a' do 'z'
    public static void printSmallLetters() {
        char a = 97;
        char z = 122;
        for (char i = a; i <= z; i++) {
            System.out.println(i);
        }
    }

    //i. litery od ‘A’ do ‘Z’
    public static void printLargeLetters() {
        char A = 65;
        char Z = 90;
        for (char i = A; i <= Z; i++) {
            System.out.println(i);
        }
    }

    //j. litery od ‘A’ do ‘Z’, tylko co drugą
    public static void printEverySecondLargeLetter() {
        char A = 65;
        char Z = 90;
        for (char i = A; i <= Z; i++) {
            int intLetter = i;
            if (intLetter%2 != 0) {
                System.out.println(i);
            }
        }
    }

    //k. litery od ‘a’ do ‘z’ tylko co drugą zaczynając od ‘b’ i tylko jeśli jej kod ascii jest podzielny przez 5
    public static void printEverySecondSmallLetter() {
        char a = 97;
        char z = 122;
        for (char i = a; i <= z; i++) {
            int intLetter = i;
            if (intLetter%5 == 0 && intLetter%2 == 0) {
                System.out.println(i);
            }
        }
    }

    //l. ‘Hello World’ 100 razy przy każdym wypisaniu wypisz jego indeks (numer wypisania)
    public static void printText(String text, int iterations) {
        for (int i=1; i <= iterations; i++) {
            System.out.println(i + ". " + text);
        }
    }
}
