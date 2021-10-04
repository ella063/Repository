package pl.testuj;

public class MobileContact extends PhoneContact {

    public MobileContact(int id, String name, String surname, String number) {
        super(id, name, surname, number);
    }

    @Override
    public void print() {
        System.out.println("\nKontakt " + ContactType.MOBI.getFullType());
        super.print();
    }
}
