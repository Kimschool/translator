package com.example.translatorapi.repository;

import com.example.translatorapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

    public User findByIdAndPassword(String id, String password);
}
