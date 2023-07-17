package oop1;

public class Student {
    private int id;
    private String name;
    private String lastName;

    public Student() {}

    public Student(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String printStudent() {
        return String.format("student identified with the number %d, his name and last name is %s %s ", id, name, lastName);
    }
}
