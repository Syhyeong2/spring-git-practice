package com.syhy.git_practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
    

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/board")
    public String getBoard() {
        return "board";
    }
    
}
