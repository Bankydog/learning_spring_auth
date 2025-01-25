package com.secure.notes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String sayHallo(){
        return "Hello";
    }
    @GetMapping("/contact")
    public String sayContact(){
        return "Contact";
    }
}
