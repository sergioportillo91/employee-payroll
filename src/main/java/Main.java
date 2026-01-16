import model.*;
import repository.*;
import repository.impl.*;
import service.PayrollService;

public class Main {

    public static void main(String[] args) {

        EmployeeRepository repository = new InMemoryEmployeeRepository();

        repository.save(new FullTimeEmployee(1L, "Ana", 3_000_000));
        repository.save(new HourlyEmployee(2L, "Luis", 25_000, 120));
        repository.save(new ContractEmployee(3L, "Sofía", 1_800_000));

        PayrollService payrollService = new PayrollService(repository);
        payrollService.calculatePayroll();
    }
}
