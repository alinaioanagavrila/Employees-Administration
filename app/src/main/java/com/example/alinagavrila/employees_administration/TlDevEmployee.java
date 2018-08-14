package com.example.alinagavrila.employees_administration;

public class TlDevEmployee extends DevEmployee {
    private int numberOfTeamMembers;

    public TlDevEmployee(String[] name, String[] CNP, int age,Gender gender, ProgrammingLanguage programmingLanguage) {
        super(name, CNP, age, gender, programmingLanguage);
    }

    public void setNumberOfTeamMembers(int numberOfTeamMembers) {
        this.numberOfTeamMembers = numberOfTeamMembers;
    }

    public int getNumberOfTeamMembers() {
        return numberOfTeamMembers;
    }
}
