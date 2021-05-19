package com.experiment07;

import java.util.HashSet;
import java.util.Set;

class CrossBridgeHuman implements Runnable {
    @Override
    public void run() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName()+"正在过桥");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"通过桥");
        }
    }
}
public class Bridge {
    public static void main(String[] args) {
        String[] nameStrings = {"呸骑1","呸骑2","呸骑3","呸骑4","呸骑5","呸骑6",
                "呸骑7","呸骑8","呸骑9","呸骑10"};
        Set<Integer> set = new HashSet<Integer>();
        while (set.size() < 10) {
            set.add((int)(Math.random()*10));
        }
        CrossBridgeHuman crossBridgeHuman = new CrossBridgeHuman();
        for(int i:set) {
            Thread thread = new Thread(crossBridgeHuman, nameStrings[i]);
            thread.start();
        }
    }
}
