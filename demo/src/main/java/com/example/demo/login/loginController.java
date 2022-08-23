package com.example.demo.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class loginController {
    @RequestMapping(value="/main")
    public String main(){
        return "/index.html";
    }


}
