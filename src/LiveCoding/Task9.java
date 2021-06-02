package LiveCoding;

public class Task9 {
    public static void main(String[] args) {

        double x = 2;
        double y = 2;
        Circle circle = new Circle(new Point2D(0, 0), new Point2D(x, y));
        System.out.println(circle);
        circle.getRadius();

//        circle.getArea(2);
//        circle.getPerimeter(2);
//
//        circle.move(new MoveDirection(4,4));
//        circle.getRadius();
//        circle.getArea(2);
//        circle.getPerimeter(2);

    }
}

class Point2D {
    double x;
    double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

class Circle implements Movable {

    public Circle(Point2D center, Point2D point) {
    }


    public void getRadius() {


    }

    public double getPerimeter(double radius) {
        double perimeter = radius * 2 * Math.PI;
        System.out.println("Perimeter is: " + perimeter);
        return perimeter;
    }

    public double getArea(double radius) {
        double area = Math.sqrt(radius * Math.PI);
        System.out.println("Circle area is: " + area);
        return area;
    }

    @Override
    public void move(MoveDirection moveDirection) {

    }
}
