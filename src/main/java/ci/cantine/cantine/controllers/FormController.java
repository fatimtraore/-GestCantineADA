package ci.cantine.cantine.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pages")
@Controller
public class FormController {

    @GetMapping("/forms")
    public String showFormPage(){

        return "pages/forms";
    }
}
