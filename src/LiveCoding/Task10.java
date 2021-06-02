package LiveCoding;

public class Task10 {
    public static void main(String[] args) {

    }

}

class MoveDirection {
    double x;
    double y;

    public MoveDirection(double x, double y) {
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

interface Movable {
    void move(MoveDirection moveDirection);
}