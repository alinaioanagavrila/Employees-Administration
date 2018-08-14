package com.example.alinagavrila.employees_administration;

public class TlQaEmployee extends QaEmployee {
    private int numberOfTeamMembers;

    public TlQaEmployee(String[] name, String[] CNP, int age, Gender gender, boolean hasIstqb, Platform platform, boolean isManual) {
        super(name, CNP, age, gender, hasIstqb, platform, isManual);
    }

    public void setNumberOfTeamMembers(int numberOfTeamMembers) {
        this.numberOfTeamMembers = numberOfTeamMembers;
    }

    public int getNumberOfTeamMembers() {
        return numberOfTeamMembers;
    }
}
