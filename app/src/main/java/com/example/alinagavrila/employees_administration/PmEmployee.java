package com.example.alinagavrila.employees_administration;

import com.example.alinagavrila.employees_administration.constants.Enums.Gender;

public class PmEmployee extends Employee {

    public PmEmployee(String name, String CNP, Gender gender, String type, int numberOfEmplyees) {
        super(name, CNP, gender, type);
        employeeData.put("NumberOfEmployees", String.valueOf(numberOfEmplyees));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString() + "\n");
        stringBuilder.append("Number of employees=" + employeeData.get("NumberOfEmployees") + "\n");
        return stringBuilder.toString();
    }
}
