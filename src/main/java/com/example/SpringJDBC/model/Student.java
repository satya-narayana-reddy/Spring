package com.example.SpringJDBC.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class Student {
    private int rollno;
    private String name;

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    private int marks;
}
