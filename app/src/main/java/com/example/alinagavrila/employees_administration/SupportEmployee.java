package com.example.alinagavrila.employees_administration;

public class SupportEmployee extends Employee {
    private boolean installOperatingSystem;
    private boolean networkSupport;
    private boolean hardwareSupport;
    private String type = "Support";

    public SupportEmployee(){
        super();
        this.installOperatingSystem = false;
        this.networkSupport = false;
        this.hardwareSupport = false;
    }

    public SupportEmployee(String name, String CNP, int age,Gender gender, boolean installOperatingSystem, boolean networkSupport, boolean hardwareSupport) {
        super(name, CNP, age, gender);
        this.installOperatingSystem = installOperatingSystem;
        this.networkSupport = networkSupport;
        this.hardwareSupport = hardwareSupport;
    }

    public void setInstallOperatingSystem(boolean installOperatingSystem){
        this.installOperatingSystem = installOperatingSystem;
    }
    public boolean getInstallOperatingSystem(){
        return installOperatingSystem;
    }
    public void setNetworkSupport(boolean networkSupport){
        this.networkSupport = networkSupport;
    }
    public boolean getNetworkSupport(){
        return networkSupport;
    }
    public void setHardwareSupport(boolean hardwareSupport){
        this.hardwareSupport = hardwareSupport;
    }
    public boolean getHardwareSupport(){
        return hardwareSupport;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString() + "\n");
        stringBuilder.append("Install Operating System=" + getInstallOperatingSystem() + "\n");
        stringBuilder.append("Network Support=" + getNetworkSupport() + "\n");
        stringBuilder.append("Hardware Support=" + getHardwareSupport() + "\n");
        return stringBuilder.toString();
    }
}
