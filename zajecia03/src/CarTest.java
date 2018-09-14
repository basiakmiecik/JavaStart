public class CarTest {
    public static void main(String[] args) {
        Car car=new Car("Maluch", 150.5, 60);

        car.show();

        car.turbo();
        car.increaseSpeed(30.56);
        car.show();
    }
}
