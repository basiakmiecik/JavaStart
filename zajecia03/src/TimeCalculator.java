public class TimeCalculator {

    int dayshours( int days){
        return days*24;
    }

    int time(int days, int hours, int min, int sec){
       int  h=days*24;
       int m= (h+hours)*60;
       int s=(m+min)*60;

        return sec+s;
    }
    double sectomin(double sec){
        return sec/60;
    }

}
