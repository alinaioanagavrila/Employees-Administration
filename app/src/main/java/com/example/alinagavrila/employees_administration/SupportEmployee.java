package com.example.alinagavrila.employees_administration;

import com.example.alinagavrila.employees_administration.constants.Enums.Gender;

public class SupportEmployee extends Employee {

    public SupportEmployee(){
        super();
        this.specificAtributes.add("InstallOperatingSystem (True, False)");
        this.specificAtributes.add("NetworkSupport (True, False)");
        this.specificAtributes.add("HardwareSupport (True, False)");
    }

    public SupportEmployee(String name, String CNP, Gender gender, String type, boolean installOperatingSystem, boolean networkSupport, boolean hardwareSupport) {
        super(name, CNP, gender, type);
        this.specificAtributes.add("InstallOperatingSystem (True, False)");
        this.specificAtributes.add("NetworkSupport (True, False)");
        this.specificAtributes.add("HardwareSupport (True, False)");
        employeeData.put("InstallOperatingSystem (True, False)",String.valueOf(installOperatingSystem));
        employeeData.put("NetworkSupport (True, False)",String.valueOf(networkSupport));
        employeeData.put("HardwareSupport (True, False)",String.valueOf(hardwareSupport));
    }

    /**
     * This method is used for displaying Support Employee's Details in a more readeable way
     *
     * @return Support Employee's Details as a string
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString() + "\n");
        stringBuilder.append("Install Operating System = " + employeeData.get("InstallOperatingSystem (True, False)") + "\n");
        stringBuilder.append("Network Support = " + employeeData.get("NetworkSupport (True, False)") + "\n");
        stringBuilder.append("Hardware Support = " + employeeData.get("HardwareSupport (True, False)") + "\n");
        return stringBuilder.toString();
    }
}
