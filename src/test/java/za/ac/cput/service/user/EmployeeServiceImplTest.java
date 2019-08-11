package za.ac.cput.service.user;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.domain.user.Employee;
import za.ac.cput.factory.user.EmployeeFactory;
import za.ac.cput.repository.user.EmployeeRepository;
import za.ac.cput.repository.user.EmployeeRepositoryImpl;

import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

    public class EmployeeServiceImplTest {

        private EmployeeRepository repository;

        private Employee employee;

        @Before
        public void setUp() throws Exception {

            this.repository = (EmployeeRepository) EmployeeRepositoryImpl.getEmployeeRepository();

            this.employee = EmployeeFactory.employee("Tina", "Kabai", "7143389");
        }

        @Test
        public void d_getAll() {
            Set<Employee> employee = this.repository.getAll();

            System.out.println("In getAll, all = " + employee);
        }

        @Test
        public void create() {

            this.repository.create(this.employee);

            System.out.println("In create, created = " + this.repository.create(this.employee));

            Assert.assertNotNull(this.repository.create(this.employee));

            Assert.assertSame(this.repository.create(this.employee), this.employee);
        }

        @Test
        public void read() {

            this.repository.read(employee.getEmployeeNumber());

            System.out.println("In read, read = " + this.repository.read(employee.getEmployeeNumber()));

            d_getAll();
            Assert.assertEquals(this.repository.read(employee.getEmployeeNumber()), employee);
        }

        @Test
        public void update() {

            String newRaceEmployee = "7148946";

            Employee updated = new Employee.Builder().employeeNumber(newRaceEmployee).build();

            System.out.println("In update, about_to_updated = " + updated);

            this.repository.update(updated);

            Assert.assertEquals(newRaceEmployee, updated.getEmployeeNumber());
            d_getAll();
        }

        @Test
        public void delete() {

            this.repository.delete(employee.getEmployeeNumber());
            d_getAll();
        }
}