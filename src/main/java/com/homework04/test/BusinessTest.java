package com.homework04.test;

import com.homework04.entity.*;
public class BusinessTest {
    public static void main(String[] args) {
        User user = new User("Yang", 99);
        Commodity instantNoodles = new Commodity("instantNoodles", 5.5);
        Commodity hamSausage = new Commodity("hamSausage", 2.2);

        Order order = new Order("Yang", instantNoodles,instantNoodles,
                hamSausage,hamSausage,hamSausage,hamSausage);

        calculate_balance(user, order);

        System.out.println(user.getUser_Balance());
    }

    public static void calculate_balance(User user, Order order) {
        double userBalance = user.getUser_Balance();
        for(Commodity i : order.getOrder_Commodity()) {
            userBalance -= i.getCommodity_Price();
        }
        user.setUser_Balance(userBalance);
    }
}
