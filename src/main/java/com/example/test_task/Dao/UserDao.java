package com.example.test_task.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.test_task.Dto.User;

public interface UserDao extends JpaRepository<User,Integer> {
}
