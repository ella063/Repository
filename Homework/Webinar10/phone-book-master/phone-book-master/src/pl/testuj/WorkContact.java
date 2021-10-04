package pl.testuj;

public class WorkContact extends PhoneContact {

    public WorkContact(int id, String name, String surname, String number) {
        super(id, name, surname, number);
    }

    @Override
    public void print() {
        System.out.println("\nKontakt " + ContactType.WORK.getFullType());
        super.print();
    }
}
