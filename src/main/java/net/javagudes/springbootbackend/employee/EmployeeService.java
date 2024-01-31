package net.javagudes.springbootbackend.employee;

import org.springframework.hateoas.EntityModel;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    EntityModel<Employee> getEmployeeById(long id);
    Employee updateEmployee(Employee employee, long id);
    void deleteEmployee(long id);
}
