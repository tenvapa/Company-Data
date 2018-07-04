package app.models;

import app.models.interfaces.Job;

public class JobImpl implements Job {
    Department department;
    String name;

    public JobImpl(Department department, String name) {
        this.department = department;
        this.name=name;
    }

    @Override
    public void setDepartment(Department department) {
        this.department=department;
    }

    @Override
    public Department getDepartment() {
        return this.department;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
