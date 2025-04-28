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
            int width = rectangle.getWidth();
            int height = rectangle.getHigh();

            if(width < 0) {

            }
            g.drawRect(
                    rectangle.getX(),
                    rectangle.getY(),
                    rectangle.getWidth(),
                    rectangle.getHigh()
            );
            System.out.println("X: " +rectangle.getX() + ", " + "Y: "+ rectangle.getY()+", "+ "높이: "+rectangle.getHigh()+","+"넓이: "+rectangle.getWidth());
        }
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public void clearRac() {
        this.rectangle = null;
    }
}
