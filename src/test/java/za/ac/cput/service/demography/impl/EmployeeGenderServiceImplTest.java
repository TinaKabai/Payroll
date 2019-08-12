package za.ac.cput.service.demography.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.domain.demography.EmployeeGender;
import za.ac.cput.factory.demography.EmployeeGenderFactory;
import za.ac.cput.repository.demography.EmployeeGenderRepository;
import za.ac.cput.repository.demography.impl.EmployeeGenderRepositoryImpl;

import java.util.Map;

    @FixMethodOrder(MethodSorters.NAME_ASCENDING)

    public class EmployeeGenderServiceImplTest {

        private EmployeeGenderRepository repository;

        private EmployeeGender employeeGender;

        @Before
        public void setUp() throws Exception {

            repository = (EmployeeGenderRepository) EmployeeGenderRepositoryImpl.getRepository();

            this.employeeGender = EmployeeGenderFactory.employeeGender("Female", "7143889");
        }

        @Test
        public void d_getAll() {
            Map<EmployeeGender, EmployeeGender> employeeGender = this.repository.getAll();

            System.out.println("In getAll, all = " + employeeGender);
        }

        @Test
        public void create() {

            this.repository.create(this.employeeGender);

            System.out.println("In create, created = " + this.repository.create(this.employeeGender));

            Assert.assertNotNull(this.repository.create(this.employeeGender));

            Assert.assertSame(this.repository.create(this.employeeGender), this.employeeGender);
        }

        @Test
        public void read() {

            this.repository.read(employeeGender.getGender());

            System.out.println("In read, read = " + this.repository.read(employeeGender.getGender()));

            d_getAll();
            Assert.assertEquals(this.repository.read(employeeGender.getGender()), employeeGender);
        }

        @Test
        public void update() {

            String newGender = "male";

            EmployeeGender updated = new EmployeeGender.Builder().gender(newGender).build();

            System.out.println("In update, about_to_updated = " + updated);

            this.repository.update(updated);

            Assert.assertEquals(newGender, updated.getGender());
            d_getAll();
        }

        @Test
        public void delete() {

            repository.delete(employeeGender.getGender());
            d_getAll();
        }
}