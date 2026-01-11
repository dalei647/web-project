package com.lei.service;

import com.lei.pojo.Emp;
import com.lei.pojo.EmpQueryParam;
import com.lei.pojo.PageResult;

public interface EmpService {
    /**
     * 分页查询
     */
    //PageResult page(Integer page, Integer pageSize, String name, Integer gender, LocalDate begin, LocalDate end);
    PageResult page(EmpQueryParam empQueryParam);
}
