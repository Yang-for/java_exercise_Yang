package com.experiment07;

class Race implements Runnable {
    private int distance = 1000;
    private int turtlePosition = 0;
    private int rabbitPositon = 0;

    @Override
    public void run() {
        while (true) {
            if ("乌龟".equals(Thread.currentThread().getName())) {
                turtlePosition += 1;
                if (turtlePosition >= distance) {
                    System.out.println("乌龟到终点了");
                    break;
                } else {
                    System.out.println("乌龟距离终点还差" + (distance - turtlePosition) + "米");
                }
            } else {
                if ("兔子".equals(Thread.currentThread().getName())) {
                    rabbitPositon += 10;
                    if (rabbitPositon >= distance) {
                        System.out.println("兔子到终点了");
                        break;
                    } else {
                        System.out.println("兔子距离终点还差" + (distance - rabbitPositon) + "米");
                    }
                    if (rabbitPositon > turtlePosition) {
                        try {
                            System.out.println("我跑得快，睡一觉");
                            Thread.sleep(1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
public class RabbitAndTurtle {
    public static void main(String[] args) {
        Race race = new Race();
        Thread turtleThread = new Thread(race, "乌龟");
        Thread rabbitThread = new Thread(race, "兔子");
        turtleThread.start();
        rabbitThread.start();
    }

}
