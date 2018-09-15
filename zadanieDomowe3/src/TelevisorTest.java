public class TelevisorTest {
    public static void main(String[] args) {
        Televisor televisor= new Televisor(false,true);


        televisor.showStatus();
        televisor.turnOn();
        televisor.showStatus();
        televisor.turnOff();
        televisor.showStatus();

    }
}
