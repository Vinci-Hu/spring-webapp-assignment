package com.wenqi.bootwebdemo.controller;

import com.wenqi.bootwebdemo.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @Autowired
    NameService service;
    @Value("${reverse-name}")
    private boolean reverseFlag;
    @RequestMapping("/")
    public ModelAndView home(){
        //method name does not matter

        ModelAndView mv = new ModelAndView();
//        mv.addObject("name", myName);
        mv.setViewName("home");
//        System.out.println("hi " + name);
        return mv; //because we set up a suffix search in app prop file

    }

    @RequestMapping("/name")
    public ModelAndView getName(String name){
        String newName = name;
        if (reverseFlag){
            newName = service.reverseString(name);
        }
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", newName);
        mv.setViewName("home");
        return mv;
    }
}
