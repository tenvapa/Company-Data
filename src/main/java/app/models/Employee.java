package app.models;

import app.models.interfaces.Job;

public class Employee {
    Job job;
    String name;
    //In months
    int contractLength;
    double salary;

    public Employee(Job job, String name, int contractLength, double salary) {
        this.job = job;
        this.name = name;
        this.contractLength = contractLength;
        this.salary = salary;
    }

    public Job getJob() {
        return job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContractLength() {
        return contractLength;
    }

    public void setContractLength(int contractLength) {
        this.contractLength = contractLength;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.getJob().getDepartment().getName()+" -> "+this.getJob().getName()
                + " -> "+this.getName()+" -> "+this.getSalary()+" -> "+this.getContractLength();
    }
}
