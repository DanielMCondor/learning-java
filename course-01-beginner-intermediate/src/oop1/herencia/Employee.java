package oop1.herencia;

public class Employee extends Person {
    private int code;
    private String charge;
    private Double salary;

    public Employee() {}

    public Employee(int code, String charge, Double salary, int id, String dni, String name, String lastName, String address, String phone) {
        super(id, dni, name, lastName, address, phone);
        this.code = code;
        this.charge = charge;
        this.salary = salary;
    }

    public int getCode() {
        return  code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
