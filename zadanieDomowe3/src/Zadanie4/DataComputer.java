package Zadanie4;
public class DataComputer {

        Processor processor1=new Processor("Intel", "i9-7940X", 3.1);
        Processor processor2= new Processor("AMD", " Ryzen 5 2600", 3.4);
        Memory memory1= new Memory("HyperX", "FURY DDR4", 2666, 8);
        Memory memory2= new Memory("GOOD RAM", "IRDM X DDR4", 2666, 8);
        Computer comp1=new Computer("Tesla", memory1, processor1);
        Computer comp2= new Computer("IBM", memory2, processor2);
        Computer comp3= new Computer("user");

    }
