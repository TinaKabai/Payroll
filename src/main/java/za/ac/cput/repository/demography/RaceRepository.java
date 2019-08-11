package za.ac.cput.repository.demography;

import za.ac.cput.domain.demography.Race;
import za.ac.cput.repository.IRepository;

import java.util.Map;

public interface RaceRepository extends IRepository {

    Map<Race, Race> getAll();
}
