package com.wenqi.bootwebdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("home")
    public String home(){
        //method name does not matter
        return "home"; //because we set up a suffix search in app prop file

    }
}
