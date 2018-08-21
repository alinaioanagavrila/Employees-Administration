package com.example.alinagavrila.employees_administration;

import com.example.alinagavrila.employees_administration.constants.Enums.Gender;
import com.example.alinagavrila.employees_administration.constants.Enums.Platform;

public class TlQaEmployee extends QaEmployee {

    public TlQaEmployee(String name, String CNP, Gender gender, String type, boolean hasIstqb, Platform platform, boolean isManual, int numberOfTeamMembers) {
        super(name, CNP, gender, type, hasIstqb, platform, isManual);
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
