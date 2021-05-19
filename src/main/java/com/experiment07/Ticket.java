package com.experiment07;

class RailwayStation implements Runnable {
    private int sum = 200;

    @Override
    public void run() {
        while (true){
            synchronized (this) {
                System.out.println(Thread.currentThread().getName()+"正在售票第"+sum+"号");
                sum--;
                if (sum <= 2) {
                    break;
                }
            }
        }
    }
}
public class Ticket {
    public static void main(String[] args) {
        RailwayStation railwayStation = new RailwayStation();
        Thread haxiThread = new Thread(railwayStation, "哈西站");
        Thread hadongThread = new Thread(railwayStation, "哈东站");
        Thread haThread = new Thread(railwayStation, "哈站");
        hadongThread.start();
        haThread.start();
        haxiThread.start();
    }
}
