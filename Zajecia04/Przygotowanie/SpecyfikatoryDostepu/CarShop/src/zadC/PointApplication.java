package zadC;

import zadA.Point;
import zadB.PointController;

public class PointApplication {
    public static final int ADD_X =1;
    public static final int ADD_Y =2;
    public static final int MINUS_X =3;
    public static final int MINUS_Y =4;

        public static void main(String[] args) {
            Point point= new Point(4,7);
            PointController pointController= new PointController();

           /* System.out.println("X to "+point.getX()+ " Y to "+point.getY());

            pointController.addX(point);
            pointController.addY(point);

            System.out.println("X to "+point.getX()+ " Y to "+point.getY());


            pointController.minusX(point);
            pointController.minusY(point);

            System.out.println("X to "+point.getX()+ " Y to "+point.getY());*/

            int wybor=ADD_X;

            switch (wybor){
                case ADD_X:
                    pointController.addX(point);
                    System.out.println("X to "+point.getX()+ " Y to "+point.getY());
                    break;
                case ADD_Y:
                    pointController.addY(point);
                    System.out.println("X to "+point.getX()+ " Y to "+point.getY());
                    break;
                case MINUS_X:
                    pointController.minusX(point);
                    System.out.println("X to "+point.getX()+ " Y to "+point.getY());
                    break;
                case MINUS_Y:
                    pointController.minusY(point);
                    System.out.println("X to "+point.getX()+ " Y to "+point.getY());
                    break;

                    default:
                        System.out.println("X to "+point.getX()+ " Y to "+point.getY());

            }

        }

}
