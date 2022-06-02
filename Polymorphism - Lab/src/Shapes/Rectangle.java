package Shapes;



public class Rectangle extends Shape {

    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
        calculateArea();
        calculatePerimeter();
    }

    @Override
    protected void calculateArea() {
        Double result = height * 2 + width * 2;
        setArea(result);
    }

    @Override
    protected void calculatePerimeter() {
        Double result = this.getHeight() * this.getWidth();
        setPerimeter(result);
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }
}
