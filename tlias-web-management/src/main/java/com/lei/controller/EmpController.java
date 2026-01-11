package com.lei.controller;

import com.lei.pojo.Emp;
import com.lei.pojo.PageResult;
import com.lei.pojo.Result;
import com.lei.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 员工管理
 */
@RequestMapping("/emps")
@Slf4j
@RestController
public class EmpController {

    @Autowired
    private EmpService empService;


    @GetMapping
    public Result page(Integer page, Integer pageSize){
        PageResult<Emp> pageResult = empService.page(page, pageSize);
        return Result.success(pageResult);
    }

}
