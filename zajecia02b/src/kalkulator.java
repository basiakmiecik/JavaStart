public class kalkulator {
    public static void main(String[] args){
        double x=100;
        int y=101;
        double add=x+y;
        double sub=x-y;
        double diff=x/y;
        double multi=x*y;
        System.out.println(x+"+"+y+"="+add);
        System.out.println(x+"-"+y+"="+sub);
        System.out.print(x+"/"+y+"=");
        System.out.println(diff);
        System.out.println(x+"*"+y+"="+multi);
        System.out.print("Czy x jest większe od 0? ");
        System.out.println(x>0);
        System.out.println("Czy suma jest parzysta?"+ " "+((x+y)%2==0));
        System.out.println("x lub y większe od 100?"+ " "+ (x>100||y>100));
        System.out.println("x i y większe od 100?"+ " "+ (x>100&&y>100));
    }

}
