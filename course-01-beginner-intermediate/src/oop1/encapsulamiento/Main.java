package oop1.encapsulamiento;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.setName("woodpecker");
        bird.setSpecies("worker");
        bird.setColor("Yellow");

        String output = String.format("this bird is a %s and belongs to the %s species and is %s in color ", bird.getName(), bird.getSpecies(), bird.getColor());
        System.out.println(output);
    }
}
