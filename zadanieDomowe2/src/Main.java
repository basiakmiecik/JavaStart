public class Main {
    public static void main(String[] args) {
        /*Pies pies1=new Pies();
        pies1.BirthYear=2016;
        pies1.Name="Kiara";
        pies1.rasa="Owczarek Niemiecki";

        System.out.println(pies1.BirthYear+ " "+pies1.rasa+" "+pies1.Name);

        Pies pies2=new Pies();
        pies2.BirthYear=2000;
        pies2.Name="Saba";
        pies2.rasa="Kundel";

        System.out.println(pies2.BirthYear+" "+pies2.rasa+" "+pies2.Name);*/

        Pies pies1=new Pies("Owczarek Niemiecki",2016, "Kiara");
        Pies pies2=new Pies ("Kundel", 2000, "Saba");

        System.out.println(pies1.BirthYear+ " "+pies1.rasa+" "+pies1.Name);

        System.out.println(pies2.BirthYear+" "+pies2.rasa+" "+pies2.Name);

    }
}
