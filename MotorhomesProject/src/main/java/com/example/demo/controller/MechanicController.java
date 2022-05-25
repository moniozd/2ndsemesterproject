package com.example.demo.controller;

import com.example.demo.model.CustomerModel;
import com.example.demo.model.MotorhomeModel;
import com.example.demo.service.MechanicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MechanicController {

    @Autowired
    MechanicService mechanicService;


    @GetMapping("/mechanic")
    public String mechanicPage(Model model) {
        model.addAttribute("motorhomes", mechanicService.fetchAll());
        return "mechanic/mechanic";
    }


/*    @GetMapping("/update_service/{id}")
    public String updateService(@PathVariable(value="id") long id, Model model) {
        model.addAttribute("motorhomes", mechanicService.findMotorhomeById(id));
        return "mechanic/update_service";
    }*/

    @PostMapping("/mechanic")
    public String updateService(@ModelAttribute MotorhomeModel motorhomeModel, long id, Model model) {
        model.addAttribute("motorhome", mechanicService.findMotorhomeById(id));
        mechanicService.updateService(motorhomeModel.getId(), motorhomeModel);
        return "redirect:/mechanic";
    }

}
