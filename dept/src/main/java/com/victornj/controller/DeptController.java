package com.victornj.controller;

import com.victornj.dubbo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/dept")
    public String showDept(Model model){

        System.out.println("inside dept");
        model.addAttribute("list", deptService.findAllDept());

        return "dept";

    }
}
