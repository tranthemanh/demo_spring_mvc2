package com.example.demo_spring_mvc_2.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import sun.tools.jar.CommandLine;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1, "Nguyen Khac Nhat", "nhat@codygym.com", "Ha Noi"));
        users.add(new User(2, "Dang Huy Hoa", "hoa@codygym.com", "Da Nang"));
        users.add(new User(3, "Le Thi Chau", "chau@codygym.com", "Hung Yen"));
        users.add(new User(4, "Nguyen Thuy Duong", "duong@codygym.com", "Nam Dinh"));
    }

    public List<User> showList(){
        return users;
    }
}
