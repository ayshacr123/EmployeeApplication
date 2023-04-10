package com.UST.EmployeeApplication.repository;

import com.UST.EmployeeApplication.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer> {
    EmployeeModel findByempId(String empId);

    void deleteByEmpId(String empId);

}
