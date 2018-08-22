package com.example.alinagavrila.employees_administration;

import com.example.alinagavrila.employees_administration.constants.Enums.Gender;

public class AdministrativeEmployee extends Employee {

    public AdministrativeEmployee() {
        super();
        this.specificAtributes.add("ApprovesLeave");
        this.specificAtributes.add("IsCalculatingTheSalaries");
    }

    public AdministrativeEmployee(String name, String CNP, Gender gender, String type, boolean approvesLeave, boolean isCalculatingTheSalaries) {
        super(name, CNP, gender, type);
        this.specificAtributes.add("ApprovesLeave");
        this.specificAtributes.add("IsCalculatingTheSalaries");
        employeeData.put("ApprovesLeave", String.valueOf(approvesLeave));
        employeeData.put("IsCalculatingTheSalaries", String.valueOf(isCalculatingTheSalaries));
    }

    /**
     * This method is used for displaying Administrative Employee's Details in a more readeable way
     *
     * @return Administrative Employee's Details as a string
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString() + "\n");
        stringBuilder.append("Approves Leave = " + employeeData.get("ApprovesLeave") + "\n");
        stringBuilder.append("Is Calculating The Salaries = " + employeeData.get("IsCalculatingTheSalaries") + "\n");
        return stringBuilder.toString();
    }
}
