package com.practice.controller;

import com.practice.controller.model.Login;
import com.practice.controller.model.Users;
import com.practice.controller.service.UserInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginServlet {
    @GetMapping("index")
    public ModelAndView showLogin() {
        ModelAndView loginform = new ModelAndView("login", "login", new Login());
        return loginform;
    }

    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login") Login login) {
        Users users = UserInfo.checkUser(login);
        if (users == null) {
            ModelAndView modelAndView = new ModelAndView("error");
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("user");
            modelAndView.addObject("user", users);
            return modelAndView;
        }
    }
}
