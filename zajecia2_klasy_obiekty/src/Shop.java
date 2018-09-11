public class Shop {
    public static void main(String[] args) {
        Product product1= new Product("Mleko", "Mlekovita", 2.50);
        /*product1.Name="Mleko";
        product1.Producent="Mlekovita";
        product1.price=2.50;*/
        Product product2 = new Product("Czekolada", "Wedel", 3.75);
       /* product2.Name="Czekolada";
        product2.Producent="Wedel";
        product2.price=3.75;*/
        System.out.println(product1.Name+" "+product1.Producent+" "+product1.price);
        System.out.println(product2.Name+" "+product2.Producent+" "+product2.price);
        Product product3=new Product("Mąka",null, 3.70);
        Product product4=product3;
        /*product3.Name="Mąka";
        product4.price=3.70;*/
        System.out.println(product3.Name+" "+product3.price);
        System.out.println(product4.Name+" "+product4.price);
        product3.Producent="Młyn Polski";
        System.out.println(product3.Producent+ " "+ product4.Producent);
        product4.Producent="Polskie Zboża";
        System.out.println(product3.Producent+ " "+ product4.Producent);
    }
}
