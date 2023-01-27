package insu.test.controller;

import insu.test.dto.InfoDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/info")
    public String newInfo(){
        return "info";
    }

    @PostMapping("/info/create")
    public String createInfo(InfoDto form, Model model){
        System.out.println(model);
        System.out.println(form);
        model.addAttribute("id",model.getAttribute("id"));
        model.addAttribute("id", form.getId());
        model.addAttribute("pw", form.getPw());
        model.addAttribute("email",form.getEmail());
        model.addAttribute("phone_number",form.getPhone_number());

        return "info_create";
    }
}
