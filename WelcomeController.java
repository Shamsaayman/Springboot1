package org.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController
{
    @GetMapping(path = "/name")
    public String name(){
        return "My name is Shamsa";
    }

    @GetMapping(path = "/age")
    public String age(){
        return "My age is 23";
    }

    @GetMapping(path = "/check/status")
    public String status(){
        return "Everything OK";
    }
    @GetMapping(path = "/health")
    public String health(){
        return "Server health is up and running";
    }
    @GetMapping(path = "/names")
    public String[] namearray(){
        String[]names={"Shamsa","Nora","Nada"};
        return names;
    }
}
