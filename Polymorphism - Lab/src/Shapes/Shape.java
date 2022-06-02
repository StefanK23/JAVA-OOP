package Shapes;

public abstract class Shape {
    private Double perimeter;
    private Double area;


     protected abstract void calculateArea();
     protected abstract void calculatePerimeter();

    protected void setArea(Double area) {
        this.area = area;
    }

    protected void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    public Double getPerimeter() {
        return perimeter;
    }

    public Double getArea() {
        return area;
    }
}
