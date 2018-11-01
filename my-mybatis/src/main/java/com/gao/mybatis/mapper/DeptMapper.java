package com.gao.mybatis.mapper;

import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.gao.mybatis.entity.Dept;


/**
 * Mapper接口
 * 	
 * 基于Mybatis:  在Mapper接口中编写CRUD相关的方法  提供Mapper接口所对应的SQL映射文件 以及 方法对应的SQL语句. 
 * 
 * 基于MP:  让XxxMapper接口继承 BaseMapper接口即可.
 * 		   BaseMapper<T> : 泛型指定的就是当前Mapper接口所操作的实体类类型 
 * 
 */

public interface DeptMapper extends BaseMapper<Dept>{
	public List<Dept> selectAll();

}
