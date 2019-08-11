package za.ac.cput.factory.user;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.user.Employee;

public class EmployeeFactoryTest {

    @Test
    public void employee(){

        Employee empl = EmployeeFactory.employee("Tina", "Kabai", "7143889");

        Assert.assertEquals("7143889", empl.getEmployeeNumber());
    }
}