package com.company.model;
public class YearCheck {
    private int year;

    public YearCheck(int year){
        this.year=year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void rokPrzystepny(){
        if(year%4==0&&year%100!=0){
            System.out.println("Rok nie jest przystępny");
        }
        else {
            System.out.println("Rok jest przystepny");
        }
    }
}
