package com.example.alinagavrila.employees_administration;

import java.util.ArrayList;

public class Main extends ArrayList {
    private ArrayList<Employee> employeeList = new ArrayList<Employee>();
    private int numberOfEmplyees = 0;

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
            System.out.println(employeeList.get(i));
        }
    }

    public void sortEmployees(Employee employee) {

    }

    public void updateEmployee(Employee employee) {

    }

    public static void main (String[] args){

    }
}
