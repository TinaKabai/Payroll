package za.ac.cput.service.demography.impl;

import za.ac.cput.domain.demography.Race;
import za.ac.cput.repository.demography.RaceRepository;
import za.ac.cput.repository.demography.impl.RaceRepositoryImpl;
import za.ac.cput.service.demography.RaceService;

import java.util.Map;
import java.util.Set;

public class RaceServiceImpl implements RaceService {

    private RaceServiceImpl service = null;
    private RaceRepository repository;

    private RaceServiceImpl(){
        this.repository = (RaceRepository) RaceRepositoryImpl.getRepository();
    }

    public RaceService getService(){
        if (service == null) service = new RaceServiceImpl();
        return null;
    }

    @Override
    public Race create(Race race) {
        return create(race);
    }

    @Override
    public Race update(Race race) {
        return update(race);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Race read(String s) {
        return read(s);
    }

    public Map<Race, Race> getAll() {
        return this.repository.getAll();
    }
}
