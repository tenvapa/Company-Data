package app.services;

import app.models.Department;
import app.models.Employee;

import java.util.ArrayList;

public interface DepartmentService {
    ArrayList<Department> getAll();
    void add(Department department);
    Department get(int index);
    Department get(String name);
    boolean remove(Department department);
}
