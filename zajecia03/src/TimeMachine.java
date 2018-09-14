public class TimeMachine {

   void backInTime (Person person){
       person.age=person.age-1;
       System.out.println("Nowy wiek: "+ person.age);
   }

   void timeTravel (Person person, int change){
       person.age=person.age+change;
       System.out.println("Nowy wiek: "+ person.age);
   }
}
