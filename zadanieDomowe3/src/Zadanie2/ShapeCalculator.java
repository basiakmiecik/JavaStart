public class ShapeCalculator {
    double squareArea(Square square){
        double Area;
        Area=square.side*square.side;

    return Area;
    }

    double circleArea(Circle circle){
        double Area;

        Area=circle.radius*circle.radius*3.14;

    return Area;

    }

    double trianglePerimeter(Triangle triangle){
        double Perimeter;
        Perimeter=triangle.sideA+triangle.sideB+triangle.sideC;

    return Perimeter;
    }

    double rectPerimeter(Rectangle rectangle){
        double Perimeter=rectangle.sideA+rectangle.sideB+rectangle.sideA+rectangle.sideB;

    return Perimeter;
    }
}
