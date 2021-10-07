package pl.testuj.collections_examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// UWAGA Lista operuje tylko na obiektach, nie można używać typów prostych
/*
Wykorzystując Set<String> keys zrób pętle for i wyświetl wartości z mapy
 */
public class MapsExamples {
    public static void main(String[] args) {
        // podajemy dwa typy w formacie <klucz, wartość>
        Map<String, String> colorsDescription = new HashMap<>();

        // dodawanie elementu
        colorsDescription.put("apple", "red");
        colorsDescription.put("banana", "yellow");
        colorsDescription.put("kiwi", "green");

        System.out.println(colorsDescription);

        // pobieranie elementu (wartości) - podajemy klucze, które zdefiniowaliśmy
        System.out.println(colorsDescription.get("kiwi"));

        // pobranie wszystkich kluczy
        System.out.println(colorsDescription.keySet());
        Set<String> keys = colorsDescription.keySet();

        //HOMEWORK 11
        System.out.println("\nHOMEWORK 11");
        keys.forEach(element -> System.out.println(colorsDescription.get(element)));
        System.out.println("-----------\n");

        // podmiana wartości (obiektu) dla danego klucza
        colorsDescription.replace("apple", "mixed");
        System.out.println(colorsDescription);

        // sprawdzenie czy istnieje dany klucz
        System.out.println(colorsDescription.containsKey("banana"));

        // pobranie wartości w mapie - metoda values()
        System.out.println(colorsDescription.values());

        for (String fruit : colorsDescription.keySet()) {
            System.out.println("To jest owoc " + fruit + " a jego kolor to " + colorsDescription.get(fruit));
        }
    }
}
