package com.UST.EmployeeApplication.service;

import com.UST.EmployeeApplication.model.EmployeeModel;
import com.UST.EmployeeApplication.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;


    public EmployeeModel createEmployee(EmployeeModel employee) {

        return repository.save(employee);
    }

    public List<EmployeeModel> getEmployees() {
        return repository.findAll();
    }

    public EmployeeModel getByEmployeeId(String empId) {
        return repository.findByempId(empId);
    }

    public String deleteByEmployeeEmpId(String id) {
        repository.deleteByEmpId(id);
        return "Its deleted";
    }
}
