package com.gao.mybatis.service.impl;

import com.gao.mybatis.entity.Dept;
import com.gao.mybatis.mapper.DeptMapper;
import com.gao.mybatis.service.DeptService;
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
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements DeptService {

}
