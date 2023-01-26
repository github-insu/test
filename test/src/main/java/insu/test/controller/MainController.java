package insu.test.controller;

import insu.test.dto.InfoDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/info")
    public String newInfo(){
        return "info";
    }

    @PostMapping("/info/create")
    public String createInfo(InfoDto form){
        System.out.println(form.toString());
        return "";
    }

}
