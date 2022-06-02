package Shapes;



public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle(13.0, 4.0);
        Shape shape1 = new Circle(12.0);


        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());

        System.out.println(shape1.getArea());
        System.out.println(shape1.getPerimeter());


    }
}
