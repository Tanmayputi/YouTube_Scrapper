package yt.youtube_scrapper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ytController {
    
    @GetMapping("/")
    public String getHome() {
        return "index";
    }
    



}
