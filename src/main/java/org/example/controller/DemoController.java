package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class DemoController {

    // http://localhost:8080/SpringMVCTraining/welcome
    @GetMapping("welcome")
    public String welcome(Model model){
        // prefix + name + suffix
        // /WEB-INF/view/welcome.jsp
        model.addAttribute("user", "Thomas");

        return "welcome";
    }


    @ModelAttribute("welcomeMessage")
    public String welcomeMessage(){
        return "Welcome to this Demo";
    }
}
