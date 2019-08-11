package za.ac.cput.repository.demography.impl;

import za.ac.cput.domain.demography.EmployeeGender;
import za.ac.cput.repository.demography.EmployeeGenderRepository;

import java.util.HashMap;
import java.util.Map;

public class EmployeeGenderRepositoryImpl {

    private static EmployeeGenderRepositoryImpl repository = null;
    private Map<EmployeeGender, EmployeeGender> db;

    private EmployeeGenderRepositoryImpl() {
        this.db = new HashMap<>();
    }
    public static EmployeeGenderRepositoryImpl getRepository(){

        if(repository == null) repository = new EmployeeGenderRepositoryImpl();
        return repository;
    }

    public Map<EmployeeGender, EmployeeGender> getAll() {
        return null;
    }

    public EmployeeGender create(EmployeeGender employeeGender) {
        this.db.put(employeeGender, employeeGender);
        return employeeGender;
    }

    public EmployeeGender read(String s) {
        EmployeeGender eg = this.db.get(s);
        return eg;
    }

    public EmployeeGender update(EmployeeGender employeeGender) {
        EmployeeGender eg = this.db.get(employeeGender);
        if (eg != null){
            EmployeeGender updatedRace = new EmployeeGender.Builder().copy(eg).gender(eg.getGender()).build();
            delete(eg.getEmployeeNumber());
            this.db.remove(eg);
            this.db.put(eg, updatedRace);
        }
        return eg;
    }

    public void delete(String s) {
        EmployeeGender emplG = read(s);
        this.db.remove(emplG);
    }
}
