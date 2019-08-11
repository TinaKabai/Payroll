package za.ac.cput.repository.user;

import za.ac.cput.domain.user.Employee;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface EmployeeRepository extends IRepository {

    Set<Employee> getAll();
}
