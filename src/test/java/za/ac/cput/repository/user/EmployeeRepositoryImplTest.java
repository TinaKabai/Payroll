package za.ac.cput.repository.user;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.domain.user.Employee;
import za.ac.cput.factory.user.EmployeeFactory;

import java.util.Map;

    @FixMethodOrder(MethodSorters.NAME_ASCENDING)

    public class EmployeeRepositoryImplTest {

        private EmployeeRepository repository;

        private Employee employee;

        @Before
        public void setUp() throws Exception {

            this.repository = (EmployeeRepository) EmployeeRepositoryImpl.getEmployeeRepository();

            this.employee = EmployeeFactory.employee("Tina", "Kabai", "7143889");
        }

        @Test
        public void d_getAll() {
            Map<Employee, Employee> emp = (Map<Employee, Employee>) this.repository.getAll();

            System.out.println("In getAll, all = " + emp);
        }

        @Test
        public void create() {

            Employee created = (Employee) this.repository.create(this.employee);

            System.out.println("In create, created = " + created);

            Assert.assertNotNull(created);

            Assert.assertSame(created, this.employee);
        }

        @Test
        public void read() {

            Employee read = (Employee) this.repository.read(employee.getEmployeeNumber());

            System.out.println("In read, read = " + read);

            d_getAll();
            Assert.assertEquals(read, read);
        }

        @Test
        public void update() {

            String newEmployee = "71520356";

            Employee updated = new Employee.Builder().employeeNumber(newEmployee).build();

            System.out.println("In update, about_to_updated = " + updated);

            this.repository.update(updated);

            Assert.assertEquals(newEmployee, updated.getEmployeeNumber());
            d_getAll();
        }

        @Test
        public void delete() {

            this.repository.delete(employee.getEmployeeNumber());
            d_getAll();
        }

}