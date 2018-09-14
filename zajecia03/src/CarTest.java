public class CarTest {
    public static void main(String[] args) {
        Car car=new Car("Maluch", 150.5, 60);
        CarController carCon= new CarController();

        System.out.print("Przed ulepszeniami: ");
        carCon.show(car);

        carCon.turbo(car);
        carCon.increaseSpeed(car,30.56);

        System.out.print("Po ulepszeniach: ");
        carCon.show(car);
    }
}
