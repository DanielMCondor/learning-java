package oop1.herencia;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setId(1);
        int id = employee.getId();
        System.out.println("Employee id: " + id);

        System.out.println("========================================");

        Consultant consultant = new Consultant();
        consultant.setId(2);
        consultant.setName("Daniel");
        String textFormat = String.format("Consultant with id: %s and name: %s", consultant.getId(), consultant.getName());
        System.out.println(textFormat);
    }
}
