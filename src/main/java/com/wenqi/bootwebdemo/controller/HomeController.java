package com.wenqi.bootwebdemo.controller;

import com.wenqi.bootwebdemo.model.DummyData;
import com.wenqi.bootwebdemo.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;

@Controller
public class HomeController {
    @Autowired
    NameService nameService;

    @RequestMapping("/")
    public ModelAndView home() {
        // Method name does not matter, looks at url mapping above only.
        ModelAndView mv = new ModelAndView("home.jsp");
        return mv;
    }

    @RequestMapping("/name")
    public ModelAndView getName(String name) {
        String newName = nameService.reverseString(name);
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", newName);
        mv.setViewName("home.jsp");
        return mv;
    }

}
