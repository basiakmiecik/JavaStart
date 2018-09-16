public class ComputerTest {
    public static void main(String[] args) {
        Processor processor1=new Processor("Intel", "i9-7940X", 3.1);
        Processor processor2= new Processor("AMD", " Ryzen 5 2600", 3.4);
        Memory memory1= new Memory("HyperX", "FURY DDR4", 2666, 8);
        Memory memory2= new Memory("GOOD RAM", "IRDM X DDR4", 2666, 8);
        Computer comp1=new Computer("Tesla", memory1, processor1);
        Computer comp2= new Computer("IBM", memory2, processor2);

        System.out.println("Nazwa: "+comp1.name);
        System.out.println(" pamięć: "+ comp1.mem.producent+ " "+comp1.mem.model+" "+comp1.mem.clocking+" MHz  "+comp1.mem.quantity+" GB");
        System.out.println(" procesor: "+ comp1.proc.producent+" "+comp1.proc.model+" "+comp1.proc.clocking+" GHz");

        System.out.println("Nazwa: "+comp2.name);
        System.out.println(" pamięć: "+ comp2.mem.producent+ " "+comp2.mem.model+" "+comp2.mem.clocking+" MHz  "+comp2.mem.quantity+" GB");
        System.out.println(" procesor: "+ comp2.proc.producent+" "+comp2.proc.model+" "+comp2.proc.clocking+" GHz");

    }
}
