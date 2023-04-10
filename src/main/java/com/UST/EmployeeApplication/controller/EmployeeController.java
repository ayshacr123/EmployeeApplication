package com.UST.EmployeeApplication.controller;

import com.UST.EmployeeApplication.model.EmployeeModel;
import com.UST.EmployeeApplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/main")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeservice;
    @PostMapping("/")
    public EmployeeModel addemp(@RequestBody EmployeeModel employee) {
        return employeeservice.createEmployee(employee);
    }

   @GetMapping("a")
    public List<EmployeeModel> getAllEmployees(){
        return employeeservice.getEmployees();
   }

   @GetMapping("/a/{empId}")
    public EmployeeModel getByEmployeeId(@PathVariable String empId){
        return employeeservice.getByEmployeeId(empId);
   }


   @Transactional
   @DeleteMapping("/b/{id}")
    public String deleteByEmployeeEmpId(@PathVariable String id){
        return employeeservice.deleteByEmployeeEmpId(id);
   }

}
