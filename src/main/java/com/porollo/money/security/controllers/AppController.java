package com.porollo.money.security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.porollo.money.strings.Strings;

/**
 * Created by Dmitriy S. Porollo on 31.03.2015.
 */

@Controller
public class AppController {

    String title = "title";
    String pName = "Money Count";


    @RequestMapping(value = {"/", "/money**"}, method = {RequestMethod.GET})
    public ModelAndView welcomePage() {
        ModelAndView model = new ModelAndView();
        model.addObject(title, pName);
        model.addObject("message", "Welcome Page !");
        model.setViewName("money");
        return model;
    }

    @RequestMapping(value = "/protected**", method = RequestMethod.GET)
    public ModelAndView protectedPage() {

        ModelAndView model = new ModelAndView();
        model.addObject("title", "Home Money Dashboard");
        model.addObject("message", "This is protected page - read only!");
        model.setViewName("protected");
        return model;

    }

    @RequestMapping(value = "/admin**", method = RequestMethod.GET)
    public ModelAndView adminPage() {

        ModelAndView model = new ModelAndView();
        model.addObject("title", pName);
        model.addObject("message", "This is confidential page - Need Super Admin Role!");
        model.setViewName("admin");

        return model;

    }
}
