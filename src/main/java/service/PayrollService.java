package service;

import model.Employee;
import repository.EmployeeRepository;

public class PayrollService {

    private final EmployeeRepository repository;

    public PayrollService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public void calculatePayroll() {
        for (Employee employee : repository.findAll()) {
            double salary = employee.calculateSalary(); // POLIMORFISMO
            System.out.println(
                    employee.getName() + " gana $" + salary
            );
        }
    }
}
