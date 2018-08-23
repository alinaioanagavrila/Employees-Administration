package com.example.alinagavrila.employees_administration;

import com.example.alinagavrila.employees_administration.constants.Enums.Gender;

public class PmEmployee extends Employee {

    public PmEmployee(){
        super();
        this.specificAtributes.add("NumberOfEmployees");
    }

    public PmEmployee(String name, String CNP, Gender gender, String type, int numberOfEmplyees) {
        super(name, CNP, gender, type);
        this.specificAtributes.add("NumberOfEmployees");
        employeeData.put("NumberOfEmployees", String.valueOf(numberOfEmplyees));
    }

    /**
     * This method is used for displaying Project Manager's Details in a more readeable way
     *
     * @return Project Manager's Details as a string
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString() + "\n");
        stringBuilder.append("Number of employees = " + employeeData.get("NumberOfEmployees") + "\n");
        return stringBuilder.toString();
    }
}
