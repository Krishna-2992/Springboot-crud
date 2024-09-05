package com.yash.First_CRUD.controller;

import com.yash.First_CRUD.dto.EmployeeDTO;
import com.yash.First_CRUD.services.EmployeeServices;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    EmployeeServices employeeServices = new EmployeeServices();

    @GetMapping(path="/employees/{id}")
    public String getEmployee(@PathVariable Long id) {
        return "Krishna: id: " + id;
    }

    @GetMapping(path="/test")
    public String getTestData(@PathParam("id") Long id) {
        return "id using pathparam is: " + id;
    }

    @PostMapping(path="/employees")
    public String saveEmployee(@PathParam("id") Long id,
                               @PathParam("name") String name,
                               @PathParam("doj") String doj,
                               @PathParam("isActive") boolean isActive) {
        employeeServices.saveEmployee(id, name, doj, isActive);
        return "Employee added successfully!!";
    }

    @GetMapping(path="/employees")
    public EmployeeDTO getEmployeeById(@PathParam("id") Long id) {
        return employeeServices.getEmployee(id);
    }

    @GetMapping(path="/getEmployee")
    public List<EmployeeDTO> getAllEmployee() {
        return employeeServices.getAllEmployees();
    }

    @PostMapping(path="/employee") {

    }

}
