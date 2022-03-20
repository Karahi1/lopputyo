package com.spring.loppuprojekti.data;

public class Student {
    private String name;
    private String classNumber;
    private int uid;

    private static int count = 0;

    public Student( String name, String classNumber ){
        this.name = name;
        this.classNumber = classNumber;
        this.uid = count++;
    }

    public Student() {
        this("", "");

    }

    public String getName() {
        return name;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public int getUid() {
        return uid;
    }
}
