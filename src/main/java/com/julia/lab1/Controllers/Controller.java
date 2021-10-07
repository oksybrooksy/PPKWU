package com.julia.lab1.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/reverse")
    public String reverseText(@RequestParam("text") String text){

        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        String text2 = sb.toString();
        System.out.println("Original string: " + text);
        System.out.println("Reversed string: " + text2);

        return text2;
    }

}
