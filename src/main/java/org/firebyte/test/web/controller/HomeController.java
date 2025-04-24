package org.firebyte.test.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.constraints.Pattern;
import org.springframework.validation.annotation.Validated;

@Controller
@Validated
public class HomeController {

    @GetMapping("/")
    public String index(Model model, 
                       @RequestParam(name = "name", required = false, defaultValue = "World") 
                       @Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "Name must contain only alphanumeric characters and spaces") 
                       String name) {
        
        model.addAttribute("name", name);
        return "index";
    }
}