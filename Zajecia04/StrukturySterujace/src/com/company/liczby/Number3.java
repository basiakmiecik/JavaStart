package com.company.liczby;
public class Number3 {
    private int number1;
    private int number2;
    private int numnber3;

    public Number3(int number1, int number2, int numnber3) {
        this.number1 = number1;
        this.number2 = number2;
        this.numnber3 = numnber3;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumnber3() {
        return numnber3;
    }

    public void setNumnber3(int numnber3) {
        this.numnber3 = numnber3;
    }

    public void greatest(){
        if (number1>number2&&number1>numnber3){
            System.out.println("Liczba "+getNumber1()+" jest najwieksza");
        }
        else if (number2>number1&&number2>numnber3){
            System.out.println("Liczba "+getNumber2()+" jest najwieksza");
        }
        else {
            System.out.println("Liczba "+getNumnber3()+" jest najwieksza");
        }
    }

    public void least(){
        if (number1<number2&&number1<numnber3){
            System.out.println("Liczba "+getNumber1()+" jest najmniejsza");
        }
        else if (number2<number1&&number2<numnber3){
            System.out.println("Liczba "+getNumber2()+" jest najmniejsza");
        }
        else {
            System.out.println("Liczba "+getNumnber3()+" jest najmniejsza");
        }
    }

    public void average(){
        System.out.println("Srednia z podanych liczb to: "+((getNumber2()+getNumber1()+getNumnber3())/3));
    }
}
