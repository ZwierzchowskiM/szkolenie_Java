package exc7Point.app;

import exc7Point.data.Point;
import exc7Point.logic.PointController;

public class PointTest {
    public static void main(String[] args) {

        Point point = new Point(100,100);
        PointController pointController = new PointController();
        point.printInfo();
        pointController.addX(point);
        point.printInfo();
        pointController.addY(point);
        point.printInfo();
        pointController.minusX(point);
        point.printInfo();
        pointController.minusY(point);
        point.printInfo();

    }
}
