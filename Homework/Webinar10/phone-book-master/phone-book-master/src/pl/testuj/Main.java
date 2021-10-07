package pl.testuj;


/*
- stworzyć klasy PrivateContact oraz WorkContact - dziedziczące
po PhoneContact

- wyświetlenie kontaktu
- wyślij jako wizytówka zaimplementować metodę send()

Wykorzystując polimorfizm stworzyć tablicę przechowującą kilka kontaktów różnego typu
i na każdym kontakcie wywołać metodę print()



 */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MobileContact mobileContact1 = new MobileContact(1,
                "Wojtek", "Nowak", "123456789");
        mobileContact1.print();

        WorkContact workContact1 = new WorkContact(1,
                "Anna", "Kowalska", "234567890");
        workContact1.print();

        PrivateContact privateContact1 = new PrivateContact(1,
                "Joanna", "Kowalewska", "345678901");
        privateContact1.print();
        privateContact1.send();

        PhoneContact[] kontakty = new PhoneContact[3];
        kontakty[0] = mobileContact1;
        kontakty[1] = workContact1;
        kontakty[2] = privateContact1;

        for (PhoneContact kontakt : kontakty) {
            kontakt.print();
        }

        System.out.println("\nHOMEWORK 11");

        ArrayList<PhoneContact> kontaktyList = new ArrayList<>();
        kontaktyList.add(mobileContact1);
        kontaktyList.add(workContact1);
        kontaktyList.add(privateContact1);
        kontaktyList.forEach(kontakt -> kontakt.send());

    }
}
