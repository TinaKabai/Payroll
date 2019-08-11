package za.ac.cput.factory.demography;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.demography.EmployeeGender;

public class EmployeeGenderFactoryTest {

    @Test
    public void gender(){

        EmployeeGender emplGender = EmployeeGenderFactory.employeeGender("Female", "7143889");

        Assert.assertEquals("Female", emplGender.getGender());
    }

}