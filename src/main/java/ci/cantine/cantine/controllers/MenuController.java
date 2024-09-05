package ci.cantine.cantine.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pages")
public class MenuController {

    @GetMapping("/menus")
    public String showManuController(){
        return "/pages/menus";
    }






}
