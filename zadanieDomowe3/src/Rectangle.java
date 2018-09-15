public class Rectangle {
    double sideA;
    double sideB;

    Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    double RectangleArea (){
        return sideA*sideB;
    }
}