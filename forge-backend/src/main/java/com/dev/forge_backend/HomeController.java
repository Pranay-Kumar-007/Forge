package com.dev.forge_backend;

import com.dev.forge_backend.model.Health;
import com.dev.forge_backend.model.About;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping("/")
    public String testing() {
        return "Forge Backend is running";
    }

    @GetMapping("/health")
    public Health getHealth() {
        return new Health ("UP", "Forge Backend");
    }

    @GetMapping("/about")
    public About getAbout() {
        return new About ("Forge","0.0.1","Pranay Yelakanti");
    }
}
    