package com.lei.mapper;

import com.lei.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpMapper {

    /**
     * 查询所有的员工及其对应的部门名称
     */
    @Select("select e.*, d.name as deptName from emp e left join dept d on e.dept_id = d.id " +
            "order by e.update_time desc limit #{start},#{pageSize}")
    List<Emp> list(Integer start,Integer pageSize);

    @Select("select count(*) from emp e left join dept d on e.dept_id=d.id")
    Long count();



}
