package de.ausbildung;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello world";
    }

    @GetMapping("/hello/{name}")
    @ResponseBody
    public String helloWorldPathVariable(@PathVariable String name){
        return "Hello World " +name;
    }

    @GetMapping("/helloworld")
    @ResponseBody
    public String helloWorldQueryParam(@RequestParam String name){
        return "Hello World "+name;
    }
}
