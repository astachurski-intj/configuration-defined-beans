package com.example;

import com.example.tools.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringDefinedBean {

    @Autowired  //converter is defined as bean in Java style!
    private Converter converter;

    public String hello() {
        String result = "hello from : " + this.getClass();
        return converter.convert(result);

    }
}
