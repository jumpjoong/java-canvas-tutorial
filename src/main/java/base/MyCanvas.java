package base;

import tool.Rectangle;

import java.awt.*;

public class MyCanvas extends Canvas {

    private Rectangle rectangle;

    public MyCanvas() {
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        if (rectangle != null) {
            g.drawRect(
                    rectangle.getX(),
                    rectangle.getY(),
                    rectangle.getWidth(),
                    rectangle.getHigh()
            );
        }
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public void clearRac() {
        this.rectangle = null;
    }
}
