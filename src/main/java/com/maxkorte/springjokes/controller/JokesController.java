package com.maxkorte.springjokes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Controller
@RequestMapping("/chucknorrisjoke")
public class JokesController {
    @GetMapping("")
    public String index(Model model){
        ChuckNorrisQuotes cnq = new ChuckNorrisQuotes();
        model.addAttribute("joke", cnq.getRandomQuote());
        return "chucknorrisjoke";
    }
}
