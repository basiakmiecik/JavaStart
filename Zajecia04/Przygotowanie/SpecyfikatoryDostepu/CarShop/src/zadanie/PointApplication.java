package zadanie;
public class PointApplication {
    public static void main(String[] args) {
        Point point= new Point(4,7);
        PointController pointController= new PointController();

        System.out.println("X to "+point.getX()+ " Y to "+point.getY());

        pointController.addX(point);
        pointController.addY(point);

        System.out.println("X to "+point.getX()+ " Y to "+point.getY());


        pointController.minusX(point);
        pointController.minusY(point);

        System.out.println("X to "+point.getX()+ " Y to "+point.getY());


    }

}
