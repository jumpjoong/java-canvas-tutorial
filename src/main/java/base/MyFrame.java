package base;

import tool.Rectangle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Map;

public class MyFrame extends JFrame implements MouseListener, MouseMotionListener {

    private final MyCanvas myCanvas;

    private Rectangle rectangle;
    Point firstPointer = new Point(0, 0);
    Point secondPointer = new Point(0, 0);

    public MyFrame(MyCanvas myCanvas) {
        this.myCanvas = myCanvas;
        this.myCanvas.addMouseListener(this);
        this.myCanvas.addMouseMotionListener(this);
        this.add(myCanvas);
    }

    public void clear() {
        //자바 실행 크기 및 위치 조절
        this.setBounds(100, 100, 500, 500);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
//        System.out.printf("mouseClicked x: %s, y: %s%n", e.getX(), e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
//        System.out.printf("mousePressed x: %s, y: %s%n", e.getX(), e.getY());
        firstPointer.setLocation(0, 0);
        secondPointer.setLocation(0, 0);
        this.myCanvas.clearRac(); //클릭을 하면 사각형이 사라짐
        this.rectangle = new Rectangle(); //객체 생성

        firstPointer.setLocation(e.getX(), e.getY());
    }

    @Override
    //마우스 뗄 떼 메서드
    public void mouseReleased(MouseEvent e) {
//        System.out.printf("mouseReleased x: %s, y: %s%n", e.getX(), e.getY());
        secondPointer.setLocation(e.getX(), e.getY());
        makeRectangle(e);
        this.myCanvas.setRectangle(this.rectangle);
        this.myCanvas.repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        System.out.printf("mouseEntered x: %s, y: %s%n", e.getX(), e.getY());
    }

    @Override
    public void mouseExited(MouseEvent e) {
//        System.out.printf("mouseExited x: %s, y: %s%n", e.getX(), e.getY());
    }
    @Override
    public void mouseDragged(MouseEvent e) {
//        la.setText("MouseDragged("+e.getX()+", "+e.getY()+")");
//        la.setLocation(e.getX(), e.getY());
        System.out.println(e.getX()+", "+e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
//        System.out.println(e.getX()+", "+e.getY());
    }
    private void makeRectangle(MouseEvent e) {
        int width = Math.abs(secondPointer.x - firstPointer.x);
        int height = Math.abs(secondPointer.y - firstPointer.y);
        int minPointx = Math.min(firstPointer.x, secondPointer.x);
        int minPointy = Math.min(firstPointer.y, secondPointer.y);

        System.out.println(width+", " + height);
        this.rectangle.setX(minPointx);
        this.rectangle.setY(minPointy);
        this.rectangle.setWidth(width);
        this.rectangle.setHigh(height);
    }
}
