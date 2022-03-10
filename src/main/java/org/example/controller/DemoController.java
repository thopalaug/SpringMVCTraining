package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    // HTTP://localhost:8080/SpringMVCTraining/hello
    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    // http://localhost:8080/SpringMVCTraining/welcome
    // prefix + name + suffix
    // /WEB-INF/view/welcome.jsp
    @GetMapping("welcome")
    public String welcome(){
        return "welcome";
    }
}
