package za.ac.cput.service.user;

import za.ac.cput.domain.user.Employee;
import za.ac.cput.repository.user.EmployeeRepository;
import za.ac.cput.repository.user.EmployeeRepositoryImpl;

import java.util.Set;

public class EmployeeServiceImpl implements EmployeeService {

    private static EmployeeServiceImpl service = null;
    private EmployeeRepository repository;

    private EmployeeServiceImpl(){
        repository = (EmployeeRepository) EmployeeRepositoryImpl.getEmployeeRepository();
    }

    public static EmployeeServiceImpl getService(){
        if (service == null) service = new EmployeeServiceImpl();
        return null;
    }

    @Override
    public Employee create(Employee employee) {
        return create(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return update(employee);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Employee read(String s) {
        return read(s);
    }

    public Set<Employee> getAll() {
        return this.repository.getAll();
    }
}
