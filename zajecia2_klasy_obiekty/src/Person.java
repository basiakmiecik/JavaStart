class Person {

    String firstName;
    String lastName;
    int age;
    Adress adress;

    //istnieje cos takiego jak kontrsuktor domyslny
/* konstruktor kodu
    public Person() {
        System.out.println("Tworzę obiekt Person:");
    }*/

Person(String fn, String ln, int a){
    firstName=fn;
    lastName=ln;
    age=a;
    //stworzony tu został konstruktor
}

}
