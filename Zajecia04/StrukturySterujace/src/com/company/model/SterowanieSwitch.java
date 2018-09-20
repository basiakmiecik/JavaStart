package com.company.model;
public class SterowanieSwitch
{
    public static void main(String[] args) {
        int wiek =10;
        switch (wiek){
            case 10:{
                System.out.println("Witaj młodzieńcze");
            //break;
            }
            case 20:{
                System.out.println("Witaj mezczyzno");
               // break;
            }
            default:{
                System.out.println("Witaj");
            }
        }
    }
}
