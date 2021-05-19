package com.homework03.test;

import com.homework03.entity.Course;
public class CourseTest {
    public static void main(String[] args) {
        testNewStudent();
    }

    public static void testNewStudent() {
        Course course = new Course("Java程序设计", 2018001, true);
        System.out.println(course.getCourseName());
        System.out.println(course.getCourseNumber());
        System.out.println(course.isCompulsory());

        course.setCourseName("Web开发技术");
        course.setCompulsory(false);

        System.out.println(course.getCourseName());
        System.out.println(course.getCourseNumber());
        System.out.println(course.isCompulsory());
    }
}
