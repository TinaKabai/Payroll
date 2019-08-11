package za.ac.cput.repository.demography.impl;

import za.ac.cput.domain.demography.Race;

import java.util.HashMap;
import java.util.Map;

public class RaceRepositoryImpl {

    private static RaceRepositoryImpl repository = null;
    private Map<Race, Race> db;

    private RaceRepositoryImpl() {
        this.db = new HashMap<>();
    }
    public static RaceRepositoryImpl getRepository(){

        if(repository == null) repository = new RaceRepositoryImpl();
        return repository;
    }
    public Race create(Race race){
        this.db.put(race, race);
        return race;
    }
    public Race read(String s){
        Race r = this.db.get(s);
        return r;
    }
    public Race update(Race race){
        Race r = this.db.get(race);
        if (r != null){
            Race updatedRace = new Race.Builder().copy(r).desc(r.getDescription()).build();
            delete(r.getRaceId());
            this.db.remove(r);
            this.db.put(r, updatedRace);
        }
        return r;
    }
    public void delete(String s){
        Race race = read(s);
        this.db.remove(race);
    }
}
