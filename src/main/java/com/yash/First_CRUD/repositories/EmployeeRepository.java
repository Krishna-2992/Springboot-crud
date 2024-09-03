package com.yash.First_CRUD.repositories;

import com.yash.First_CRUD.dto.EmployeeDTO;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

    private List<EmployeeDTO> employeeList = new ArrayList<>();

    public void saveEmployee(Long id, String name, String doj, boolean isActive) {
        EmployeeDTO employee = new EmployeeDTO(id, name, doj, isActive);
        System.out.println("employee:::::::::::::::________");
        System.out.println(employee);
        employeeList.add(employee);
    }

    public EmployeeDTO getEmployee(long id) {
        for(EmployeeDTO e: employeeList) {
            if(e.getId() == id) {
                System.out.println("Same id found!!");
                return e;
            }
        }
        return new EmployeeDTO();
    }

}
