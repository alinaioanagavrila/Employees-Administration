package com.example.alinagavrila.employees_administration;

public class Employee {
    public String name;
    public String CNP;
    public int age;

    public Employee() {
        this.name = "";
        this.CNP = "";
        this.age = 0;
    }

    public enum Gender { F, M };
    public Gender gender;
    public String type;

    public Employee (String name, String CNP, int age, Gender gender){
        this.name = name;
        this.CNP = CNP;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setCNP(String CNP){
        this.CNP=CNP;
    }
    public String getCNP(){
        return CNP;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setGender(Gender gender){
        this.gender=gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("***** Employee Details *****\n");
        stringBuilder.append("Name=" + getName() + "\n");
        stringBuilder.append("CNP=" + getCNP() + "\n");
        stringBuilder.append("Age=" + getAge() + "\n");
        stringBuilder.append("Gender=" + getGender() + "\n");
        return stringBuilder.toString();
    }
}

