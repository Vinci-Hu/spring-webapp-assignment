package com.wenqi.bootwebdemo.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource(value={"application.properties"})
public class NameService {
    private static final Logger logger = LogManager.getLogger(NameService.class);
    @Value("${reverse-name:true}")
    boolean reverseFlag;

    /**
     * Reverses a string or not controlled by a property.
     *
     * @return Reversed string if reverse-name property is true.
     * Original string otherwise.
     */
    public String reverseString(String str) {
        if (!reverseFlag) {
            logger.info("Input name " + str + " not reversed.");
            return str;
        }
        String nstr = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        logger.info("Input name " + str + " is reversed into " + nstr + ".");
        return nstr;
    }
}
