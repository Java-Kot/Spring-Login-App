package com.practice.controller.service;

import com.practice.controller.model.Login;
import com.practice.controller.model.Users;

import java.util.ArrayList;
import java.util.List;

public class UserInfo {
    private static List<Users> users;

    static {
        users = new ArrayList<>();

        Users users1 = new Users();
        users1.setUsername("son");
        users1.setPassword("sonson");
        users1.setPhone("0922111111");
        users1.setEmail("son@codegym.com");
        users1.setAvatar("https://ca.slack-edge.com/T4AQ8L79A-U6H10J339-68531cae9872-512");
        users.add(users1);

        Users users2 = new Users();
        users2.setUsername("thanh");
        users2.setPassword("thanhthanh");
        users2.setEmail("thanhdinh@gmail.com");
        users2.setPhone("0982718293");
        users2.setAvatar("https://ca.slack-edge.com/T4AQ8L79A-UCBA10GV8-c8dd8a808675-512");
        users.add(users2);
    }

    public static Users checkUser(Login login){
        for (Users u: users){
            if(u.getUsername().equals(login.getUser()) && u.getPassword().equals(login.getPass())){
                return u;
            }
        }
        return null;
    }
}
