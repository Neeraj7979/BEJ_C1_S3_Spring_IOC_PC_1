package com.niit.bej.beans;

import com.niit.bej.domain.Department;
import com.niit.bej.domain.Employee;
import org.springframework.context.annotation.Bean;

public class ConfigBean {
    @Bean("Employee")
    public Employee getEmployeeDetails() {
        Employee employee = new Employee();
        employee.setEmployeeId(1);
        employee.setEmployeeName("Neera j kumar");
        return employee;
    }

    @Bean("Department")
    public Department getDepartmentDetails() {
        Department department = new Department();
        department.setDepartmentId(5);
        department.setDepartmentName("Science");
        return department;
    }
}
