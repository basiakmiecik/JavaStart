import java.util.Locale;
import java.util.Scanner;


public class TwoNumbers {

    public static void main(String[] args) {
        Scanner intput = new Scanner(System.in);

        System.out.println("Podaj A: ");
        double a = intput.nextDouble();
        System.out.println("Podaj B: ");
        double b = intput.nextDouble();

        intput.close();
        System.out.println("A + B = " + (a+b));
    }

}