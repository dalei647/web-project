package com.lei.service.impl;

import com.lei.mapper.DeptMapper;
import com.lei.pojo.Dept;
import com.lei.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service    // 标注在业务层类上，交给容器
public class DeptServiceImpl implements DeptService {

    @Autowired  //依赖注入
    private DeptMapper deptMapper;

    public List<Dept> findAll() {
        return deptMapper.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        deptMapper.deleteById(id);
    }

}