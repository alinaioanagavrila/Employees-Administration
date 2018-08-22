package com.example.alinagavrila.employees_administration;

import com.example.alinagavrila.employees_administration.constants.Enums.Gender;

public class DevEmployee extends Employee {

    public DevEmployee(){
        super();
        this.specificAtributes.add("ProgrammingLanguage");
    }

    public  DevEmployee(String name, String CNP, Gender gender, String type, String programmingLanguage) {
        super(name, CNP, gender, type);
        this.specificAtributes.add("ProgrammingLanguage");
        employeeData.put("ProgrammingLanguage",programmingLanguage);
    }

    /**
     * This method is used for displaying Development Employee's Details in a more readeable way
     *
     * @return Development Employee's Details as a string
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString() + "\n");
        stringBuilder.append("ProgrammingLanguage = " + employeeData.get("ProgrammingLanguage") + "\n");
        return stringBuilder.toString();
    }
}
