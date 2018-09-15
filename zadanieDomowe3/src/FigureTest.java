public class FigureTest {
    public static void main(String[] args) {
        Square square1= new Square(12);
        Rectangle rectangle1=new Rectangle(12, 10);
        Triangle triangle1= new Triangle(3, 4, 5);
        Circle circle1= new Circle(10);

        ShapeCalculator calc= new ShapeCalculator();

        System.out.println("Pole okręgu wynosi: "+calc.circleArea(circle1));
        System.out.println("Pole kwadratu wynosi: "+calc.squareArea(square1));
        System.out.println("Obwód trójkąta wynosi: "+ calc.trianglePerimeter(triangle1));
        System.out.println("Obwód prostokąta wynosi: "+calc.rectPerimeter(rectangle1));
    }
}
