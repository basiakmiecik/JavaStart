import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {
        Scanner intput=  new Scanner(System.in);

        String firstName;
        String lastName;
        int age;

        System.out.println("Wprowadz swoje imie:");
        firstName=intput.nextLine();
        System.out.println("Wprowdz swoje nazwisko: ");
        lastName = intput.nextLine();
        System.out.println("Podaj swoj wiek: ");
        age=intput.nextInt();

        intput.close();

        System.out.println("Cześć " + firstName + " " + lastName);
        System.out.println("Masz już " + age + ", starość nie radość! :)");

    }
}
