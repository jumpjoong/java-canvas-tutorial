package tool;

public class Rectangle {

    private int x;
    private int y;
    private int width;
    private int high;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
//        if(width < 0) {
//            return width * -1;
//        } else {
//            return width;
//        }
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHigh() {
//        if(high < 0) {
//            return high * -1;
//        } else {
//            return high;
//        }
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }
}
