package com.experiment03;

import java.util.Scanner;

public class Job {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputEmployee1 = input.nextLine();
        String [] arrayEmployee1 = inputEmployee1.split(" ");
        double value1 = Double.parseDouble(arrayEmployee1[2]);

        BasicEmployee employee1 = new BasicEmployee(arrayEmployee1[0], arrayEmployee1[1]
        , value1);

        String inputEmployee2 = input.nextLine();
        String [] arrayEmployee2 = inputEmployee2.split(" ");
        double value2 = Double.parseDouble(arrayEmployee2[2]);
        double value3 = Double.parseDouble(arrayEmployee2[3]);

        GoodEmployee employee2 = new GoodEmployee(arrayEmployee2[0], arrayEmployee2[1],
                value2, value3);

        employee1.showSalary();
        employee1.showBonus();
        employee2.showSalary();
        employee2.showBonus();
    }

    public abstract static class Employer {
        private String name;
        private String department;
        private double salary;

        public Employer(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public void showSalary() {
            System.out.println("我叫"+name+",在"+department+"部门"+",我的工资是"+salary);
        }

        public abstract void showBonus();
    }

    public static class BasicEmployee extends Employer {
        public BasicEmployee(String name, String departname, double salary) {
            super(name,departname, salary);
        }

        public void showBonus() {
            System.out.println("我是普通部员，没有奖金，加油升级！");
        }
    }

    public static class GoodEmployee extends Employer {
        private double bonus;
        public GoodEmployee(String name, String departname, double salary, double bonus) {
            super(name, departname, bonus);
            this.bonus = bonus;
        }

        public void showBonus() {
            System.out.println("我是优秀员工，我的奖金是"+bonus);
        }
    }
}
