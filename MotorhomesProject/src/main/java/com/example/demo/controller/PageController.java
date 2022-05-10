package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {


    @GetMapping("/")
    public String frontPage(Model model) {
        return "frontpage/index";
    }

    @GetMapping("/gallery")
    public String galleryPage(Model model) {
        return "gallery/gallery";
    }
    
    @GetMapping("/mechanic")
    public String mechanicPage(Model model) {
        return "mechanic/mechanic";
    }

    @GetMapping("/contact")
    public String contactPage() {
        return "contact/contact";
    }

    @GetMapping("/about")
    public String aboutPage() {
        return "about/about";
    }

    @GetMapping("/map")
    public String mapPage() {
        return "map/map";
    }


}
