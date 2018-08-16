package com.example.alinagavrila.employees_administration;

public class AdministrativeEmployee extends Employee {
    private boolean approvesLeave;
    private boolean isCalculatingTheSalaries;

    public AdministrativeEmployee(String[] name, String[] CNP, int age,Gender gender, boolean approvesLeave, boolean isCalculatingTheSalaries) {
        super(name, CNP, age, gender);
        this.approvesLeave = approvesLeave;
        this.isCalculatingTheSalaries = isCalculatingTheSalaries;
    }

    public void setApprovesLeave(boolean approvesLeave){
        this.approvesLeave=approvesLeave;
    }
    public boolean getApprovesLeave(){
        return approvesLeave;
    }
    public void setIsCalculatingSalaries(boolean isCalculatingTheSalaries){
        this.isCalculatingTheSalaries=isCalculatingTheSalaries;
    }
    public boolean getIsCalculatingSalaries(){
        return isCalculatingTheSalaries;
    }
}
