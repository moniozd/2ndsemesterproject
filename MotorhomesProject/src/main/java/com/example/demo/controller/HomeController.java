package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class HomeController {


    @GetMapping("/")
    public String frontPage(Model model) {
        return "frontpage/index";
    }

}
