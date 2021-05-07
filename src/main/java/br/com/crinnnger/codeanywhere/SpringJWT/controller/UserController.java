package br.com.crinnnger.codeanywhere.SpringJWT.controller;

import br.com.crinnnger.codeanywhere.SpringJWT.data.UserData;
import br.com.crinnnger.codeanywhere.SpringJWT.service.UserDetailsServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserDetailsServiceImpl userDetailsService;

    @GetMapping
    public List<UserData> listAllUsers(){
        return userDetailsService.listUsers();
    }
}
