public class Computer {
    String name;
    Memory mem;
    Processor proc;

    Computer(String name, Memory mem, Processor proc){
        this.name=name;
        this.mem=mem;
        this.proc=proc;

    }
    void Showinfo(){
        System.out.println("Nazwa: "+name);
        System.out.println(" pamięć: "+ mem.producent+ " "+mem.model+" "+mem.clocking+" MHz  "+mem.quantity+" GB");
        System.out.println(" procesor: "+ proc.producent+" "+proc.model+" "+proc.clocking+" GHz");
    }

}
