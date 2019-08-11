package za.ac.cput.repository.demography.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.domain.demography.EmployeeGender;
import za.ac.cput.factory.demography.EmployeeGenderFactory;
import za.ac.cput.repository.demography.EmployeeGenderRepository;

import java.util.Map;

    @FixMethodOrder(MethodSorters.NAME_ASCENDING)

    public class EmployeeGenderRepositoryImplTest {

        private EmployeeGenderRepository repository;

        private EmployeeGender employeeGender;

        @Before
        public void setUp() throws Exception {

            this.repository = (EmployeeGenderRepository) EmployeeGenderRepositoryImpl.getRepository();

           // this.employeeGender = EmployeeGenderFactory.employeeGender("Female", "7143889");
        }

        @Test
        public void d_getAll() {
            Map<EmployeeGender, EmployeeGender> employeeG = this.repository.getAll();

            System.out.println("In getAll, all = " + employeeG);
        }

        @Test
        public void create() {

            EmployeeGender created = (EmployeeGender) this.repository.create(this.employeeGender);

            this.employeeGender = EmployeeGenderFactory.employeeGender("Female", "7143889");

            repository.create(created);

            System.out.println("In create, created = " + created);

            Assert.assertNotNull(created);

            Assert.assertSame(created, this.employeeGender);
        }

        @Test
        public void read() {

            EmployeeGender read = (EmployeeGender) this.repository.read(employeeGender.getGender());

            System.out.println("In read, read = " + read);

            d_getAll();
            Assert.assertEquals(read, read);
        }

        @Test
        public void update() {

            String newGender = "1998NN";

            EmployeeGender updated = new EmployeeGender.Builder().gender(newGender).build();

            System.out.println("In update, about_to_updated = " + updated);

            this.repository.update(updated);

            Assert.assertEquals(newGender, updated.getGender());
            d_getAll();
        }

        @Test
        public void delete() {

            this.repository.delete(employeeGender.getGender());
            d_getAll();
        }

}