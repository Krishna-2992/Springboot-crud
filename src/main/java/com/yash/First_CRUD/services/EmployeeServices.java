package com.yash.First_CRUD.services;

import com.yash.First_CRUD.dto.EmployeeDTO;
import com.yash.First_CRUD.repositories.EmployeeRepository;

public class EmployeeServices {

    final EmployeeRepository empRepository = new EmployeeRepository();

    public void saveEmployee(Long id, String name, String doj, boolean isActive) {
        empRepository.saveEmployee(id, name, doj, isActive);
    }

    public EmployeeDTO getEmployee(long id) {
        return empRepository.getEmployee(id);
    }

}
