package com.lei.service;

import com.lei.pojo.Dept;

import java.util.List;

public interface DeptService {
    /**
     * 查询所有部门
     */
    List<Dept> findAll();

    void deleteById(Integer id);

    void insertByName(Dept dept);

    Dept findById(Integer deptId);

    void updateInfoById(Dept dept);
}
