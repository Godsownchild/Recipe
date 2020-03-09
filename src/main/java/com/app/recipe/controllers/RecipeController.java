package com.app.recipe.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RecipeController {

    public String home(){
        return "index";
    }

}
