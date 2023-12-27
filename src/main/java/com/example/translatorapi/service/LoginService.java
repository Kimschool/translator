package com.example.translatorapi.service;

import com.example.translatorapi.dto.LoginDto;
import com.example.translatorapi.entity.User;
import com.example.translatorapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final UserRepository userRepository;

    public boolean loginProc(LoginDto dto) {

        User user = userRepository.findByIdAndPassword(dto.getId(), dto.getPassword());

        if (user != null) {
            return true;
        } else {
            return false;
        }
    }

}
