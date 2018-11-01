package com.gao.mybatis.mapper;

import java.util.List;

import com.gao.mybatis.entity.Dept;
import com.gao.mybatis.entity.Employee;

public interface EmployeeMapper {
    /**
     *
     * @mbggenerated 2018-10-30
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-10-30
     */
    int insert(Employee record);

    /**
     *
     * @mbggenerated 2018-10-30
     */
    int insertSelective(Employee record);

    /**
     *
     * @mbggenerated 2018-10-30
     */
    Employee selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-10-30
     */
    int updateByPrimaryKeySelective(Employee record);

    /**
     *
     * @mbggenerated 2018-10-30
     */
    int updateByPrimaryKey(Employee record);
    public List<Employee> selectAll(Employee e);

	void updateAll(Employee emp);
}