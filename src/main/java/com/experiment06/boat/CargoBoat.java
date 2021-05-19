package com.experiment06.boat;

public class CargoBoat {
    int realWeight;
    int maxWeight;
    public void setMaxWeight(int w) {
        maxWeight = w;
    }

    public void load(int m) throws DangerException {
        realWeight += m;
        if(realWeight>maxWeight) {
            throw new DangerException();
        }
        System.out.println("目前装载了"+realWeight+"吨货物");
    }
}