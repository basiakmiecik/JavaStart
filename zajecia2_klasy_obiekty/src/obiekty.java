public class obiekty {
    public static void main(String[] args) {
        String firstName="Jan";
        String lastName="Kowalski";
        int age =25;
        String city="Wrocław";
        Person person1 = new Person("Jan", "Kowalski", 25);
        //person1.firstName="Jan";
        //person1.lastName="Kowalski";
        //person1.age=25;

        Adress adress1=new Adress();
        adress1.city="Wrocław";
        adress1.street="Grabiszyńska";
        adress1.postalCode="50-539";

        person1.adress=adress1;
        //person1.city="Wrocław";
        System.out.println(person1.firstName);
        System.out.println(person1.age);
        System.out.println(person1.adress.city);
    }
}
