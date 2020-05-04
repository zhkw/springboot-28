package com.zkw.controller;

import com.zkw.dao.StudentRepository;
import com.zkw.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class WelcomeController {

    @Autowired
    StudentRepository studentRepository;

    @RequestMapping("/welcome")
    public String loginMessage(ModelMap mod){
        List<Student> list = studentRepository.findAll();
        mod.addAttribute("name","zhoukw");
        mod.addAttribute("todos",list);
        return "welcome";
    }

    @RequestMapping("/welcome1")
    public String oneUser(ModelMap mod){
        Student stu = studentRepository.getById(1);
        mod.addAttribute("name",stu.getName());
        return "welcome1";
    }
}
