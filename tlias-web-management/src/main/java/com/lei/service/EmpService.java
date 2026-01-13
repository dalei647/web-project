package com.lei.service;

import com.lei.pojo.Emp;
import com.lei.pojo.EmpQueryParam;
import com.lei.pojo.PageResult;

import java.util.List;

public interface EmpService {
    /**
     * 分页查询
     */
    //PageResult page(Integer page, Integer pageSize, String name, Integer gender, LocalDate begin, LocalDate end);
    PageResult page(EmpQueryParam empQueryParam);

    void save(Emp emp);

    void deleteByIds(List<Integer> ids);

    Emp getInfo(Integer id);

    void update(Emp emp);
}
