package com.example.alinagavrila.employees_administration;

import com.example.alinagavrila.employees_administration.constants.Enums.Gender;

public class QaEmployee extends Employee {

    public QaEmployee(){
        super();
        this.specificAtributes.add("HasISTQB (True, False)");
        this.specificAtributes.add("PLATFORM (Web, Mobile, Desktop)");
        this.specificAtributes.add("IsManual (True, False)");
    }

    public QaEmployee (String name, String CNP, Gender gender, String type, boolean hasIstqb, String platform, boolean isManual) {
        super(name, CNP, gender, type);
        this.specificAtributes.add("HasISTQB (True, False)");
        this.specificAtributes.add("PLATFORM (Web, Mobile, Desktop)");
        this.specificAtributes.add("IsManual (True, False)");
        employeeData.put("HasISTQB (True, False)", String.valueOf(hasIstqb));
        employeeData.put("PLATFORM (Web, Mobile, Desktop)", platform);
        employeeData.put("IsManual (True, False)", String.valueOf(isManual));
    }

    /**
     * This method is used for displaying QA Employee's Details in a more readeable way
     *
     * @return QA Employee's Details as a string
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString() + "\n");
        stringBuilder.append("Has Istqb = " + employeeData.get("HasISTQB (True, False)") + "\n");
        stringBuilder.append("Is Manual = " + employeeData.get("IsManual (True, False)") + "\n");
        stringBuilder.append("Platform = " + employeeData.get("PLATFORM (Web, Mobile, Desktop)") + "\n");
        return stringBuilder.toString();
    }
}
