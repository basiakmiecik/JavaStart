package com.company.check;
import java.util.Locale;
import java.util.Scanner;
public class Wczytywanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Podaj wiek");
        int age=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj imie");
        String imie=scanner.nextLine();
        System.out.println("Witaj "+imie+" masz "+ age+" lat");

        System.out.println("Podaj liczbe zmienno przecinkowa");
        double number=scanner.nextDouble();
        System.out.println("Twoja liczba to "+ number);

    }
}
