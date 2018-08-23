package com.example.alinagavrila.employees_administration;

import com.example.alinagavrila.employees_administration.constants.Enums.Gender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Employee {
    public HashMap<String, String> employeeData;
    public List<String> specificAtributes;

    public Employee() {
        employeeData = new HashMap<>();
        specificAtributes = new ArrayList<>();
        specificAtributes.add("CNP");
        specificAtributes.add("NAME");
        specificAtributes.add("GENDER(F = female, M = male)");
        specificAtributes.add("TYPE");
    }

    /**
     * Employee's constructor
     *
     * @param name - employee's name
     * @param CNP - employee's CNP
     * @param gender - employee's gender (Feminin or Masculin)
     * @param type - employee's type (Administrative, Dev, Qa, Support, TlDev, TlQa, Pm)
     */
    public Employee(String name, String CNP, Gender gender, String type) {
        this();

        employeeData.put("CNP", CNP);
        employeeData.put("NAME", name);
        employeeData.put("GENDER(F = female, M = male)", gender.toString());
        employeeData.put("TYPE", type);
    }

    /**
     * This method is used for displaying Employee's Details in a more readeable way
     *
     * @return Employee's Details as a string
     */
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("***** Employee Details *****\n");
        stringBuilder.append("Name = " + employeeData.get("NAME") + "\n");
        stringBuilder.append("CNP = " + employeeData.get("CNP") + "\n");
        stringBuilder.append("Gender(F = female, M = male) = " + employeeData.get("GENDER(F = female, M = male)") + "\n");
        stringBuilder.append("Type = " + employeeData.get("TYPE"));
        return stringBuilder.toString();
    }
}

