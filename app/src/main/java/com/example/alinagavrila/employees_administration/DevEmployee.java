package com.example.alinagavrila.employees_administration;

import com.example.alinagavrila.employees_administration.constants.Enums.ProgrammingLanguage;
import com.example.alinagavrila.employees_administration.constants.Enums.Gender;

public class DevEmployee extends Employee {

    public  DevEmployee(String name, String CNP, Gender gender, String type, ProgrammingLanguage programmingLanguage) {
        super(name, CNP, gender, type);
        employeeData.put("ProgrammingLanguage",programmingLanguage.toString());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString() + "\n");
        stringBuilder.append("ProgrammingLanguage=" + employeeData.get("ProgrammingLanguage") + "\n");
        return stringBuilder.toString();
    }
}
