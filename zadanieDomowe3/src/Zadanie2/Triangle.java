public class Triangle {
    double sideA;
    double sideB;
    double sideC;

    Triangle(double sideA, double sideB, double sideC){
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }

    double TrianglePerimeter(){
        return sideA+sideB+sideC;
    }

}
