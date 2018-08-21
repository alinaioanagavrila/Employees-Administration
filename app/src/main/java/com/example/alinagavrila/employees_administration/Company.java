package com.example.alinagavrila.employees_administration;

import com.example.alinagavrila.employees_administration.constants.Enums.Platform;
import com.example.alinagavrila.employees_administration.constants.Enums.ProgrammingLanguage;
import com.example.alinagavrila.employees_administration.constants.Enums.Gender;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.xml.namespace.NamespaceContext;

public class Company {
    private static List<Employee> employeeList = new ArrayList<>();

    public static Employee newEmployee() throws IOException {
        Employee employee = null;
        Gender gender;
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        String type = null;
        System.out.print("New employee type: ");
        try {
            type = bufferReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("\nName:");
        String name = bufferReader.readLine();
        System.out.println("\nCNP:");
        String CNP = bufferReader.readLine();
        System.out.println("\nGender:");
        String gen = bufferReader.readLine();
        if(gen.equals("F")) {
            gender = Gender.F;
        }else {
            gender = Gender.M;
        }

        switch(type) {
            case "Administrative":
                System.out.print("\nApproves Leave: ");
                boolean approveLeaves = Boolean.parseBoolean(bufferReader.readLine());
                System.out.print("\nIs Calculating The Salaries: ");
                boolean isCalculatingTheSalaries = Boolean.parseBoolean(bufferReader.readLine());
                employee = new AdministrativeEmployee(name, CNP, gender, type, approveLeaves, isCalculatingTheSalaries);
                break;
            case "Dev":
            case "TlDev":
                System.out.print("\nProgramming Language: ");
                ProgrammingLanguage programmingLanguage = null;
                String progLanguage = bufferReader.readLine();
                switch (progLanguage) {
                    case "Java":
                        programmingLanguage = ProgrammingLanguage.Java;
                        break;
                    case "CSharp":
                        programmingLanguage = ProgrammingLanguage.CSharp;
                        break;
                    case "C":
                        programmingLanguage = ProgrammingLanguage.C;
                        break;
                    case "Javascript":
                        programmingLanguage = ProgrammingLanguage.Javascript;
                        break;
                    case "Python":
                        programmingLanguage = ProgrammingLanguage.Python;
                        break;
                    case "DotNet":
                        programmingLanguage = ProgrammingLanguage.DotNet;
                        break;
                    case "Ruby":
                        programmingLanguage = ProgrammingLanguage.Ruby;
                        break;
                    default:
                        System.out.println("Not a valid programming language");
                }

                if (type.equals("Dev")) {
                    employee = new DevEmployee(name, CNP, gender, type, programmingLanguage);
                } else {
                    System.out.print("\nNumber Of Team Members: ");
                    int numberOfTeamMembers = Integer.valueOf(bufferReader.readLine());
                    employee = new TlDevEmployee(name, CNP, gender, type, programmingLanguage, numberOfTeamMembers);
                }
                break;
            case "Qa":
            case "TlQa":
                System.out.print("\nHas ISTQB: ");
                boolean hasIstqb = Boolean.parseBoolean(bufferReader.readLine());
                System.out.print("\nIs Manual: ");
                boolean isManual = Boolean.parseBoolean(bufferReader.readLine());
                System.out.print("\nPlatfrom");
                String plat = bufferReader.readLine();
                Platform platform = null;
                switch (plat) {
                    case "web":
                        platform = Platform.Web;
                        break;
                    case "Desktop":
                        platform = Platform.Desktop;
                        break;
                    case "Mobile":
                        platform = Platform.Mobile;
                        break;
                    default:
                        System.out.println("Not a valid platform");
                }
                if (type.equals("Qa")) {
                    employee = new QaEmployee(name, CNP, gender, type, hasIstqb, platform, isManual);
                } else {
                    System.out.print("\nNumber Of Team Members: ");
                    int numberOfTeamMembers = Integer.valueOf(bufferReader.readLine());
                    employee = new TlQaEmployee(name, CNP, gender, type, hasIstqb, platform, isManual, numberOfTeamMembers);
                }
                break;
            case "Support":
                System.out.print("\nInstall Operating System: ");
                boolean installOperatingSystem = Boolean.parseBoolean(bufferReader.readLine());
                System.out.print("\nNetwork Support: ");
                boolean networkSupport = Boolean.parseBoolean(bufferReader.readLine());
                System.out.print("\nHardware Support: ");
                boolean hardwareSupport = Boolean.parseBoolean(bufferReader.readLine());
                employee = new SupportEmployee(name, CNP, gender, type, installOperatingSystem, networkSupport, hardwareSupport);
                break;
            case "Pm":
                System.out.print("\nNumber Of employees: ");
                int numberOfEmployees = Integer.valueOf(bufferReader.readLine());
                employee = new PmEmployee(name, CNP, gender, type, numberOfEmployees);
                break;
            default:
                System.out.println("Not a valid type of employee");
        }
        return employee;
    }

    public static void addNewEmployee(Employee employee) throws IOException {
        employeeList.add(newEmployee());
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

    public static void consoleMenu(Employee employee) throws IOException {
        System.out.println("***** Company Menu *****\n\n");
        System.out.println("1. Add New Employee \n");
        System.out.println("2. Update Employee information \n");
        System.out.println("3. Remove Employee \n");
        System.out.println("4. Sort Employees List \n");
        System.out.println("5. View Employee List \n");
        System.out.println("6. Exit \n\n");
        System.out.println("Choose an action from menu:");
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        String menuOption = null;
        try {
            menuOption = bufferReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        while(!menuOption.equals("6")) {
            switch (menuOption) {
                case "1":
                    addNewEmployee(newEmployee());
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
            System.out.println("Choose an action from menu:");
            menuOption = bufferReader.readLine();
        }
    }

    public static void main(String[] args) throws IOException {
        Employee employee = new AdministrativeEmployee("Popescu Mihai", "1870315151541", Gender.M, "Administrative", true, true);
        consoleMenu(employee);
    }
}
