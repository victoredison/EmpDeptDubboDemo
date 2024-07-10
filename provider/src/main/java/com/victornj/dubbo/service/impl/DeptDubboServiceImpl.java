package com.victornj.dubbo.service.impl;

import com.victornj.dubbo.service.DeptDubboService;
import com.victornj.mapper.DeptMapper;
import com.victornj.pojo.Dept;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Service
public class DeptDubboServiceImpl implements DeptDubboService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> findAllDept(){


        return deptMapper.findAll();
    }


}
