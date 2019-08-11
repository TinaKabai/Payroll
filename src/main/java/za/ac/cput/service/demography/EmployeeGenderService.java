package za.ac.cput.service.demography;

import za.ac.cput.domain.demography.EmployeeGender;
import za.ac.cput.service.IService;

import java.util.Map;

public interface EmployeeGenderService extends IService<EmployeeGender, String> {

    Map<EmployeeGender, EmployeeGender> getAll();
}
