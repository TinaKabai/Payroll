package za.ac.cput.service.user;

import za.ac.cput.domain.user.Employee;
import za.ac.cput.service.IService;

import java.util.Set;

public interface EmployeeService extends IService<Employee, String> {

    Set<Employee> getAll();
}
