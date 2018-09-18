class Car{
    int year;
    String brand;
    String model;
    String color;
    
    Car (int year, String brand, String model, String color){
        this(year,brand,model);
        color=color;
    }
    Car (int year, String brand, String model){
        this.year=year;
        this.brand=brand;
        this.model=model;
    }
}
