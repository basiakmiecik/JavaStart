import java.util.Locale;
import java.util.Scanner;

public class Calculator {

        public static void main(String[] args) {

            Scanner intput = new Scanner(System.in);

            System.out.println("Liczba 1: ");
            double number1 = intput.nextDouble();
            System.out.println("Działanie matematyczne: ");
            char dzialanie =  intput.next().charAt(0);
            System.out.println("Liczba 2: ");
            double number2 = intput.nextDouble();
            intput.close();

            Calcfun calc=new Calcfun(number1, number2, dzialanie);

        }

    }


