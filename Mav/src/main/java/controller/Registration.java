package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Registration {
    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }
    /*@PostMapping ("/registration")
    public String addUser(User ){
        return "redirect:/login";
    }*/

}
