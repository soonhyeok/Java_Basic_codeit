public class Square extends Shape {
    public final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPeremiter() {
        return 4 * side;
    }
}
