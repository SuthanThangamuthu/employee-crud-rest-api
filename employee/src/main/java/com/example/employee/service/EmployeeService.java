package com.example.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employee.entity.Employee;
import com.example.employee.repository.EmployeeRepository;


@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    // Constructor Injection (BEST PRACTICE)
    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    // =====================
    // CREATE
    // =====================
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    // =====================
    // READ
    // =====================
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    // =====================
    // UPDATE
    // =====================
    public Employee updateEmployee(Long id, Employee employee) {
        Employee existingEmployee = repository.findById(id).orElse(null);

        if (existingEmployee != null) {
            existingEmployee.setName(employee.getName());
            existingEmployee.setDepartment(employee.getDepartment());
            return repository.save(existingEmployee);
        }
        return null;
    }

    // =====================
    // DELETE
    // =====================
    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}
