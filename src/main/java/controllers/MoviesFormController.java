package main.java.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/moviesForm")
public class MoviesFormController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView showMoviesForm(){
        return new ModelAndView("moviesForm");
    }
}
