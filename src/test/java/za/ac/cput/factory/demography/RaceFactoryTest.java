package za.ac.cput.factory.demography;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.demography.Race;

import static org.junit.Assert.*;

public class RaceFactoryTest {

    @Test
    public void race(){

        Race race = RaceFactory.empRace("B1002019", "Black");

        Assert.assertEquals("Black", race.getDescription());
    }

}