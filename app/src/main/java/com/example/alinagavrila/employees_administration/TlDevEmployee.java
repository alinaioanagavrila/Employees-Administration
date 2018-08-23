package com.example.alinagavrila.employees_administration;

import com.example.alinagavrila.employees_administration.constants.Enums.Gender;

public class TlDevEmployee extends DevEmployee {

    public TlDevEmployee(){
        super();
        this.specificAtributes.add("NumberOfTeamMembers");
    }

    public TlDevEmployee(String name, String CNP, Gender gender, String type, String programmingLanguage, int numberOfTeamMembers) {
        super(name, CNP, gender, type, programmingLanguage);
        this.specificAtributes.add("NumberOfTeamMembers");
        employeeData.put("NumberOfTeamMembers", String.valueOf(numberOfTeamMembers));
    }

    /**
     * This method is used for displaying Development Team Leader's Details in a more readeable way
     *
     * @return Development Team Leader's Details as a string
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString() + "\n");
        stringBuilder.append("Number of Team Members = " + employeeData.get("NumberOfTeamMembers") + "\n");
        return stringBuilder.toString();
    }
}
