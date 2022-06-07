package com.example.test_task.Service;

import com.example.test_task.Dao.UserDao;
import com.example.test_task.Dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public String addNewUser(String name, String email){
        User newUser= new User();
        newUser.setName(name);
        newUser.setEmail(email);
        userDao.save(newUser);
        return "Saved";
    }

    public Iterable<User> getAllUsers(){
       return userDao.findAll();
    }
}
