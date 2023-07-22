package oop1.abstraction;

public class Circle extends Figure {
    private double radio;

    public Circle() {}
    public Circle(double radio, double x, double y) {
        super(x, y);
        this.radio = radio;
    }

    @Override
    public double calculateArea() {
        double PI = 3.14;
        return PI * radio * radio;
    }
}
