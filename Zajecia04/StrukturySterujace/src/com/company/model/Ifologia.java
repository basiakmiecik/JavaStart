package com.company.model;public class Ifologia {
    public static void main(String[] args) {
        int number=-7;
        switch (number%2){
            case 0:{
                System.out.println("Liczba " + number+" jest parzysta");
                break;
            }
            case 1:{
                System.out.println("Liczba " + number+ " jest nieparzysta");
                break;
            }

            case (-1):{
                System.out.println("Liczba " + number+"  jest ujemna i nieparzysta");
                break;
            }
        }
    }
}
