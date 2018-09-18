public class ComputerAssembly {
    public static void main(String[] args) {


        DataComputer dataComputer=new DataComputer();

        dataComputer.comp1.Showinfo();

        dataComputer.comp2.Showinfo();

        System.out.println("Nazwa: "+dataComputer.comp3.name);
        System.out.println("Procesor: "+ dataComputer.processor1.producent+ " "+dataComputer.processor1.model);
        System.out.println("Pamięć: "+ dataComputer.memory2.producent+ " "+ dataComputer.memory2.quantity);

        Computer createComputer(Processor processor, int )

    }
}
