package za.ac.cput.factory.user;

import za.ac.cput.domain.user.Employee;

public class EmployeeFactory {

    public static Employee employee(String fName, String lName, String employeeNumber) {
        return new Employee.Builder().firstName(fName).lastName(lName).employeeNumber(employeeNumber).build();
    }
}
