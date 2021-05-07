package br.com.crinnnger.codeanywhere.SpringJWT.controller;

import br.com.crinnnger.codeanywhere.SpringJWT.data.UserData;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class AuthController {
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping
    public void login(@RequestBody UserData user){
        user.setUserName(bCryptPasswordEncoder.encode(user.getPassword()));
    }
}
