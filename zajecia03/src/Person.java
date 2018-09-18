public class Person {
    String firstName;
    String lastName;
    int age;
    String city;

    public Person(String firstName, String lastName, int age, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void increaseAge(){
        age++;
    }

    void changeAge(int change){
        age=age+change;
    }

    void showInfo(){
        System.out.println(firstName+ " "+ lastName+" "+ age+" "+ city);
    }
}
