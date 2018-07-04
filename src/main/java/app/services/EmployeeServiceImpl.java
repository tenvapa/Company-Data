package app.services;

import app.models.Employee;
import app.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public boolean remove(Employee employee) {
        return this.employeeRepository.remove(employee);
    }

    public ArrayList<Employee> getAll() {
        return this.employeeRepository.getAll();
    }

    public void add(Employee employee) {
        this.employeeRepository.add(employee);
    }
    public Employee get(int index) {
        return this.employeeRepository.get(index);
    }

    @Override
    public ArrayList<Employee> get(String name) {
        if(name==null) return null;
        return this.employeeRepository.get(name);
    }
}
