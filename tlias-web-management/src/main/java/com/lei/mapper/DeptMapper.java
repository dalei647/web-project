package com.lei.mapper;

import com.lei.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {
    /**
     * 查询所有部门
     */
    @Select("select * from dept")
    List<Dept> findAll();

    @Delete("delete from dept where id = #{id}")
    void deleteById(Integer id);

    @Insert("insert into dept (name, create_time, update_time) values(#{name}, #{createTime}, #{updateTime})")
    void insertByName(Dept dept);

    @Select("select * from dept where id = #{id}")
    Dept findById(Integer deptId);

    @Update("update dept set name = #{name}, update_time = #{updateTime} where id = #{id}")
    void updateInfoById(Dept dept);
}
