package model;

public class HourlyEmployee extends Employee {

    private final double hourlyRate;
    private final int workedHours;

    public HourlyEmployee(Long id, String name, double hourlyRate, int workedHours) {
        super(id, name);
        this.hourlyRate = hourlyRate;
        this.workedHours = workedHours;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * workedHours;
    }
}
