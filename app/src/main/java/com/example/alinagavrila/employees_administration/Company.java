package com.example.alinagavrila.employees_administration;

import java.util.ArrayList;

public class Company extends ArrayList {
    private ArrayList<Employee> employeeList = new ArrayList<Employee>();
    private int numberOfEmplyees = 0;
    public enum EmployeeType {Administrative ,Dev , Pm, Qa, Support,  TlDev, TlQa};
    private EmployeeType employeeType;

    public void addNewEmployee(String type) {
        switch(type){
            case "Administrative":
                employeeList.add(new AdministrativeEmployee());
                break;
            case "Dev":
                employeeList.add(new DevEmployee());
                break;
            case "Pm":
                employeeList.add(new PmEmployee());
                break;
            case "Qa":
                employeeList.add(new QaEmployee());
                break;
            case "Support":
                employeeList.add(new SupportEmployee());
                break;
            case "TlDev":
                employeeList.add(new TlDevEmployee());
                break;
            case "TlQa":
                employeeList.add(new TlQaEmployee());
                break;
        }
        numberOfEmplyees++;
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
        numberOfEmplyees--;
    }

    public void viewEmployees() {
        for(int i=0; i<numberOfEmplyees; i++){
            employeeList.get(i).toString();
        }
    }

    public void sortEmployees(Employee employee) {

    }

    public void updateEmployee(Employee employee) {

    }

    public void main (String[] args){

    }
}
