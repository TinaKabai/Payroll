package za.ac.cput.repository.user;

import za.ac.cput.domain.user.Employee;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRepositoryImpl  {

    private Set<Employee> employees;
    private static EmployeeRepositoryImpl employeeRepository;

    private EmployeeRepositoryImpl() {
        this.employees = new HashSet<>();
    }

    public static EmployeeRepositoryImpl getEmployeeRepository() {
        if (employeeRepository == null) employeeRepository = new EmployeeRepositoryImpl();
        return employeeRepository;
    }

    public Employee create(Employee employee) {
        this.employees.add(employee);
        return employee;
    }

    public Employee read(String s) {
        Employee emp = this.read(s);
        return emp;
    }

    public Employee update(Employee employee) {
        Employee emp = read(employee.getEmployeeNumber());
        if (emp != null){
            Employee updated = new Employee.Builder().copy(emp).firstName(employee.getFirstName()).build();
            delete(emp.getEmployeeNumber());
            this.employees.add(updated);
            emp = updated;
        }
        return emp;
    }

    public void delete(String s) {
        Employee employee = read(s);
        this.employees.remove(employee);
    }
}
