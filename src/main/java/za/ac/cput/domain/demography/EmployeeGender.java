package za.ac.cput.domain.demography;

public class EmployeeGender {
    private String gender;
    private String employeeNumber;

    public EmployeeGender() {
    }
    private EmployeeGender(Builder builder) {
        this.gender = builder.gender;
        this.employeeNumber = builder.employeeNumber;
    }

    public String getGender() {
        return gender;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    @Override
    public String toString() {
        return "EmployeeGender{" +
                "gender='" + gender + '\'' +
                ", employeeNumber='" + employeeNumber + '\'' +
                '}';
    }

    public static class Builder {

        private String gender;
        private String employeeNumber;

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }
        public Builder employeeNumber(String employeeNumber) {
            this.employeeNumber = employeeNumber;
            return this;
        }
        public EmployeeGender build(){

            return new EmployeeGender(this);
        }
        public Builder copy(EmployeeGender employeeGender) {
            this.gender = employeeGender.gender;
            this.employeeNumber = employeeGender.employeeNumber;

            return this;
        }
    }
}
