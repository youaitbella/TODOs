package de.youness.springboot.tut.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class HomeController {

    @RequestMapping(value = "/")
    public String greeting(){
        return "Hello, Welcome to springBoot!!";
    }

    @GetMapping(value = "/{name}")
    public String greetingWithName(@PathVariable String name){
        return String.format("Welcome %s to our springBoot App", name);
    }
}
