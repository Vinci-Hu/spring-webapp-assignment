package com.wenqi.bootwebdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("home")
    public ModelAndView home(@RequestParam("name") String myName){
        //method name does not matter

        ModelAndView mv = new ModelAndView();
        mv.addObject("name", myName);
        mv.setViewName("home");

//        System.out.println("hi " + name);
        return mv; //because we set up a suffix search in app prop file

    }
}
