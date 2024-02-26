package dk.kea.htmlcssdat23b.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/threeboxes")
    public String threeBoxes() {
        return "threeboxes";
    }

    @GetMapping("/flexmenu")
    public String flexMenu(){
        return "flexmenu";
    }
}
