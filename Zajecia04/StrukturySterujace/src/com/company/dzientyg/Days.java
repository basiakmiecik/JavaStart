package com.company.dzientyg;
public class Days {
   private int daynumber;

    public Days(int daynumber){
        this.daynumber=daynumber;
    }

    public int getDaynumber() {
        return daynumber;
    }

    public void setDaynumber(int daynumber) {
        this.daynumber = daynumber;
    }

    public void whatDay() {

        switch (daynumber) {
            case 1:{
                System.out.println("poniedzialek");
            break;
            }
            case 2:{
                System.out.println("wtorek");
                break;
            }
            case 3:{
                System.out.println("środa");
                break;
            }
            case 4:{
                System.out.println("czwartek");
                break;
            }
            case 5:{
                System.out.println("piatek");
            break;
            }
            case 6:{
                System.out.println("sobota");
                break;
            }
            case 7:{
                System.out.println("niedziela");
                break;
            }
            default:{
                System.out.println("Podano nieprawidlowy numer");
            }

        }
        if(daynumber<6){
            System.out.println("Dzień pracujący");}
            else if (5<daynumber&&8>daynumber){
            System.out.println("Weekend");

        }
    }
}


