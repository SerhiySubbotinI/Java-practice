package ua.javaPractice.task2;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    static List<User> users = new ArrayList<>();

    public UserList() {
        users.add(0, new User(1, "Jack", "More", 5.0));
        users.add(1, new User(2, "Mickael", "Black", 3.0));
        users.add(2, new User(3, "Serhiy", "Subbotin", 7.0));
    }

    public void printUser() {
        for (User u : users) {
            System.out.println(u);
        }
    }

    @Override
    public String toString() {
        return "UserList{" +
                "users=" + users +
                '}';
    }
}
