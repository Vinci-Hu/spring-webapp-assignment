package com.wenqi.bootwebdemo.controller;

import com.wenqi.bootwebdemo.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @Autowired
    NameService nameService;

    @RequestMapping("/")
    public ModelAndView home(){
        //method name does not matter

        ModelAndView mv = new ModelAndView();
//        mv.addObject("name", myName);
        mv.setViewName("home.jsp");
//        System.out.println("hi " + name);
        return mv; //because we set up a suffix search in app prop file

    }

    @RequestMapping("/name")
    public ModelAndView getName(String name){
        String newName = nameService.reverseString(name);
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", newName);
        mv.setViewName("home.jsp");
        return mv;
    }

}
