package com.wenqi.bootwebdemo.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class NameService {
    @Value("${reverse-name}")
    private boolean reverseFlag;
    private static Logger logger = LogManager.getLogger(NameService.class);
    public String reverseString(String str){
        if (!reverseFlag){
            logger.info("Input name "+str+" not reversed.");
            return str;
        }
        String nstr = "";
        char ch;
        for (int i=0;i<str.length();i++){
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        logger.info("Input name "+ str + " is reversed into "+nstr+".");
        return nstr;
    }
}
