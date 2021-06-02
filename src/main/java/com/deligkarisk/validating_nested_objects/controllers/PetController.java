package com.deligkarisk.validating_nested_objects.controllers;


import com.deligkarisk.validating_nested_objects.domain.Pet;
import com.deligkarisk.validating_nested_objects.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;


@Controller
public class PetController {


    @Autowired
    PetRepository petRepository;

    @RequestMapping("editPet")
    @GetMapping
    public String editPet(Model model) {
        Pet pet =  petRepository.getById(1);
        model.addAttribute("pet", pet);
        return "editPet";
    }


    @RequestMapping("updatePet")
    @PostMapping
    public String updatePet(@Validated Pet pet, BindingResult bindingResult, Model model,
                            HttpServletRequest request, WebRequest webRequest) {
        if (bindingResult.hasErrors()) {
            System.out.println("Errors in the form");
            model.addAttribute("pet", pet);
            return "editPet";

        }
        petRepository.save(pet);
        return "success";
    }
}
