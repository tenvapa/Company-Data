package app.repositories;

import app.models.Department;
import app.models.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class DepartmentRepositoryImpl implements DepartmentRepository {
    private ArrayList<Department> departments;

    public DepartmentRepositoryImpl() {
        this.departments = new ArrayList<>();
    }

    @Override
    public ArrayList<Department> getAll() {
        return this.departments;
    }

    @Override
    public void add(Department department) {
        if(department==null) return;
        this.departments.add(department);
    }

    @Override
    public Department get(int index) {
        if(index>=this.departments.size() || index<0) return null;
        return this.departments.get(index);
    }

    @Override
    public Department get(String name) {
        for (Department department : departments) {
            if(department.getName().equals(name)) {
                return department;
            }
        }
        return null;
    }

    @Override
    public boolean remove(Department department) {
        return false;
    }
}
