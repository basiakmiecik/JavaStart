package com.company.liczbydzialania;

public class Number {
    private int number;

   public Number(int number){
        this.number=number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void parzysta(){
        if (number%2==0){
            System.out.println("parzysta");
        }
        else
            System.out.println("nieparzysta");
    }

    public void dodatnia(){
       if (number>0){
           System.out.println("dodatnia");
       }
       else if (number<0){
            System.out.println("ujemna");
        }
        else{
            System.out.println("Równa 0");
        }
    }
    double x=(number*9);
    public void warunek(){
    if((number*9)%6==0) {
        System.out.println((number*9)+" jest podzielna przez 6");
    }
    else if (number*number<100){
        System.out.println((number*number)+" jest mniejsza od 100");
        }
        else {
        System.out.println("nie spełnia żadnego warunku");
    }
    }
}
