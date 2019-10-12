package com.retdata.partybuilding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "redirect:/index.jsp";
    }

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("msg", "你好");
        return "success";
    }
}
