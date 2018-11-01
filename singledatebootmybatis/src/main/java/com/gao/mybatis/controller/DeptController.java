package com.gao.mybatis.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.gao.mybatis.entity.Dept;
import com.gao.mybatis.mapper.DeptMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Bean
 * @since 2018-11-01
 */
@RestController
@RequestMapping("/dept")
public class DeptController {
	@Autowired
	private DeptMapper deptMapper;
	
	@RequestMapping("get")
	public String get() {
		Dept dept = new Dept();
		dept.setId(1);
		Dept list = deptMapper.selectOne(dept);
		return com.alibaba.fastjson.JSONObject.toJSONString(list);
	}
}

