package com.homework04.entity;
import com.homework04.entity.Commodity;

public class Order {
    private String order_User;
    private Commodity [] order_Commodity = new Commodity[6];

    public Order (String user, Commodity... order_Commodity) {
        order_User = user;
        System.arraycopy(order_Commodity, 0, this.order_Commodity, 0, 6);
    }

    public void setOrder_User(String user) {
        order_User = user;
    }

    public String getOrder_User() {
        return order_User;
    }

    public Commodity[] getOrder_Commodity() {
        return order_Commodity;
    }

    public void setOrder_Commodity(Commodity... order_Commodity) {
        System.arraycopy(order_Commodity, 0, this.order_Commodity, 0, 6);
    }
}

