package logic;
import data.Car;
public class CarShop {
    public static void main(String[] args) {
        Car audiA4 = new Car(2014, "Audi", "A5", "czarne");
         //Car audiA4=new Car(2015, "Audi", "A4");
        //kolor wybiera klient
        //audiA4.color="Czerwony";
         System.out.println(audiA4.getBrand()+" "+audiA4.getModel()+" "+audiA4.getYear()+" "+audiA4.getColor());
    }
}
