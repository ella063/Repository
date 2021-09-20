package pl.testuj.Excercise1;

/*
Poprawić zadanie z gwiazdką z webinaru nr 4: zadanie dodatkowe: wyświetl wszystkie indeksy wystąpienia litery 'ę'. Wykorzystująć for / if / toCharArray
 */

public class Excercise1 {

    public static void main(String[] args) {
        String word = "Uczę się Java i chcę automatyzować testy";
        char letterToFind = 'ę';
        findLetters(word, letterToFind);
    }

    static void findLetters(String word, char letterToFind){
        char[] lettersInWord = word.toCharArray();
        int i = 0;
        for (char letter : lettersInWord) {
            if (letter == letterToFind) {
                System.out.println("Index of letter is " + i);
            }
            i++;
        }
    }

}