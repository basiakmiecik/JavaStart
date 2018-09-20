package com.company.check;
import com.company.liczby.Number3;

import java.util.Locale;
import java.util.Scanner;

public class NumberTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Podaj liczbe A: ");
        int numberA=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj liczbe B: ");
        int numberB= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj liczbę C: ");
        int numberC=scanner.nextInt();
        scanner.nextLine();
        Number3 number3=new Number3(numberA, numberB, numberC);
        //System.out.println("Najwieksza liczba z podanych to: ");
        number3.greatest();
        //System.out.println("Najmniejsza liczba z podanych to: ");
        number3.least();
       // System.out.println("Srednia podanych liczb to: ");
        number3.average();

    }

}
