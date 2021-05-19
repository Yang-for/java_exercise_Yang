package com.experiment04;

import com.experiment04.entity.Student;
import com.experiment04.resource.DatabaseUtils;
import com.experiment04.service.impl.StudentServiceImpl;

import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        StudentServiceImpl studentService = new StudentServiceImpl();
        Student student = new Student(201207, Student.Sex.MALE, "杨斌", 2012);

        studentService.addStudent(student);
        DatabaseUtils.getStudents().forEach(student1 -> System.out.println(student1.getName()));
        System.out.println(' '); // 查看添加的Name

        List<Student> listYear = studentService.listStudentsByYear(2012);
        listYear.forEach(student1 -> System.out.println(student1.getName()));
        System.out.println(' '); // 输出指定年份的List<Student>

        List<String> stringList = studentService.listStudentsNames(2012, Student.Sex.MALE);
        stringList.forEach(System.out::println);
        System.out.println(' '); // 输出指定年份和性别的List<String>

        Map<Student.Sex, List<Student>> map = studentService.mapStudentsBySex();
        for(Enum Sex: map.keySet()) {
            System.out.println(Sex);
            for(Student student1: map.get(Sex)) {
                System.out.println(student1.getName());
            }
            System.out.println(' ');
        }
        System.out.println(' '); // 输出以性别分组的Map

        System.out.println(studentService.removeStudent(201206));
        DatabaseUtils.getStudents().forEach(student1 -> System.out.println(student1.getName()));
        // 输出删除后的List<Student>
    }
}