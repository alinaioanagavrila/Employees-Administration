package com.example.alinagavrila.employees_administration;

import com.example.alinagavrila.employees_administration.constants.Enums.Gender;

public class SupportEmployee extends Employee {

    public SupportEmployee(String name, String CNP, Gender gender, String type, boolean installOperatingSystem, boolean networkSupport, boolean hardwareSupport) {
        super(name, CNP, gender, type);
        employeeData.put("InstallOperatingSystem",String.valueOf(installOperatingSystem));
        employeeData.put("NetworkSupport",String.valueOf(networkSupport));
        employeeData.put("HardwareSupport",String.valueOf(hardwareSupport));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString() + "\n");
        stringBuilder.append("Install Operating System=" + employeeData.get("InstallOperatingSystem") + "\n");
        stringBuilder.append("Network Support=" + employeeData.get("NetworkSupport") + "\n");
        stringBuilder.append("Hardware Support=" + employeeData.get("HardwareSupport") + "\n");
        return stringBuilder.toString();
    }
}
