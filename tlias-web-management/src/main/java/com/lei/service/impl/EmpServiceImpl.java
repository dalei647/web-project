package com.lei.service.impl;

import com.lei.mapper.EmpMapper;
import com.lei.pojo.Emp;
import com.lei.pojo.PageResult;
import com.lei.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 员工管理
 */
@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public PageResult<Emp> page(Integer page, Integer pageSize) {
        Long total = empMapper.count();

        Integer start = (page-1) * pageSize;
        List<Emp> rows = empMapper.list(start, pageSize);

        return new PageResult<Emp>(total, rows);
    }
}
