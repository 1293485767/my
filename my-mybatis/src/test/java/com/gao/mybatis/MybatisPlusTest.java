package com.gao.mybatis;


import com.gao.mybatis.datasource.DataSourceContextHolder;
import com.gao.mybatis.entity.Dept;
import com.gao.mybatis.mapper.DeptMapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=MybatisPlusTest.class)
@MapperScan("com.gao.mybatis.mapper")
@ComponentScan("com.gao.mybatis")
@EnableAutoConfiguration(/*exclude = {DataSourceAutoConfiguration.class}*/)
public class MybatisPlusTest {
    @Autowired
    private DeptMapper deptMapper;
    @Autowired
    private ApplicationContext ioc;

    @Test
    public void contextLoads() {
        System.out.println(".........contextLoads");
    }

    @Test
    public void dateSourceTest() throws SQLException {
        System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhh");

        DataSource ds  = ioc.getBean("multipleDataSource",DataSource.class);
        System.out.println(ds);
        Connection conn = ds.getConnection();
        System.out.println(conn);
    }

    @Test
    public void multiDateSourceTest() throws SQLException {
        DataSourceContextHolder.setDataSource("db1");
        List<Dept> employees = deptMapper.selectAll();
        System.out.println(com.alibaba.fastjson.JSONObject.toJSONString(employees));

//        DataSource ds  = ioc.getBean("multipleDataSource",DataSource.class);
//        System.out.println(ds);
//        Connection conn = ds.getConnection();
//        System.out.println(conn);
    }

}
