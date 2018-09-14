public class PersonTest {
    public static void main(String[] args) {
        Person person1 =new Person("Jan", "Kowalski", 30, "Wrocław");
        System.out.println(person1.firstName);
        System.out.println(person1.age);

        //person1.age=person1.age+1;
        person1.increaseAge();

        System.out.println(person1.age);

        person1.changeAge(3);
        System.out.println(person1.age);
        person1.showInfo();

        TimeMachine time= new TimeMachine();
        time.backInTime(person1);

        time.timeTravel(person1,-6);

    }
}
