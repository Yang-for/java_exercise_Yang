package com.experiment04.service.impl;

import com.experiment04.entity.Student;
import com.experiment04.resource.DatabaseUtils;
import com.experiment04.service.StudentService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentServiceImpl implements StudentService {

    @Override
    public List<Student> addStudent(Student student) {
        List<Student> studentList = DatabaseUtils.getStudents();
        studentList.add(student);
        return studentList;
    }

    @Override
    public List<Student> listStudentsByYear(int year) {
        return DatabaseUtils.getStudents().stream().filter(student -> year == student.getYear())
                .collect(Collectors.toList());
    }

    @Override
    public List<String> listStudentsNames(int year, Student.Sex sex) {
        return DatabaseUtils.getStudents().stream()
                .filter(student -> year == student.getYear() && student.getSex() == sex)
                .map(Student::getName)
                .collect(Collectors.toList());
    }

    @Override
    public Map<Student.Sex, List<Student>> mapStudentsBySex() {
        return DatabaseUtils.getStudents().stream().collect(Collectors
                .groupingBy(Student::getSex));
    }

    @Override
    public boolean removeStudent(int id) {
        long numStudent_1 = DatabaseUtils.getStudents().size();
        DatabaseUtils.getStudents().removeIf(student -> student.getId() == id);
        long numStudent_2 = DatabaseUtils.getStudents().size();
        return numStudent_2 != numStudent_1;
    }
}

