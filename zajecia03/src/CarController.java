public class CarController {
    void turbo(Car cars){
        cars.power=(cars.power*1.1);
    }
    void increaseSpeed(Car cars, double increase){
        cars.velocity=cars.velocity+increase;
    }
    void show(Car cars){
        System.out.println("nazwa auta: "+ cars.Name+" "+"moc: "+cars.power+" "+"prędkość: "+cars.velocity);
    }

}
