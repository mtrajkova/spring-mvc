package main.java.controllers;

import main.java.model.MoviesForm;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/")
public class MoviesFormController {

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView showMoviesForm() {
        return new ModelAndView("moviesForm");
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView submitMoviesForm(@Valid @ModelAttribute MoviesForm moviesForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("moviesForm");

        }
        ModelAndView modelAndView = new ModelAndView("moviesFormResult");
        modelAndView.addObject("result", moviesForm);
        return modelAndView;
    }
}
