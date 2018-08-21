package com.example.alinagavrila.employees_administration;

import com.example.alinagavrila.employees_administration.constants.Enums.Gender;
import com.example.alinagavrila.employees_administration.constants.Enums.ProgrammingLanguage;

public class TlDevEmployee extends DevEmployee {

    public TlDevEmployee(String name, String CNP, Gender gender, String type, ProgrammingLanguage programmingLanguage, int numberOfTeamMembers) {
        super(name, CNP, gender, type, programmingLanguage);
        employeeData.put("NumberOfTeamMembers", String.valueOf(numberOfTeamMembers));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString() + "\n");
        stringBuilder.append("Number of Team Members=" + employeeData.get("NumberOfTeamMembers") + "\n");
        return stringBuilder.toString();
    }
}
