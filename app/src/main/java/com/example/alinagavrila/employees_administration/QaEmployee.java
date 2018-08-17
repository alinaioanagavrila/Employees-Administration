package com.example.alinagavrila.employees_administration;

public class QaEmployee extends Employee {
    private boolean hasIstqb;
    private boolean isManual;
    public enum Platform {Mobile, Web, Desktop};
    private Platform platform;
    private String type = "Qa";

    public QaEmployee (String[] name, String[] CNP, int age,Gender gender, boolean hasIstqb, Platform platform, boolean isManual){
        super(name, CNP, age, gender);
        this.hasIstqb = hasIstqb;
        this.platform = platform;
        this.isManual = isManual;
    }

    public void setHasIstqb(boolean hasIstqb) {
        this.hasIstqb = hasIstqb;
    }

    public boolean getHasIstqb() {
        return hasIstqb;
    }

    public void setIsManual(boolean isManual){
        this.isManual = isManual;
    }

    public boolean getIsManual() {
        return isManual;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public Platform getPlatform() {
        return platform;
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
        stringBuilder.append("Has Istqb=" + getHasIstqb() + "\n");
        stringBuilder.append("Is Manual=" + getIsManual() + "\n");
        stringBuilder.append("Platform=" + getPlatform() + "\n");
        return stringBuilder.toString();
    }
}
