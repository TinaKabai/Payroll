package za.ac.cput.factory.demography;

import za.ac.cput.domain.demography.EmployeeGender;
import za.ac.cput.domain.user.Employee;

    public class EmployeeGenderFactory {
        public static EmployeeGender employeeGender(String gender, String employeeNumber){
            return new EmployeeGender.Builder().gender(gender).employeeNumber(employeeNumber).build();
        }
}