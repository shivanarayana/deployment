package com.example.deployment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("https://deployinjenkins.herokuapp.com/")
public class GetMessages{

    @GetMapping("/{data}")
    public String getGreeting(@PathVariable("data") String data)  {
        return data;
    }
}
