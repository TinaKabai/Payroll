package za.ac.cput.service.demography.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.domain.demography.Race;
import za.ac.cput.factory.demography.RaceFactory;
import za.ac.cput.repository.demography.RaceRepository;
import za.ac.cput.repository.demography.impl.RaceRepositoryImpl;

import java.util.Map;

    @FixMethodOrder(MethodSorters.NAME_ASCENDING)

    public class RaceServiceImplTest {

        private RaceRepository repository;

        private Race race;

        @Before
        public void setUp() throws Exception {

            this.repository = (RaceRepository) RaceRepositoryImpl.getRepository();

            this.race = RaceFactory.empRace("B002019", "Black");
        }

        @Test
        public void d_getAll() {
            Map<Race, Race> race = this.repository.getAll();

            System.out.println("In getAll, all = " + race);
        }

        @Test
        public void create() {

            this.repository.create(this.race);

            System.out.println("In create, created = " + this.repository.create(this.race));

            Assert.assertNotNull(this.repository.create(this.race));

            Assert.assertSame(this.repository.create(this.race), this.race);
        }

        @Test
        public void read() {

            this.repository.read(race.getRaceId());

            System.out.println("In read, read = " + this.repository.read(race.getRaceId()));

            d_getAll();
            Assert.assertEquals(this.repository.read(race.getRaceId()), race);
        }

        @Test
        public void update() {

            String newRace = "I2002019";

            Race updated = new Race.Builder().id(newRace).build();

            System.out.println("In update, about_to_updated = " + updated);

            this.repository.update(updated);

            Assert.assertEquals(newRace, updated.getRaceId());
            d_getAll();
        }

        @Test
        public void delete() {

            this.repository.delete(race.getRaceId());
            d_getAll();
        }

}