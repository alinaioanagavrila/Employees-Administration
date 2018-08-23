package com.example.alinagavrila.employees_administration;

import org.json.JSONException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Company {
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static List<Employee> employeeList = new ArrayList<>();

    /**
     * This method removes an employee from the list of employees
     *
     * @throws IOException if buffer reader doesn't work
     */
    public static void removeEmployee() throws IOException {
        viewEmployees();

        System.out.println("Insert employee's index to be removed: ");
        String index = br.readLine();

        int i = Integer.valueOf(index);
        employeeList.remove(employeeList.remove(i));
    }

    /**
     * This method displayes all employees' details from employees' list
     */
    public static void viewEmployees() {
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println("Employee index = " + i);
            System.out.println(employeeList.get(i).toString());
        }
    }

    /**
     * This method sorts the employees in alphabetical order (by name)
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
     * This method updates an employee's information
     * Index, key that will be updated and the new vaalue are read from console
     *
     * @throws IOException if buffer reader doesn't work
     */
    public static void updateEmployee() throws IOException {
        viewEmployees();

        System.out.println("Insert employee's index to be updated: ");
        String index = br.readLine();
        System.out.println("Insert key to be modified: ");
        String key = br.readLine();
        System.out.println("Insert new value for the key: ");
        String value = br.readLine();

        int i = Integer.valueOf(index);
        if (employeeList.get(i).employeeData.containsKey(key)) {
            employeeList.get(i).employeeData.put(key, value);
        } else {
            System.out.println("The introduced key doesn't exist!");
        }
    }

    /**
     * This method displayes a menu with actions that can be made to employees' list
     *
     * @throws Exception if buffer reader doesn't work
     */
    public static void consoleMenu() throws Exception {
        System.out.println("***** Company Menu *****\n");
        System.out.println("1. Add New Employee");
        System.out.println("2. Update Employee information");
        System.out.println("3. Remove Employee");
        System.out.println("4. Sort Employees List");
        System.out.println("5. View Employee List");
        System.out.println("6. Filtrate Employees by key \n");
        System.out.println("7. Exit \n");
        System.out.println("Choose an action from menu:");
    }

    /**
     * This method allowes the client to choose an action from the menu
     *
     * @throws Exception
     */
    public static void chooseAnOptionFromMenu() throws Exception {
        consoleMenu();
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        String menuOption = null;
        try {
            menuOption = bufferReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (!menuOption.equals("7")) {
            switch (menuOption) {
                case "1":
                    addNewEmployee();
                    break;
                case "2":
                    updateEmployee();
                    break;
                case "3":
                    removeEmployee();
                    break;
                case "4":
                    sortAlphabeticalEmployees();
                    break;
                case "5":
                    viewEmployees();
                    break;
                case "6":
                    filterEmployees();
                    break;
                default:
                    System.out.println("Option not valid");
            }
            consoleMenu();
            menuOption = bufferReader.readLine();
        }
    }

    /**
     * This method adds to the list of employees a new employee
     *
     * @throws Exception
     */
    public static void addNewEmployee() throws Exception {
        System.out.println("Insert new employee's type:");
        String type = br.readLine();
        Employee newEmployee = getNewEmployeeDataByType(type);
        employeeList.add(newEmployee);
    }

    /**
     * This method creates a new employee by type
     *
     * @param type - type of the new employee
     * @return - the new employee
     * @throws IOException - if buffer reader doesn't work
     */
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
            case "pm":
                employee = new PmEmployee();
                break;
            default:
                hasEmployeeBeenInitialized = false;
                System.out.println("Invalid type!");
        }
        if (hasEmployeeBeenInitialized) {
            employee.employeeData.put("TYPE", type);
            for (int i = 0; i < employee.specificAtributes.size(); i++) {
                if (!employee.specificAtributes.get(i).equals("TYPE")) {
                    System.out.println(employee.specificAtributes.get(i) + ": ");
                    currentInfo = br.readLine();
                    employee.employeeData.put(employee.specificAtributes.get(i), currentInfo);
                }
            }
        }
        return employee;
    }

    /**
     * This method filter all employees and display the employees that for a specific key have a specific value
     *
     * @throws IOException if buffer reader doesn't work
     */
    public static void filterEmployees() throws IOException {
        viewEmployees();

        System.out.println("Insert key to filter by: ");
        String key = br.readLine();
        System.out.println("Insert value for the key: ");
        String value = br.readLine();

        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).employeeData.get(key).equals(value)) {
                System.out.println(employeeList.get(i).toString());
            }
        }
    }

    public static void getEmployeesInJSONFormat() throws JSONException {
        JSONObject companyData = new JSONObject();
        JSONArray companyEmployees = new JSONArray();
        JSONObject employee;
        String key;

        for (int i = 0; i < employeeList.size(); i++) {
            employee = new JSONObject();
            for (int j = 0; j < employeeList.get(i).specificAtributes.size(); j++) {
                key = employeeList.get(i).specificAtributes.get(j);
                employee.put(key, employeeList.get(i).employeeData.get(key));
            }
            companyEmployees.add(employee);
        }
        companyData.put("bla bla", companyEmployees);

        System.out.println(companyData.toString());
    }

    public static void main(String[] args) throws Exception {
        chooseAnOptionFromMenu();
        getEmployeesInJSONFormat();
    }
}
