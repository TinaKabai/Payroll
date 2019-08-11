package za.ac.cput.repository.demography.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.domain.demography.Race;
import za.ac.cput.factory.demography.RaceFactory;
import za.ac.cput.repository.demography.RaceRepository;

import java.util.Map;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class RaceRepositoryImplTest {

    private RaceRepository repository;

    private Race race;

    @Before
    public void setUp() throws Exception {

        this.repository = (RaceRepository) RaceRepositoryImpl.getRepository();

        this.race = RaceFactory.empRace("B1002019", "Black");
    }

    @Test
    public void d_getAll() {
        Map<Race, Race> race = this.repository.getAll();

        System.out.println("In getAll, all = " + race);
    }

    @Test
    public void create() {

        Race created = (Race) this.repository.create(this.race);

        System.out.println("In create, created = " + created);

        Assert.assertNotNull(created);

        Assert.assertSame(created, this.race);
    }

    @Test
    public void read() {

        Race read = (Race) this.repository.read(race.getRaceId());

        System.out.println("In read, read = " + read);

        d_getAll();
        Assert.assertEquals(read, read);
    }

    @Test
    public void update() {

        String newARace = "W1002019";

        Race updated = new Race.Builder().id(newARace).build();

        System.out.println("In update, about_to_updated = " + updated);

        this.repository.update(updated);

        Assert.assertEquals(newARace, updated.getRaceId());
        d_getAll();
    }

    @Test
    public void delete() {

        this.repository.delete(race.getRaceId());
        d_getAll();
    }

}