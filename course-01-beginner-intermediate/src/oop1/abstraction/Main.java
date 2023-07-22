package oop1.abstraction;

public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle(4, 1,2);
        System.out.println("This Area of the circle is:  "+ circle.calculateArea());

        Figure square = new Square(8, 1, 2);
        System.out.println("this Area is of the square is: "+ square.calculateArea());

    }
}
