package pl.testuj;

public abstract class PhoneContact implements PrintableContact {
    private static int numberOfContacts = 0;
    private int id;
    private String name;
    private String surname;
    private String number;

    public PhoneContact(int id, String name, String surname, String number) {
        numberOfContacts++;
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.number = number;
    }

    public static int getNumberOfContacts() {
        return numberOfContacts;
    }

    public static void setNumberOfContacts(int numberOfContacts) {
        PhoneContact.numberOfContacts = numberOfContacts;
    }

    public static void printNumberOfContacts()  {
        System.out.println(numberOfContacts);
    }

    @Override
    public void print() {
        System.out.format("%d | %s | %s | %s\n", id, name, surname, number);
    }

    @Override
    public void send() { System.out.format("Kontakt %s %s został wysłany\n", name, surname); }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
