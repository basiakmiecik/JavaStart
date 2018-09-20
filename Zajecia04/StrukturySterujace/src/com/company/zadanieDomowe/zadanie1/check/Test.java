package com.company.zadanieDomowe.zadanie1.check;
import com.company.zadanieDomowe.zadanie1.trojkat.Triangle;

public class Test {


    public boolean isRightTriangle(Triangle triangle){
            boolean wynik=false;
            int a= triangle.getBok1();
            int b= triangle.getBok2();
            int c= triangle.getBok3();
           if(((a*a)==(b*b)+(c*c)) || ((b*b)==(a*a)+(c*c)) || ((c*c)==(a*b)+(b*b)))
           { wynik=true; }
          // else{ wynik=false; }

    return wynik;}
}
