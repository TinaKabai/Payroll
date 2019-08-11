package za.ac.cput.service.demography.impl;

import za.ac.cput.domain.demography.EmployeeGender;
import za.ac.cput.repository.demography.EmployeeGenderRepository;
import za.ac.cput.repository.demography.impl.EmployeeGenderRepositoryImpl;
import za.ac.cput.repository.user.EmployeeRepository;
import za.ac.cput.service.demography.EmployeeGenderService;

import java.util.Map;

public class EmployeeGenderServiceImpl implements EmployeeGenderService {

    private EmployeeGenderServiceImpl service = null;
    private EmployeeGenderRepository repository;

    private EmployeeGenderServiceImpl(){
        this.repository = (EmployeeGenderRepository) EmployeeGenderRepositoryImpl.getRepository();
    }

    public EmployeeGenderService getService(){
        if (service == null) service = new EmployeeGenderServiceImpl();
        return null;
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        return create(employeeGender);
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        return update(employeeGender);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public EmployeeGender read(String s) {
        return read(s);
    }

    public Map<EmployeeGender, EmployeeGender> getAll() {
        return this.repository.getAll();
    }
}
