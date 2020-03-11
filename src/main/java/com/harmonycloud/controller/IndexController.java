package com.harmonycloud.controller;

import com.harmonycloud.bean.Person;
import com.harmonycloud.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    private PersonService personService;

    @Autowired
    public IndexController(PersonService personService) {
        this.personService = personService;
    }


    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "It's OK !";
    }

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        System.out.println(11111111);
        return "Hello!";
    }
    @RequestMapping("/person")
    @ResponseBody
    public Person getInfo(){
        return personService.getInfo();
    }

}