package com.example.alinagavrila.employees_administration;

public class DevEmployee extends Employee {
    public enum ProgrammingLanguage {Java, CSharp, CPlusPlus, C, Python, Javascript, DotNet, Ruby};
    private ProgrammingLanguage programmingLanguage;
    private String type = "Dev";

    public DevEmployee(){
        super();
    }

    public  DevEmployee(String name, String CNP, int age, Gender gender, ProgrammingLanguage programmingLanguage) {
        super(name, CNP, age, gender);
        this.programmingLanguage = programmingLanguage;
    }

    public void setProgrammingLanguage(ProgrammingLanguage programmingLanguage){
        this.programmingLanguage = programmingLanguage;
    }

    public ProgrammingLanguage getProgrammingLanguage() {
        return programmingLanguage;
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
        stringBuilder.append("ProgrammingLanguage=" + getProgrammingLanguage() + "\n");
        return stringBuilder.toString();
    }
}
