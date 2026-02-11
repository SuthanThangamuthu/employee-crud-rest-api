package com.example.employee.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.entity.Employee;
import com.example.employee.service.EmployeeService;
import java.util.List;



@RestController
@RequestMapping("/api/employees")

public class EmployeeController {
	 private final EmployeeService service;

	    public EmployeeController(EmployeeService service) {
	        this.service = service;
	    }

	    // CREATE
	    @PostMapping
	    public Employee createEmployee(@RequestBody Employee employee) {
	        return service.saveEmployee(employee);
	    }

	    // READ
	    @GetMapping
	    public List<Employee> getEmployees() {
	        return service.getAllEmployees();
	    }

	    // UPDATE
	    @PutMapping("/{id}")
	    public Employee updateEmployee(
	            @PathVariable Long id,
	            @RequestBody Employee employee) {
	        return service.updateEmployee(id, employee);
	    }

	    // DELETE
	    @DeleteMapping("/{id}")
	    public String deleteEmployee(@PathVariable Long id) {
	        service.deleteEmployee(id);
	        return "Employee deleted successfully";
	    }
}
