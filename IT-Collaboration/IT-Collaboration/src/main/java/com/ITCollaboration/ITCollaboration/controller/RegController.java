package com.ITCollaboration.ITCollaboration.controller;


import com.ITCollaboration.ITCollaboration.entity.RepositoryTemp;
import com.ITCollaboration.ITCollaboration.entity.TempEntity;
import com.ITCollaboration.ITCollaboration.handlingformsubmission.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RegController {

//    private RepositoryTemp studentRepo;

    @GetMapping("/")
    public String indexLogin(Model model) {
//        List<TempEntity> listStudents = studentRepo.findAll();
//        model.addAttribute("listStudents", listStudents);
        return "indexLogin";
    }

    // @PostMapping("/greeting")
    @RequestMapping(value = "/greeting", method = RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        model.addAttribute("name", greeting.getContent());
        System.out.println(greeting.getContent());
        return "Result";
    }
}
