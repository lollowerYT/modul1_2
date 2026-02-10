package com.example.demo.controller;

import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostsCreateController {

    @Autowired
    private PostService postsService;

    @GetMapping("/new")
    public String create(Model model) {
        return "create";
    }
    
    @PostMapping("/new")
    public String doCreate(@ModelAttribute("text") String text){
        postsService.create(text);
        return "redirect:/";
    }
}
