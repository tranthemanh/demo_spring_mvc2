package com.example.demo_spring_mvc_2.controller;

import com.example.demo_spring_mvc_2.model.User;
import com.example.demo_spring_mvc_2.model.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String showList(Model model) {
        List<User> userList = userService.showList();
        model.addAttribute("userList", userList);
        return "demo";
    }
}
