package com.example.alinagavrila.employees_administration;

public class TlQaEmployee extends QaEmployee {
    private int numberOfTeamMembers;
    private String type = "TlQa";

    public TlQaEmployee(){
        super();
        this.numberOfTeamMembers = 0;
    }

    public TlQaEmployee(String name, String CNP, int age, Gender gender, boolean hasIstqb, Platform platform, boolean isManual) {
        super(name, CNP, age, gender, hasIstqb, platform, isManual);
    }

    public void setNumberOfTeamMembers(int numberOfTeamMembers) {
        this.numberOfTeamMembers = numberOfTeamMembers;
    }

    public int getNumberOfTeamMembers() {
        return numberOfTeamMembers;
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
        stringBuilder.append("Number of Team Members=" + getNumberOfTeamMembers() + "\n");
        return stringBuilder.toString();
    }
}
