package com.example.alinagavrila.employees_administration;

import com.example.alinagavrila.employees_administration.constants.Enums.Gender;
import java.util.HashMap;

public class Employee {
    public HashMap<String, String> employeeData;

    public Employee(String name, String CNP, Gender gender, String type) {
        employeeData = new HashMap<>();
        employeeData.put("CNP", CNP);
        employeeData.put("NAME", name);
        employeeData.put("GENDER", gender.toString());
        employeeData.put("TYPE", type);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("***** Employee Details *****\n");
        stringBuilder.append("Name=" + employeeData.get("NAME") + "\n");
        stringBuilder.append("CNP=" + employeeData.get("CNP") + "\n");
        stringBuilder.append("Gender=" + employeeData.get("GENDER") + "\n");
        return stringBuilder.toString();
    }
}

