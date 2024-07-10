package com.victornj.service.impl;

import com.victornj.dubbo.service.DeptDubboService;
import com.victornj.pojo.Dept;
import com.victornj.pojo.Emp;
import com.victornj.service.EmpService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Reference
    private DeptDubboService deptDubboService;

    @Override
    public List<Dept> findAllEmp() {

        return deptDubboService.findAllDept();
    }
}
