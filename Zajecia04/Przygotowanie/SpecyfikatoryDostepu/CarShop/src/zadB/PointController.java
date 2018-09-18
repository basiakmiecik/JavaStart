package zadB;

import zadA.Point;

public class PointController {

    int x;
    int y;
    public void addX(Point point1){ //- zwiększa zmienną x o 1
        x=point1.getX();
        x=x+1;
        point1.setX(x);
    }

    public void minusX(Point point1) { // - zmniejsza zmienną x o 1
        x = point1.getX();
        x = x - 1;
        point1.setX(x);
    }

    public void addY(Point point1) { //zwiększa zmienną y o 1
        y=point1.getY();
        y=y+1;
        point1.setY(y);
    }

    public void minusY(Point point1) { // zmniejsza zmienną y o 1
        y=point1.getY();
        y=y-1;
        point1.setY(y);
    }
}
