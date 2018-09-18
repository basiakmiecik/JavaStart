class Calculator{
    int number1;
    int number2;
    int number3;
    int result;
    
    
    Calculator(int a, int b, int c){
        this(a,b);
        number1=a;
        number2=b;
        number3=c;
        //result=a+b+c;
       // System.out.println(a+"+"+b+"+"+c+"="+result);
    }
    Calculator(int a, int b){
        number1=a;
        number2=b;
   //     result=a+b;
    //    System.out.println(a+"+"+b+"="+result);
    }
    void add(int a, int b){
        result=a+b;
        System.out.println(a+"+"+b+"="+result);
    }
    void add(int a, int b, int c){
        result=a+b+c;
        System.out.println(a+"+"+b+"+"+c+"="+result);
    }
    void sub(int a, int b, int c){
        result=a-b-c;
        System.out.println(a+"-"+b+"-"+c+"="+result);
    }
}
