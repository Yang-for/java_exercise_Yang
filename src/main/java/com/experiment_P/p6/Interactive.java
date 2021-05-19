package com.experiment_P.p6;

import java.util.*;

public class Interactive {
    public static void main(String[] args) {
        User user1 = new User(1,"Yang", "Binzhou");
        User user2 = new User(2,"Han", "Beijing");
        User user3 = new User(3, "Bian", "Jinan");
        User user4 = new User(4, "Petter", "Beijing");
        User user5 = new User(5, "Bob", "Binzhou");
        User user6 = new User(6, "Luan", "Qingdao");
        User user7 = new User(7, "Ya", "Nanjing");

        Set<User> set = new HashSet<>();
        set.add(user1);
        set.add(user2);
        set.add(user3);
        set.add(user4);
        set.add(user5);
        set.add(user6);
        set.add(user7);

        toMap(set);
    }

    private static void toMap(Set<User> users) {
        Map<String, List<User>> map = new HashMap<>();

        for(User user: users) {
            if (map.containsKey(user.getCity())) {
                map.get(user.getCity()).add(user);
            }
            else {
                //Iterator<User> iUsers = users.iterator();
                List<User> userList = new ArrayList<>();
                userList.add(user);
                /**
                while (iUsers.hasNext()) {
                    User u = iUsers.next();
                    if (user.getCity().equals(u.getCity()) && !(user.getName().equals(u.getName()))) {
                        userList.add(u);
                    }
                }
                 **/
                map.put(user.getCity(), userList);
            }
        }

         for(String cityName: map.keySet()) {
            System.out.println(cityName);
            for(User user: map.get(cityName)) {
                System.out.print(user.getName()+" ");
            }
             System.out.println("\n");
        }
    }
}
