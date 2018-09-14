class ComputerStore{
    public static void main(String[] args){
       /* Computer comp1=new Computer();
        comp1.processor="Intel i5";
        comp1.memory=8192;
        
        Computer comp2=new Computer();
        comp2.processor="AMD Ryzen 1700";
        comp2.memory=16384;*/
        ComputerFactory factory=new ComputerFactory();
        Computer comp1=factory.create("Intel i5", 8192);
        Computer comp2=factory.create("AMD Ryzen 1700", 16384);
        
       //przed utworzeniem metody w Computer.java
        //System.out.println(comp1.processor+" "+comp1.memory);
        //System.out.println(comp2.processor+" "+comp2.memory);
        //powtarzamy caly czas ten sam zapis wobec czego mozemy to zapisac jako metode
        comp1.printinfo();
        comp2.printinfo();
        
        //klient chce dodać 4GB ramu
        ComputerUpgrade upgrade =new ComputerUpgrade();
        upgrade.addMemory(comp1,4096);
        comp1.printinfo();
    }
}
