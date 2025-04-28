package base;

import tool.Rectangle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Map;

public class MyFrame extends JFrame implements MouseListener {

    private final MyCanvas myCanvas;

    private Rectangle rectangle;
    Point firstPointer = new Point(0, 0);
    Point secondPointer = new Point(0, 0);
    int width;
    int height;
    int minPointx;
    int minPointy;

    public MyFrame(MyCanvas myCanvas) {
        this.myCanvas = myCanvas;
        this.myCanvas.addMouseListener(this);
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

    private void makeRectangle(MouseEvent e) {
        //문제가 없는데 여기는? 이게 맞는데
//        System.out.println("클릭 시점의 포지션: " + this.rectangle.getX() +", "+ "뗄 떼 포지션: " +e.getX());
        width = Math.abs(secondPointer.x - firstPointer.x);
        height = Math.abs(secondPointer.y - firstPointer.y);
        minPointx = Math.min(firstPointer.x, secondPointer.x);
        minPointy = Math.min(firstPointer.y, secondPointer.y);

        this.rectangle.setX(minPointx);
        this.rectangle.setY(minPointy);
        this.rectangle.setWidth(width);
        this.rectangle.setHigh(height);
    }

}
