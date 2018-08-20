package com.example.alinagavrila.employees_administration;

public class PmEmployee extends Employee {
    private int numberOfEmplyees;
    private String type = "Pm";

    public PmEmployee(){
        super();
        this.numberOfEmplyees = 0;
    }

    public PmEmployee(String name, String CNP, int age,Gender gender, int numberOfEmplyees) {
        super(name, CNP, age, gender);
        this.numberOfEmplyees = numberOfEmplyees;
    }
    public void setNumberOfEmplyees(int numberOfEmplyees){
        this.numberOfEmplyees = numberOfEmplyees;
    }
    public int getNumberOfEmplyees(){
        return numberOfEmplyees;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String show() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.show() + "\n");
        stringBuilder.append("Number of employees=" + getNumberOfEmplyees() + "\n");
        return stringBuilder.toString();
    }
}
