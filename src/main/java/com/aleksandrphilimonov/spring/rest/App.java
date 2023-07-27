package com.aleksandrphilimonov.spring.rest;

import com.aleksandrphilimonov.spring.rest.configuration.MyConfig;
import com.aleksandrphilimonov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//        allEmployees.forEach(System.out::println);

//        System.out.println(communication.getEmployee(1));

//        Employee employee = new Employee("Zaur", "Tregulov", "HR", 500);
//        employee.setId(1);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(1);

    }
}
