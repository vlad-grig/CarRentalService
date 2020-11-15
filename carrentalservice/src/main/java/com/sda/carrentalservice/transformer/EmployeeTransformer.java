package com.sda.carrentalservice.transformer;

import com.sda.carrentalservice.dto.EmployeeDTO;
import com.sda.carrentalservice.entity.Employee;
import org.springframework.beans.BeanUtils;

public class EmployeeTransformer {

    public EmployeeDTO transformFromEntityToDTO(Employee employee) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        BeanUtils.copyProperties(employee, employeeDTO);
        return employeeDTO;
    }

    public Employee transformFromDTOToEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        BeanUtils.copyProperties(employee, employeeDTO);
        return employee;
    }
}
