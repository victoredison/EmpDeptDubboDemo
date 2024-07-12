package com.victornj.controller;

//import com.victornj.service.EmpService;
import com.victornj.dubbo.service.EmpDubboService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emp")
public class EmpController {

    @Reference
    private EmpDubboService empDubboService;

    @RequestMapping("/empQueryAll")
    public String empAdd(Model model){

        System.out.println("inside emp controller");
        model.addAttribute("list", empDubboService.findAllEmp());

        return "emp";
    }


}
