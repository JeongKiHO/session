package com.example.session.controller;
// 계정 관련 컨트롤러 (로그인)


import com.example.session.model.LoginRequest;
import com.example.session.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/account")
public class AccountApiController {

    private final UserService userService;

    @PostMapping("/login")
    public void login(
            @RequestBody
            LoginRequest loginRequest,

            HttpSession httpSession // 세션 사용 선언
    ){
        userService.login(loginRequest, httpSession);
    }
}
