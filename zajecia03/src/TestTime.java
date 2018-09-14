public class TestTime {
    public static void main(String[] args) {
        TimeCalculator timecalc=new TimeCalculator();
        int godziny= timecalc.dayshours(2);
        System.out.println("liczba godzin: "+ godziny);

        int sekundy= timecalc.time(0,0,2,5);

        System.out.println("liczba sekund: "+ sekundy);

         double minuty = timecalc.sectomin(5);


        System.out.print("Liczba minut: ");
        System.out.format("%.2f%n", minuty);//zaokraglanie liczb
    }
}
