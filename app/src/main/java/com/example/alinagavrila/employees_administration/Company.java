package com.example.alinagavrila.employees_administration;

import com.example.alinagavrila.employees_administration.constants.Enums.EmployeeType;
import com.example.alinagavrila.employees_administration.constants.Enums.Gender;
import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employeeList = new ArrayList<>();
    private int numberOfEmplyees = 0;

    public void addNewEmployee(Employee employee) {
         employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
        numberOfEmplyees--;
    }

    public void viewEmployees() {
        for(int i=0; i<numberOfEmplyees; i++) {
            employeeList.get(i).toString();
        }
    }

    public void sortAlphabeticalEmployees() {
        boolean flag = true;
        String temp;
        while (flag) {
            flag = false;
            for(int i=0; i<employeeList.size() -1; i++) {
                if(employeeList.get(i).employeeData.get("NAME").compareTo(employeeList.get(i+1).employeeData.get("NAME"))>0) {
                    temp = employeeList.get(i).employeeData.get("NAME");
                    employeeList.get(i).employeeData.put("NAME", employeeList.get(i+1).employeeData.get("NAME"));
                    employeeList.get(i+1).employeeData.put("NAME", temp);
                    flag = true;
                }
            }
        }
    }

    public void updateEmployee(Employee employee, String key, String value) {
        if(employee.employeeData.get(key) != null) {
            employee.employeeData.put(key, value);
        }
        else {
            System.out.println("The introduced key doesn't exist!");
        }
    }

    public void consoleMenu() {
        System.out.println("***** Company Menu *****\n\n");
        System.out.println("1. Add New Employee \n");
        System.out.println("2. Update Employee information \n");
        System.out.println("3. Remove Employee \n");
        System.out.println("4. Sort Employees List \n");
        System.out.println("5. View Employee List \n\n");
        System.out.println("Choose an action from menu:");
    }

    public void main (String[] args) {
        Employee employee= new AdministrativeEmployee("Popescu Mihai","1870315151541", Gender.M, "Administrative", true, true);
        consoleMenu();
        String menuOption = System.console().readLine();

        switch(menuOption){
             case "1":
                 addNewEmployee(employee);
                 break;
             case "2":
                 updateEmployee(employee,"NAME","Popescu George");
                 break;
             case "3":
                 removeEmployee(employee);
                 break;
             case "4":
                 sortAlphabeticalEmployees();
                 break;
             case "5":
                 viewEmployees();
                 break;
             default:
                 System.out.println("Option not valid");
                 break;
        }
    }
}
