package com.msita.controller;
import java.util.List;

public class StudentForm  {
    private String name;
    private float score;
    private String majors;
    public StudentForm (final String name, final float score, final String majors){
        this.name = name;
        this.score = score;
        this.majors = majors;
    }
    public String getName() {
        return name;
    }
    public void setName(final String name) {
        this.name = name;
    }
    public float getScore() {
        return score;
    }
    public void setScore(final float score) {
        this.score = score;
    }
    public String getMajors() {
        return majors;
    }
    public void setMajors(final String major) {
        this.majors = majors;
    }
}

