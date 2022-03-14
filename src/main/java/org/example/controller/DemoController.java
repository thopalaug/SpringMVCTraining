package org.example.controller;

import org.example.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

    // -- Private Fields
    @Autowired
    private DemoService demoService;


    // -- Constructor --


    // -- Request Methods --
    // http://localhost:8080/SpringMVCTraining/welcome
    // http://localhost:8080/SpringMVCTraining/welcome?user=Thomas
    // http://localhost:8080/SpringMVCTraining/welcome?user=Thomas&age=32
    @GetMapping("welcome")
    public String welcome(@RequestParam String user, @RequestParam int age, Model model){
        // prefix + name + suffix
        // /WEB-INF/view/welcome.jsp
        model.addAttribute("helloMessage", demoService.getHelloMessage(user));
        model.addAttribute("age", age);

        return "welcome";
    }

    // -- Model Attributes --
    @ModelAttribute("welcomeMessage")
    public String welcomeMessage(){
        return demoService.getWelcomeMessage();
    }
}
