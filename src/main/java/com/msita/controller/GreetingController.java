package com.msita.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class GreetingController {

    @RequestMapping(path="/greeting", method= RequestMethod.GET)
    public String greeting(final Model model) {
        model.addAttribute("product", Arrays.asList("Tivi", "Tu lanh"));
        return "greeting";
    }

    @RequestMapping(path = "/greeting/{id}", method = RequestMethod.GET)
    public String greeting2(final Model model) {
        model.addAttribute("product", Arrays.asList("Dieu hoa"));
        return "greeting";
    }



}
