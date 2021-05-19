package com.experiment06.boat;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        CargoBoat boat = new CargoBoat();
        Scanner input = new Scanner(System.in);
        boat.setMaxWeight(1000);
        int m = 0;
        try{
            while(true) {
                m = input.nextInt();
                boat.load(m);
            }
        } catch (DangerException e) {
            System.out.println(e.warnMess());
            System.out.println("无法再装载重量是"+m+"吨的集装箱");
        } finally {
            System.out.println("货船见将正点启航");
        }
    }
}
