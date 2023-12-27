package com.example.translatorapi.controller;

import com.example.translatorapi.dto.LoginDto;
import com.example.translatorapi.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;

@GetMapping("/login")
    public ResponseEntity<?> login(LoginDto dto) {

    boolean result = loginService.loginProc(dto);

    if (result) {
        return ResponseEntity.status(HttpStatus.OK).build();
    } else {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

    }
    }

}
