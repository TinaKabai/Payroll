package za.ac.cput.repository.demography;

import za.ac.cput.domain.demography.EmployeeGender;
import za.ac.cput.repository.IRepository;

import java.util.Map;

public interface EmployeeGenderRepository extends IRepository {

    Map<EmployeeGender, EmployeeGender> getAll();
}
