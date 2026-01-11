package com.lei.service;

import com.lei.pojo.Emp;
import com.lei.pojo.PageResult;

public interface EmpService {


    PageResult<Emp> page(Integer page, Integer pageSize);
}
