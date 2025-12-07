package com.secj3303.controller;

import com.secj3303.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/bmi")
    public String home(Model model) {

        // create sample person object
        Person person = new Person("Ahmad", 2001, 65, 1.70);

        // share with view
        model.addAttribute("person", person);

        // JSP name (person-info.jsp)
        return "person-info";
    }
}
