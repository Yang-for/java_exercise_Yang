package com.homework03.entity;

public class Course {
    private String courseName;
    private int courseNumber;
    private boolean isCompulsory;

    public Course(String name, int number, boolean isCompulsory) {
        this.courseName = name;
        this.courseNumber = number;
        this.isCompulsory = isCompulsory;
    }

    public void setCourseName(String name) {
        this.courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseNumber(int number) {
        this.courseNumber = number;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCompulsory(boolean isCompulsory) {
        this.isCompulsory = isCompulsory;
    }

    public boolean isCompulsory() {
        return isCompulsory;
    }
}
