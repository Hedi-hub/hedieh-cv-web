package hediprofile.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

    //** everything you write which mentioned in the value would get you
    // to the index page
    @RequestMapping(value = {"/", "/index", "/home" })

    public String showHomePage(Model model){
        return "index";
    }
}
