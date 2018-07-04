package app.services;

import app.models.Employee;
import java.util.ArrayList;

public interface EmployeeService {
    ArrayList<Employee> getAll();
    void add(Employee employee);
    Employee get(int index);
    ArrayList<Employee> get(String name);
    boolean remove(Employee employee);
}
