package model;

public class ContractEmployee extends Employee {

    private final double contractAmount;

    public ContractEmployee(Long id, String name, double contractAmount) {
        super(id, name);
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculateSalary() {
        return contractAmount;
    }
}
