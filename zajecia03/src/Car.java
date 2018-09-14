public class Car {
    String Name;
    double power;
    double velocity;

    Car(String n, double p, double v){
        Name=n;
        power=p;
        velocity=v;
    }

    void turbo(){
        power=(power*1.1);
    }
    void increaseSpeed(double increase){
        velocity=velocity+increase;
    }
    void show(){
        System.out.println(Name+" "+power+" "+velocity);
    }
}
