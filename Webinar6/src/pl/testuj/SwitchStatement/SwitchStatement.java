package pl.testuj.SwitchStatement;

public class SwitchStatement {
    public static void main(String[] args) {

        String day = "x";

        if ("Monday".equals(day)) {
            System.out.println("Poniedziałek");
        } else if ("Tuesday".equals(day)) {
            System.out.println("Wtorek");
        } else if ("Wednesday".equals(day)) {
            System.out.println("Sroda");
        } else if ("Thursday".equals(day)) {
            System.out.println("Czwartek");
        } else if ("Friday".equals(day)) {
            System.out.println("Piatek");
        } else if ("Saturday".equals(day)) {
            System.out.println("Sobota");
        } else if ("Sunday".equals(day)) {
            System.out.println("Niedziela");
        } else {
            System.out.println("Błąd");
        }

        switch(day) {
            case "Monday":
                System.out.println("Poniedziałek");
                break;
            case "Tuesday":
                System.out.println("Wtorek");
                break;
            case "Wednesday":
                System.out.println("Sroda");
                break;
            case "Thursday":
                System.out.println("Czwartek");
                break;
            case "Friday":
                System.out.println("Piatek");
                break;
            case "Saturday":
                System.out.println("Sobota");
                break;
            case "Sunday":
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("Nieznany");
        }
    }
}
