package oop1;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(2);
        student.setName("Juan");
        student.setLastName("Perez");

        System.out.println(student.printStudent());
    }
}
