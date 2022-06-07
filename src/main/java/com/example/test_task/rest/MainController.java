package com.example.test_task.rest;


import com.example.test_task.Dto.User;
import com.example.test_task.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/task")
public class MainController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/add")
    public String addNewUser(@RequestParam String name, @RequestParam String email){
        return userService.addNewUser(name, email);
    }

    @GetMapping(path = "/get")
    public Iterable<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
