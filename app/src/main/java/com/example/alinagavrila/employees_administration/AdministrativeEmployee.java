package com.example.alinagavrila.employees_administration;

public class AdministrativeEmployee extends Employee {
    private boolean approvesLeave;
    private boolean isCalculatingTheSalaries;
    private String type = "Administrative";

    public AdministrativeEmployee(){
        super();
        this.approvesLeave = false;
        this.isCalculatingTheSalaries = false;
    }

    public AdministrativeEmployee(String name, String CNP, int age,Gender gender, boolean approvesLeave, boolean isCalculatingTheSalaries) {
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
        stringBuilder.append("Approves Leave=" + getApprovesLeave() + "\n");
        stringBuilder.append("Is Calculating The Salaries=" + getIsCalculatingSalaries() + "\n");
        return stringBuilder.toString();
    }
}
