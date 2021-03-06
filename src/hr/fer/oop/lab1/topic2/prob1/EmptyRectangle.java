package hr.fer.oop.lab1.topic2.prob1;

/**
 * This class creates empty rectangles
 * @author Luka
 * @version 1.00
 */
public class EmptyRectangle extends Rectangle {

    public EmptyRectangle(Point topLeftCorner, int width, int height) {
        super("EmptyRectangle", topLeftCorner, width, height);
    }

    @Override
    protected void generatePoints() {
        for (int x = topLeftCorner.getX(); x <= topLeftCorner.getX() + width; x++) {
            for (int y = topLeftCorner.getY(); y <= topLeftCorner.getY() + height; y++) {

                if (y == topLeftCorner.getY() || y == topLeftCorner.getY() + height || x == topLeftCorner.getX() || x == topLeftCorner.getX() + width)
                    addPoint(x, y);
            }
        }
    }
}
