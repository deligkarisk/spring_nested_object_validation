package com.deligkarisk.validating_nested_objects.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"","/","/index"})
    public String IndexController() {
        return "index";
    }
}
