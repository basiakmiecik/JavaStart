public class Product {
    String Name;
    String producer;
    double price;
    String category;

    public Product(String name, String producer, String category) {
        Name = name;
        this.producer = producer;
        this.category = category;
    }
    public Product(String name, String producer, double price, String category) {
        this(name, producer,category);
        this.price = price;
    }


}
