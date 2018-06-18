package com.usher.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
@Slf4j
public class TestController {

    //@RequestMapping("/hello.json")
    @ResponseBody
    public String hello() {
        log.info("hello");
      //  throw new PermissionException("test exception");
         return ("hello, permission");
    }

}
