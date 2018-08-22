package com.example.alinagavrila.employees_administration;

import com.example.alinagavrila.employees_administration.constants.Enums.Gender;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Company {
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static List<Employee> employeeList = new ArrayList<>();

    /**
     * This method removes an employee from Employees' List
     *
     * @param employee - the employee that will be removed
     */
    public static void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }

    /**
     * This method displayes the entire list of employees
     */
    public static void viewEmployees() {
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i).toString());
        }
    }

    /**
     * This method sorts the employees in alphabetical order by name
     */
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

    /**
     * This method updates the information of an employee
     *
     * @param employee - the employee that will be updated
     * @param key      - the property that will be modified
     * @param value    - The new value that will be assigned to the key
     */
    public static void updateEmployee(Employee employee, String key, String value) {
        if (employee.employeeData.containsKey(key)) {
            employee.employeeData.put(key, value);
        } else {
            System.out.println("The introduced key doesn't exist!");
        }
    }

    /**
     * This method is used to comunicate with console in order to make any action to employees
     *
     * @throws IOException - if buffer reader doesn't work
     */
    public static void consoleMenu() throws Exception {
        System.out.println("***** Company Menu *****\n");
        System.out.println("1. Add New Employee");
        System.out.println("2. Update Employee information");
        System.out.println("3. Remove Employee");
        System.out.println("4. Sort Employees List");
        System.out.println("5. View Employee List");
        System.out.println("6. Exit \n");
        System.out.println("Choose an action from menu:");
    }

    public static void chooseAnOptionFromMenu(Employee employee)throws Exception{
        consoleMenu();
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        String menuOption = null;
        try {
            menuOption = bufferReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (!menuOption.equals("6")) {
            switch (menuOption) {
                case "1":
                    addNewEmployee2();
                    break;
                case "2":
                    System.out.println("Insert key to be modified: ");
                    String key = bufferReader.readLine();
                    System.out.println("Insert new value for the key: ");
                    String value = bufferReader.readLine();
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
            }
            consoleMenu();
            menuOption = bufferReader.readLine();
        }
    }


    public static void addNewEmployee2() throws Exception {
        System.out.println("Insert new employee's type:");
        String type = br.readLine();
        Employee newEmployee = getNewEmployeeDataByType(type);
        employeeList.add(newEmployee);
    }


    public static Employee getNewEmployeeDataByType(String type) throws IOException {
        Employee employee = null;
        String currentInfo;
        boolean hasEmployeeBeenInitialized = true;
        switch (type.toLowerCase()) {
            case "administrative":
                employee = new AdministrativeEmployee();
               break;
            case "dev":
                employee = new DevEmployee();
                break;
            case "qa":
                employee = new QaEmployee();
                break;
            case "support":
                employee = new SupportEmployee();
                break;
            case "tldev":
                employee = new TlDevEmployee();
                break;
            case "tlqa":
                employee = new TlQaEmployee();
                break;
            default:
                hasEmployeeBeenInitialized = false;
                System.out.println("Invalid type!");
        }
        if (hasEmployeeBeenInitialized) {
            for (int i = 0; i < employee.specificAtributes.size(); i++) {
                if(!employee.specificAtributes.get(i).equals("TYPE")) {
                    System.out.println(employee.specificAtributes.get(i) + ": ");
                    currentInfo = br.readLine();
                    employee.employeeData.put(employee.specificAtributes.get(i), currentInfo);
                }
            }
        }
        return employee;
    }


    public static void main(String[] args) throws Exception {
        Employee employee = new AdministrativeEmployee("Popescu Mihai", "1870315151541", Gender.M, "Administrative", true, true);
        chooseAnOptionFromMenu(employee);
    }
}
