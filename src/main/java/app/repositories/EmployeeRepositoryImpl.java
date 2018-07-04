package app.repositories;

import app.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
    private ArrayList<Employee> employees;

    public EmployeeRepositoryImpl() {
        this.employees = new ArrayList<>();
    }

    public boolean remove(Employee employee) {
        if(employee==null) return false;
        this.employees.remove(employee);
        return true;
    }

    public ArrayList<Employee> getAll() {
        return employees;
    }

    public void add(Employee employee) {
        if(employee==null) return;
        this.employees.add(employee);
    }
    public Employee get(int index) {
        if(index>=this.employees.size() || index<0) return null;
        return this.employees.get(index);
    }

    @Override
    public ArrayList<Employee> get(String name) {
        ArrayList<Employee> foundEmployees=new ArrayList<>();
        for (Employee employee : employees) {
            if(employee.getName().equals(name)) {
                foundEmployees.add(employee);
            }
        }
        return foundEmployees;
    }
}
