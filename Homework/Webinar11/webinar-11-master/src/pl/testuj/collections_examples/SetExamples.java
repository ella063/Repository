package pl.testuj.collections_examples;

import java.util.HashSet;
import java.util.Set;

// UWAGA set (zbiór) operuje tylko na obiektach, nie można używać typów prostych
// Set - nie przechowuje duplikatów, kolejność nieuporządkowana
public class SetExamples {
    public static void main(String[] args) {
        Set<Integer> numsSet = new HashSet<Integer>();

        numsSet.add(3);
        numsSet.add(8);
        numsSet.add(1);
        System.out.println(numsSet);

        numsSet.add(1);
        System.out.println(numsSet);

        System.out.println(numsSet.size());
        System.out.println(numsSet.contains(9));
        numsSet.clear();
        System.out.println(numsSet);
    }
}
