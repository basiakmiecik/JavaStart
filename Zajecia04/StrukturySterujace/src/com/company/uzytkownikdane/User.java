package com.company.uzytkownikdane;public class User {
    private String pesel;
    private int age;
    private String firstName;
    private String lastName;


    public User(String pesel, int age, String firstName, String lastName) {
        this.pesel = pesel;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void showInfo(){
        System.out.println(" Imie: "+getFirstName()+"\n Nazwisko: "+getLastName()+"\n Wiek: "+getAge()+"\n Pesel: "+getPesel());
    }
}
