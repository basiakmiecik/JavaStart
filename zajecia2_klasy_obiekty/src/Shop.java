public class Shop {
    public static void main(String[] args) {
        Product product1= new Product();
        product1.Name="Mleko";
        product1.Producent="Mlekovita";
        product1.price=2.50;
        Product product2 = new Product();
        product2.Name="Czekolada";
        product2.Producent="Wedel";
        product2.price=3.75;
        System.out.println(product1.Name+" "+product1.Producent+" "+product1.price);
        System.out.println(product2.Name+" "+product2.Producent+" "+product2.price);
    }
}
