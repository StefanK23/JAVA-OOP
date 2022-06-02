package Shapes;

public class Circle extends Shape{

    private Double radius ;

    public Circle(Double radius) {
        this.radius = radius;
        calculateArea();
        calculatePerimeter();
    }

    @Override
    protected void calculateArea() {
        double result = Math.PI* Math.pow(2, radius);
        setArea(result);
    }

    @Override
    protected void calculatePerimeter() {
          double result = 2 * Math.PI * this.getRadius();
          setPerimeter(result);
    }

    public final Double getRadius() {
        return radius;
    }
}
