package com.example.test_task.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.test_task.Dto.User;

import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class LoginController {

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String loginForm(Model model){
        model.addAttribute("login", new User());
        return "login";
    }

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String loginSubmit(@ModelAttribute User user, Model model){
        model.addAttribute("login", user);
        return "NewUser";
    }

}
