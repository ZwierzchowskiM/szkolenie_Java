package exc7Point.logic;

import exc7Point.data.Point;

public class PointController {

    public void addX(Point point) {
        point.setPosX(point.getPosX()+1);
    }

    public void minusX(Point point) {
        point.setPosX(point.getPosX()-1);
    }

    public void addY(Point point) {
        point.setPosY(point.getPosY()+1);
    }

    public void minusY(Point point) {
        point.setPosY(point.getPosY()-1);
    }


}
