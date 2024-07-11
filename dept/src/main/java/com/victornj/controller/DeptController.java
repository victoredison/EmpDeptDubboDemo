package com.victornj.controller;

import com.victornj.dubbo.service.DeptDubboService;
import com.victornj.dubbo.service.DeptService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeptController {

    //@Autowired
    //private DeptService deptService;


    //dev version

    @Reference
    private DeptDubboService deptDubboService;

    @RequestMapping("/dept")
    public String showDept(Model model){

        System.out.println("inside dept");
        model.addAttribute("list", deptDubboService.findAllDept());

        return "dept";

    }
}
