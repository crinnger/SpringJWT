package br.com.crinnnger.codeanywhere.SpringJWT.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class StatusController {

    public String viewStatus(){
        return "OnLine";
    }
}
