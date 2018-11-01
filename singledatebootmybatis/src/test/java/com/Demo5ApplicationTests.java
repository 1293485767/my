package com;


import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.gao.mybatis.entity.Dept;
import com.gao.mybatis.mapper.DeptMapper;



@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo5ApplicationTests {
	@Autowired
	private DeptMapper deptmapper;
	@Autowired
	private ApplicationContext ioc;
	

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void deptTest() {
		Dept dept = new Dept();
		dept.setId(1);
		Dept list = deptmapper.selectOne(dept);
		
		System.out.println("..............."+com.alibaba.fastjson.JSONObject.toJSONString(list));
		System.out.println();
				
	}
	
	@Test
	public void dataTest() throws BeansException, SQLException {
//		System.out.println(ioc.getBean("dataSource",DataSource.class).getConnection());
		
	}

}
