public class Calcfun {
    double number1;
    double number2;
    char dzialanie;

    final char add = '+';
    final char min = '-';
    final char multi = '*';
    final char diff = '/';

    Calcfun(double number1, double number2, char dzialanie) {
        this.number1 = number1;
        this.number2 = number2;
        this.dzialanie = dzialanie;


        switch (dzialanie) {
            case (add):
                System.out.println(number1+number2);
                break;
            case (min):
                System.out.println(number1-number2);
                break;
            case (multi):
                System.out.println(number1*number2);
                break;
            case (diff):
                System.out.println(number1/number2);
                break;
                default:
                    System.out.println("Error");

        }
    }
}
