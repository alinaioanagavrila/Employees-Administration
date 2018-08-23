package com.example.alinagavrila.employees_administration;

import com.example.alinagavrila.employees_administration.constants.Enums.Gender;

public class TlQaEmployee extends QaEmployee {

    public TlQaEmployee(){
        super();
        this.specificAtributes.add("NumberOfTeamMembers");
    }

    public TlQaEmployee(String name, String CNP, Gender gender, String type, boolean hasIstqb, String platform, boolean isManual, int numberOfTeamMembers) {
        super(name, CNP, gender, type, hasIstqb, platform, isManual);
        this.specificAtributes.add("NumberOfTeamMembers");
        employeeData.put("NumberOfTeamMembers", String.valueOf(numberOfTeamMembers));
    }

    /**
     * This method is used for displaying QA Team Leader's Details in a more readeable way
     *
     * @return QA Team Leader's Details as a string
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString() + "\n");
        stringBuilder.append("Number of Team Members = " + employeeData.get("NumberOfTeamMembers") + "\n");
        return stringBuilder.toString();
    }
}
