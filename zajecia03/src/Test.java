public class Test {
    public static void main(String[] args) {
        Calculator calc= new Calculator();
        int suma =calc.add(6,5);
        System.out.println(suma);

        int suma2 = calc.add(2, 3);
        System.out.println(suma2);

        calc.addAndShow(5.5, 8);
        System.out.println("Koniec programu");

        calc.addShow(6,5);
    }

}