package com.company.check;
import com.company.model.User;

import java.util.Locale;
import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String name=scanner.nextLine();

        System.out.println("Podaj nazwisko: ");
        String nazwisko=scanner.nextLine();

        System.out.println("Podaj wiek: ");
        int wiek=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj pesel: ");
        String pesel=scanner.nextLine();

        User user=new User(pesel, wiek, name, nazwisko);
        user.showInfo();
}
}
