package org.wefine.hipster.controller;

import org.wefine.hipster.service.SuperheroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/superhero")
public class SuperheroController {
    @Autowired
    private SuperheroService service;

    @RequestMapping
    public ModelAndView getSuperheroes() {
        return new ModelAndView("superheroes", "superheroes", service.findAll());
    }
}
