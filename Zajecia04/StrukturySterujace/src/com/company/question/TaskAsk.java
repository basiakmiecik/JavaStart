package com.company.question;

import java.util.Locale;
import java.util.Scanner;

public class TaskAsk {
    private int wynik;

    public int getWynik() {
        return wynik;
    }

    public void setWynik(int wynik) {
        this.wynik = wynik;
    }
    int pkt=0;
    Scanner scanner=new Scanner(System.in);
       // scanner.useLocale(Locale.US);

    public void question1(){
        System.out.println("Pytanie 1:\nJaki jest wynik działania 3*5");
        int wynik=scanner.nextInt();
        setWynik(wynik);
        if (wynik==15){
            pkt=1;
            System.out.println("Prawda, otrzymujesz 1 pkt. Twój wynik to "+ pkt+"/3.");
        }else{
            pkt=pkt+0;
            System.out.println("Fałsz, otrzymujesz 0 pkt. Twój wynik to "+ pkt+"/3.");
        }
    }

    public void question2(){
        System.out.println("\nPytanie 2:  \nJakie jest pole kwadratu o boku wynoszącym 12 cm");
        int wynik=scanner.nextInt();
        setWynik(wynik);
        if (wynik==144){
            pkt=++pkt;
            System.out.println("Prawda, otrzymujesz 1 pkt. Twój wynik to "+ pkt+"/3.");
        }else{
            pkt=pkt+0;
            System.out.println("Fałsz, otrzymujesz 0 pkt. Twój wynik to "+ pkt+"/3.");
        }
    }

    public void question3(){
        System.out.println("\nPytanie 3: \nJaki jest pierwiastek kwadratowy z liczby 15129");
        int wynik=scanner.nextInt();
        setWynik(wynik);
        if (wynik==123){
            pkt=++pkt;
            System.out.println("Prawda, otrzymujesz 1 pkt. Twój wynik to "+ pkt+"/3.");
        }else{
            pkt=pkt+0;
            System.out.println("Fałsz, otrzymujesz 0 pkt. Twój wynik to "+ pkt+"/3.");
        }

        System.out.println("\n Rozwiązano "+ pkt +" zadania prawidłowo. Zebrano "+pkt+"/3. Koniec quizu.");
    }
}
