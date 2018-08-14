package com.example.alinagavrila.employees_administration;

public abstract class Employee {
    public String[] name;
    public String[] CNP;
    public int age;
    public enum Gender { F, M };
    public Gender gender;

    public Employee (String[] name, String[] CNP, int age, Gender gender){
        this.name = name;
        this.CNP = CNP;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String[] name){
        this.name=name;
    }
    public String[] getName(){
        return name;
    }
    public void setCNP(String[] CNP){
        this.CNP=CNP;
    }
    public String[] getCNP(){
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

    public abstract void addNewEmployee();
    public abstract void viewEmployees();
    public abstract void sortEmployees();
    public abstract void updateEmployee();
}
