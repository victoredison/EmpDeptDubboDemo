package com.victornj.dubbo.service.impl;

import com.victornj.dubbo.service.DeptDubboService;
import com.victornj.pojo.Dept;
import com.victornj.dubbo.service.DeptService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Reference
    private DeptDubboService deptDubboService;

    @Override
    public List<Dept> findAllDept(){

       return deptDubboService.findAllDept();
    }
}
