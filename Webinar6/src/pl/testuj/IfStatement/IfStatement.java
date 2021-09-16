package pl.testuj.IfStatement;

public class IfStatement {
    public static void main(String[] args) {
        boolean isAdult = false;
        if (isAdult) {
            //kod do wykonania jeśli warunek jest spełniony
            System.out.println("Kod wewnątrz if");
            System.out.println("Jesteś pełnoletni");
        } else {
            //kod do wykonania jeśli warunek nie jest spełniony
            System.out.println("Kod wewnątrz else");
            System.out.println("Jesteś niepełnoletni");
        }
        System.out.println("Kod poza if/else");

        System.out.println(isEvenNumber(5));
        System.out.println(isEvenNumber(10));

        System.out.println(isEvenNumberWithoutStatement(6));
        System.out.println(isEvenNumberWithoutStatement(11));

        isDividedBy2And3(2);

    }

    public static boolean isEvenNumber(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void isDividedBy2And3(int num) {
        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("Liczba jest podzielna przez dwa i trzy");
        } else if (num % 2 == 0){
            System.out.println("Liczba jest podzielna tylko przez dwa");
        } else if (num % 3 == 0){
            System.out.println("Liczba jest podzielna tylko przez trzy");
        } else {
            System.out.println("Liczba nie jest podzielna ani przez dwa ani przez trzy");
        }
    }

    public static boolean isEvenNumberWithoutStatement(int num) {
        return num % 2 == 0;
    }

}
