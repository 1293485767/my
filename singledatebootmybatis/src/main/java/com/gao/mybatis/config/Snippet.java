package com.gao.mybatis.config;

import javax.sql.DataSource;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.baomidou.mybatisplus.MybatisConfiguration;
import com.baomidou.mybatisplus.entity.GlobalConfiguration;
import com.baomidou.mybatisplus.mapper.LogicSqlInjector;
import com.baomidou.mybatisplus.spring.MybatisSqlSessionFactoryBean;

@Configuration
@MapperScan("com.gao.mybatis.mapper*")
public class Snippet {
	
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		MybatisSqlSessionFactoryBean sqlSessionFactory = new MybatisSqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(db1());
        sqlSessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:com/gao/mybatis/mapper/*/*Mapper.xml"));

        MybatisConfiguration configuration = new MybatisConfiguration();
        //configuration.setDefaultScriptingLanguage(MybatisXMLLanguageDriver.class);
        configuration.setJdbcTypeForNull(JdbcType.NULL);
        configuration.setMapUnderscoreToCamelCase(true);
        configuration.setCacheEnabled(false);
        sqlSessionFactory.setConfiguration(configuration);
        sqlSessionFactory.setTypeAliasesPackage("com.gao.mybatis.entity");
        sqlSessionFactory.setPlugins(new Interceptor[]{ //PerformanceInterceptor(),OptimisticLockerInterceptor()
//                paginationInterceptor() //添加分页功能
        });
        sqlSessionFactory.setGlobalConfig(globalConfiguration());
        return sqlSessionFactory.getObject();
	}
	
	 @Bean("dataSource")
	    @ConfigurationProperties(prefix = "spring.datasource.druid.db1" )
	    public DataSource db1() {
	        return DruidDataSourceBuilder.create().build();
	    }
	 
	 @Bean
	    public GlobalConfiguration globalConfiguration() {
	        GlobalConfiguration conf = new GlobalConfiguration(new LogicSqlInjector());
	        conf.setLogicDeleteValue("-1");
	        conf.setLogicNotDeleteValue("1");
	        conf.setIdType(0);
	        //conf.setTablePrefix("tbl_");
	        //conf.setMetaObjectHandler(new MyMetaObjectHandler());
	        conf.setDbColumnUnderline(true);
	        conf.setRefresh(true);
	        return conf;
	    }
}

