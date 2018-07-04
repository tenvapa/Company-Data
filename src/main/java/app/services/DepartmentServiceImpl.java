package app.services;

import app.models.Department;
import app.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public ArrayList<Department> getAll() {
        return departmentRepository.getAll();
    }

    @Override
    public void add(Department department) {
        departmentRepository.add(department);
    }

    @Override
    public Department get(int index) {
        return departmentRepository.get(index);
    }

    @Override
    public Department get(String name) {
        return departmentRepository.get(name);
    }

    @Override
    public boolean remove(Department department) {
        return departmentRepository.remove(department);
    }
}
