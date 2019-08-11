package za.ac.cput.domain.user;

public class Employee {

    private String firstName;
    private String lastName;
    private String employeeNumber;

    public Employee() {
    }
    private Employee(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.employeeNumber = builder.employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeNumber=" + employeeNumber +
                '}';
    }
    public static class Builder {

        private String firstName;
        private String lastName;
        private String employeeNumber;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder employeeNumber(String employeeNumber) {
            this.employeeNumber = employeeNumber;
            return this;
        }
        public Employee build(){

            return new Employee(this);
        }
        public Builder copy(Employee employee) {
            this.firstName = employee.firstName;
            this.lastName = employee.lastName;
            this.employeeNumber = employee.employeeNumber;

            return this;
        }
    }
}
