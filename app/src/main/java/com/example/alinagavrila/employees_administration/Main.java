package com.example.alinagavrila.employees_administration;

import java.util.ArrayList;

public class Main extends ArrayList {
    private ArrayList<Employee> employeeList = new ArrayList<Employee>();
    private int numberOfEmplyees = 0;
    public enum EmployeeType {Administrative ,Dev , Pm, Qa, Support,  TlDev, TlQa};
    private EmployeeType employeeType;

    public void addNewEmployee(Employee employee) {
        employeeList.add(employee);
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
