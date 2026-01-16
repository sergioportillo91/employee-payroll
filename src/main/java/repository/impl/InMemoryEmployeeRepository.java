package repository.impl;

import model.Employee;
import repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryEmployeeRepository implements EmployeeRepository {

    private final List<Employee> storage = new ArrayList<>();

    @Override
    public void save(Employee employee) {
        storage.add(employee);
    }

    @Override
    public List<Employee> findAll() {
        return new ArrayList<>(storage);
    }
}
