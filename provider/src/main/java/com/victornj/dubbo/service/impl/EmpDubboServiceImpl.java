package com.victornj.dubbo.service.impl;

import com.victornj.dubbo.service.DeptDubboService;
import com.victornj.dubbo.service.EmpDubboService;
import com.victornj.mapper.DeptMapper;
import com.victornj.mapper.EmpMapper;
import com.victornj.pojo.Dept;
import com.victornj.pojo.Emp;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Service
public class EmpDubboServiceImpl implements EmpDubboService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> findAllEmp(){

        System.out.println("inside dubbo provider");
        return empMapper.findAll();
    }


}
