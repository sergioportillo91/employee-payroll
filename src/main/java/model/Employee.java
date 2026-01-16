package model;

public abstract class Employee {

    protected Long id;
    protected String name;

    protected Employee(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Método abstracto → POLIMORFISMO
    public abstract double calculateSalary();

    public String getName() {
        return name;
    }
}
