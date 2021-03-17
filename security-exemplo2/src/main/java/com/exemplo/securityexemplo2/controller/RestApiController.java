package com.exemplo.securityexemplo2.controller;

import com.exemplo.securityexemplo2.entity.UserProfile;
import org.apache.catalina.User;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

    @Secured("ROLE_USER")
    @GetMapping(value = "/user/hello")
    public String welcomeAppUser(@AuthenticationPrincipal User user){
        return "Welcome User " + user.getUsername();
    }

    @GetMapping(value = "/guest/user", produces = "application/xml")
    public UserProfile guestUser(){
        return new UserProfile("exemplo","123");
    }
}
