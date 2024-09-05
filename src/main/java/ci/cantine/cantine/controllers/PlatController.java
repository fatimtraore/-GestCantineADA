package ci.cantine.cantine.controllers;

import ci.cantine.cantine.models.Plat;
import ci.cantine.cantine.services.PlatService;
import ci.cantine.cantine.services.dto.PlatDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/pages")
public class PlatController {

    private final PlatService platService;

    @GetMapping("/plats")
    public String showPlatPage(){

        return "/pages/plats";
    }




//    public String addPlat(Model model){
//        model.addAttribute("plat", new Plat());
//        return "/pages/form";
//
//    }
//
//
//    @PostMapping
//    public String savePlat(PlatDTO plat){
//        platService.save(plat);
//        return "redirect:/pages/plats";
//
//    }




}
