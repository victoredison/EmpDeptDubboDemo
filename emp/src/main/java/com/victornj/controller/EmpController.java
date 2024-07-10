package com.victornj.controller;

import com.victornj.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping("/empadd")
    public String empAdd(Model model){

        model.addAttribute("list",empService.findAllEmp());

        return "empAdd";
    }


}
