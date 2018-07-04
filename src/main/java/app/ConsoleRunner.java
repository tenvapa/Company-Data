package app;

import app.models.Department;
import app.models.Employee;
import app.models.JobImpl;
import app.models.interfaces.Job;
import app.services.DepartmentServiceImpl;
import app.services.EmployeeService;
import app.services.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleRunner implements CommandLineRunner {

    private EmployeeServiceImpl employeeService;
    private DepartmentServiceImpl departmentService;

    @Autowired
    public ConsoleRunner(EmployeeServiceImpl employeeService, DepartmentServiceImpl departmentService) {
        this.employeeService = employeeService;
        this.departmentService = departmentService;
    }

    @Override
    public void run(String... strings) throws Exception {
        Department SoftDev = new Department("Software Development");
        Job job = new JobImpl(SoftDev,"Java Development");
        Job job1 = new JobImpl(SoftDev,"Database Engineer");
        Job job2 = new JobImpl(SoftDev,"Javascript Development");
        Employee employee = new Employee(job2,"Penka",24,1600);
        Employee employee1 = new Employee(job,"Pesho",12,2000);
        Employee employee2 = new Employee(job,"Ginka",48,5500);
        Employee employee3 = new Employee(job,"Stamat",6,900);
        Employee employee4 = new Employee(job,"Penka",36,2600);
//        Employee employee2 = new Employee(job,"Stamat",12,2800);
//
//        System.out.println(employee.toString());
//        System.out.println(employee2.toString());
        this.employeeService.add(employee);
        this.employeeService.add(employee1);
        this.employeeService.add(employee2);
        this.employeeService.add(employee3);
        this.employeeService.add(employee4);
        departmentService.add(SoftDev);
        System.out.println(this.employeeService.get("Penka"));
        System.out.println(departmentService.get("Software Development"));
        this.employeeService.remove(employee);

    }
}
