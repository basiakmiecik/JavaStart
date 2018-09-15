public class Televisor {
    boolean wlaczony;
    boolean wylaczony;

    Televisor(boolean wlaczony, boolean wylaczony){
        this.wlaczony=wlaczony;
        this.wylaczony=wylaczony;
    }

void turnOn(){

     wlaczony=true;
     wylaczony=false;
     System.out.println("Telewizor jest teraz włączony");
}

void turnOff(){
wlaczony=false;
wylaczony=true;
System.out.println("Telewizor jest teraz wyłączony");

}

void showStatus(){
    System.out.println("Włączony: " +wlaczony+" \nWyłączony: "+ wylaczony);
}
}