package app.models.interfaces;

import app.models.Department;

public interface Job {
    void setDepartment(Department department);
    Department getDepartment();
    void setName(String name);
    String getName();
}
