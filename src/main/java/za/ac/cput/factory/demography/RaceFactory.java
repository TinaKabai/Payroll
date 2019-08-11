package za.ac.cput.factory.demography;

import za.ac.cput.domain.demography.Race;

public class RaceFactory {

        public static Race empRace(String raceId, String description) {
            return new Race.Builder().id(raceId).desc(description).build();
        }
}
