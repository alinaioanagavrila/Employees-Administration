package com.example.alinagavrila.employees_administration;

import com.example.alinagavrila.employees_administration.constants.Enums.Gender;
import com.example.alinagavrila.employees_administration.constants.Enums.Platform;

public class QaEmployee extends Employee {

    public QaEmployee (String name, String CNP, Gender gender, String type, boolean hasIstqb, Platform platform, boolean isManual) {
        super(name, CNP, gender, type);
        employeeData.put("HasISTQB", String.valueOf(hasIstqb));
        employeeData.put("PLATFORM", platform.toString());
        employeeData.put("IsManual", String.valueOf(isManual));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString() + "\n");
        stringBuilder.append("Has Istqb=" + employeeData.get("HasISTQB") + "\n");
        stringBuilder.append("Is Manual=" + employeeData.get("PLATFORM") + "\n");
        stringBuilder.append("Platform=" + employeeData.get("IsManual") + "\n");
        return stringBuilder.toString();
    }
}
