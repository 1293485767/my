package com.gao.mybatis.service.impl;

import com.gao.mybatis.entity.Employee;
import com.gao.mybatis.mapper.EmployeeMapper;
import com.gao.mybatis.service.EmployeeService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Bean
 * @since 2018-11-01
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
