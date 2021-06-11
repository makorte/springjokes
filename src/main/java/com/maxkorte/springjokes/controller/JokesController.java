package com.maxkorte.springjokes.controller;

import com.maxkorte.springjokes.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/chucknorrisjoke", "/joke"})
public class JokesController {
    private final JokeService js;

    public JokesController(JokeService js) {
        this.js = js;
    }

    @GetMapping({"", "/"})
    public String index(Model model){
        model.addAttribute("joke", js.getJoke());
        return "chucknorrisjoke";
    }
}
