package PointInRectangle_02;

public class Point {
    private int x;
    private int y;

     public Point(int x , int y){
         this.x = x;
         this.y = y;

     }

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

    public boolean greaterOrEqual(Point a) {
         return a.x <= x && a.y <= y ;
    }

    public boolean lessOrEqual(Point b) {
       return   x <= b.x && y <= b.y;
    }
}
