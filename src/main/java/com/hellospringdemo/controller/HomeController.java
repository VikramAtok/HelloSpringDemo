package com.hellospringdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Vikram on 6/7/2016.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home()
    {
        return "home";
    }
}
