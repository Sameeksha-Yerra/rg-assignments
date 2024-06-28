package com.example.employeecrudproj;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCRUD {
    private List<Employee> employees;

    public EmployeeCRUD() {
        employees = new ArrayList<>();
    }

    // Create - Add a new employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Read - Get all employees
    public List<Employee> getAllEmployees() {
        return employees;
    }

    // Read - Get an employee by ID
    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null; // or throw an exception if preferred
    }

    // Update - Update an existing employee
    public boolean updateEmployee(Employee updatedEmployee) {
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            if (employee.getId() == updatedEmployee.getId()) {
                employees.set(i, updatedEmployee);
                return true;
            }
        }
        return false;
    }

    // Delete - Remove an employee by ID
    public boolean deleteEmployee(int id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                employees.remove(i);
                return true;
            }
        }
        return false;
    }

    // Main method for testing
    public static void main(String[] args) {
        EmployeeCRUD employeeCRUD = new EmployeeCRUD();

        // Create
        Employee e1 = new Employee(1, "Sameeksha", "Develop");
        Employee e2 = new Employee(2, "Snehith", "IT");
        employeeCRUD.addEmployee(e1);
        employeeCRUD.addEmployee(e2);

        // Read all
        System.out.println("All Employees: " + employeeCRUD.getAllEmployees());

        // Read by ID
        System.out.println("Employee with ID 1: " + employeeCRUD.getEmployeeById(1));

        // Update
        Employee e1Updated = new Employee(1, "Alice Smith", "HR");
        employeeCRUD.updateEmployee(e1Updated);
        System.out.println("Updated Employee with ID 1: " + employeeCRUD.getEmployeeById(1));

        // Delete
        employeeCRUD.deleteEmployee(2);
        System.out.println("All Employees after deletion: " + employeeCRUD.getAllEmployees());
    }
}
