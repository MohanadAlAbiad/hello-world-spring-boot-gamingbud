package de.htwberlin.webtech.gamingbud.gaming;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

    @GetMapping(path = "/")
    public ModelAndView showHelooWorldPage() {
        return new ModelAndView("helloworld");

    }

}
