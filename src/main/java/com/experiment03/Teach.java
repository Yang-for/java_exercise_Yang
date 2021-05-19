package com.experiment03;
import java.util.Scanner;

public class Teach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputSubject = input.nextLine();
        String [] arraySubject = inputSubject.split(" ");

        Teacher teacher1 = new Teacher(arraySubject[0]);
        Teacher teacher2 = new Teacher(arraySubject[1]);

        TeachingRace(teacher1);
        teacher1.getTeachingMethod().method();
        TeachingRace(teacher2);
        teacher2.getTeachingMethod().method();

    }

    public interface TeachingMethod {
        void method();
    }

    public static class Teacher {
        private String content;
        private TeachingMethod teachingMethod;

        public Teacher (String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public TeachingMethod getTeachingMethod() {
            return teachingMethod;
        }

        public void setTeachingMethod(TeachingMethod teachingMethod) {
            this.teachingMethod = teachingMethod;
        }

        public void method() {
            System.out.println("我是老师"+", I say "+content);
        }
    }

    public static void TeachingRace(Teacher t) {
        String s;
        if (t.getContent().equals("ABC")) {
            t.setTeachingMethod(new TeachingMethod() {
                @Override
                public void method() {
                    System.out.println("我是英语老师, I say "+ t.getContent());
                }
            });
        }
        else {
            t.setTeachingMethod(new TeachingMethod() {
                @Override
                public void method() {
                    System.out.println("我是数学老师, I say "+ t.getContent());
                }
            });
        }
    }
}
