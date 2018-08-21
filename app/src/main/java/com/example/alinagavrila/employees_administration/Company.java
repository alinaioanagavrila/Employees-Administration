package com.example.alinagavrila.employees_administration;

import com.example.alinagavrila.employees_administration.constants.Enums.EmployeeType;
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

    public void consoleMenu(){
        System.out.println("***** Company menu *****\n");
    }

    public void main (String[] args){

    }
}
