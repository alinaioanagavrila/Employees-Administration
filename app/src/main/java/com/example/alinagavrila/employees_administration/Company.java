package com.example.alinagavrila.employees_administration;

import com.example.alinagavrila.employees_administration.constants.Enums.Gender;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private static List<Employee> employeeList = new ArrayList<>();

    public static void addNewEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public static void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }

    public static void viewEmployees() {
        for (int i = 0; i < employeeList.size(); i++) {
            employeeList.get(i).toString();
        }
    }

    public static void sortAlphabeticalEmployees() {
        boolean flag = true;
        String temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < employeeList.size() - 1; i++) {
                if (employeeList.get(i).employeeData.get("NAME").compareTo(employeeList.get(i + 1).employeeData.get("NAME")) > 0) {
                    temp = employeeList.get(i).employeeData.get("NAME");
                    employeeList.get(i).employeeData.put("NAME", employeeList.get(i + 1).employeeData.get("NAME"));
                    employeeList.get(i + 1).employeeData.put("NAME", temp);
                    flag = true;
                }
            }
        }
    }

    public static void updateEmployee(Employee employee, String key, String value) {
        if (employee.employeeData.containsKey(key)) {
            employee.employeeData.put(key, value);
        } else {
            System.out.println("The introduced key doesn't exist!");
        }
    }

    public static void consoleMenu(Employee employee) {
        System.out.println("***** Company Menu *****\n\n");
        System.out.println("1. Add New Employee \n");
        System.out.println("2. Update Employee information \n");
        System.out.println("3. Remove Employee \n");
        System.out.println("4. Sort Employees List \n");
        System.out.println("5. View Employee List \n");
        System.out.println("6. Exit \n\n");
        System.out.println("Choose an action from menu:");
        String menuOption = System.console().readLine();

        while(menuOption != "6") {
            switch (menuOption) {
                case "1":
                    addNewEmployee(employee);
                    break;
                case "2":
                    System.out.println("Insert key to be modified: ");
                    String key = System.console().readLine();
                    System.out.println("Insert new value for the key: ");
                    String value = System.console().readLine();
                    updateEmployee(employee, key, value);
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
            menuOption = System.console().readLine();
        }
    }

    public static void main(String[] args) {
        Employee employee = new AdministrativeEmployee("Popescu Mihai", "1870315151541", Gender.M, "Administrative", true, true);
        consoleMenu(employee);
    }
}
