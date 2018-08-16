package com.example.alinagavrila.employees_administration;

public class SupportEmployee extends Employee {
    private boolean installOperatingSystem;
    private boolean networkSupport;
    private boolean hardwareSupport;

    private SupportEmployee(String[] name, String[] CNP, int age,Gender gender, boolean installOperatingSystem, boolean networkSupport, boolean hardwareSupport) {
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
}
