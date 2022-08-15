package com.wenqi.bootwebdemo.controller;

import com.wenqi.bootwebdemo.service.NameService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    private static final Logger logger = LogManager.getLogger(HomeController.class);
    @Autowired
    NameService nameService;

    @RequestMapping("/")
    public String home() {
        // Method name does not matter, looks at url mapping above only.
//        ModelAndView mv = new ModelAndView("home.jsp");
        InputStream is = null;
        try {
            is = getFileFromResourceAsStream("welcome.txt");
        } catch (IllegalArgumentException e) {
            logger.error("Home controller: " + e.getMessage());
        }
        String result = convertStrListIntoStr(decodeInputStream(is));
        System.out.println(result);
        return "home.jsp";
    }

    @RequestMapping("/name")
    public ModelAndView getName(String name) {
        String newName = "";
        ModelAndView mv = new ModelAndView();
        try {
            newName = nameService.reverseString(name);
            mv.addObject("name", newName);
            mv.setViewName("home.jsp");
        } catch (NullPointerException e) {
            logger.error("Home controller: Name not specified!");
            mv.setViewName("error.jsp");
        }
        return mv;
    }

    private List<String> decodeInputStream(InputStream is) {
        List<String> file = new ArrayList<>();

        try (InputStreamReader streamReader =
                     new InputStreamReader(is, StandardCharsets.UTF_8);
             BufferedReader reader = new BufferedReader(streamReader)) {

            String line;
            while ((line = reader.readLine()) != null) {
                file.add(line + System.lineSeparator());
            }

        } catch (IOException e) {
            logger.error("Home controller: " + "read input stream failed");
        }

        return file;
    }

    private InputStream getFileFromResourceAsStream(String fileName) throws IllegalArgumentException {

        // The class loader that loaded the class
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);

        // the stream holding the file content
        if (inputStream == null) {
            throw new IllegalArgumentException("file not found! " + fileName);
        } else {
            return inputStream;
        }

    }

    private String convertStrListIntoStr(List<String> strList) {
//        System.out.println("list: "+ strList);
        String result = strList.get(0);
        for (int i = 1; i < strList.size(); i++) {
            result += strList.get(i);
        }
        return result;
    }
}
