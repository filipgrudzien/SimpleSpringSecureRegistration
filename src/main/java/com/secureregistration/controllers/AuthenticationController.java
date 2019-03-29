package com.secureregistration.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthenticationController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView showLoginPage(){
        ModelAndView mav = new ModelAndView("login");
        return mav;
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView showRegistrationPage(){
        ModelAndView mav = new ModelAndView("registration");
        return mav;
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView showHomePage(){
        ModelAndView mav = new ModelAndView("home");
        return mav;
    }




}

