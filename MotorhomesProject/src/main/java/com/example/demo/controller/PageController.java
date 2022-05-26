//Authors: team
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

//  get the mapping for index page
    @GetMapping("/")
    public String frontPage(Model model) {
        return "frontpage/index";
    }

//    get the mapping for gallery page
    @GetMapping("/gallery")
    public String galleryPage(Model model) {
        return "gallery/gallery";
    }
//  get the mapping for contact page
    @GetMapping("/contact")
    public String contactPage() {
        return "contact/contact";
    }

//    get the mapping for about page
    @GetMapping("/about")
    public String aboutPage() {
        return "about/about";
    }

//    get the mapping for employees page
    @GetMapping("/employees")
    public String employeePage() {
        return "employees/employees";
    }


}
