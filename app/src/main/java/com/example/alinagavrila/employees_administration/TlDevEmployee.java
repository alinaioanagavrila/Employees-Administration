package com.example.alinagavrila.employees_administration;

public class TlDevEmployee extends DevEmployee {
    private int numberOfTeamMembers;
    private String type = "TlDev";

    public TlDevEmployee(String[] name, String[] CNP, int age,Gender gender, ProgrammingLanguage programmingLanguage) {
        super(name, CNP, age, gender, programmingLanguage);
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
