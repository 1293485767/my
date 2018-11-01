package com.gao.mybatis;

import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSONObject;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@MapperScan("com.gao.mybaits.mapper")
//@ImportResource(locations={"classpath:applicationContext.xml"})
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class Demo1Application {
    private final static Logger logger = LoggerFactory.getLogger(Demo1Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

    @RequestMapping
    public JSONObject test(HttpServletRequest req, String name) {
        MDC.put("req.remoteHost", getIpAddr(req));
        MDC.put("req.queryString", JSONObject.toJSONString(req.getParameterMap()));
        MDC.put("req.requestURL", req.getRequestURL().toString());
        logger.info("。。。。。。。。。qignqiu" + req.getRemoteAddr());
        logger.info("。。。。。。。。。qignqiudsfdf");
        logger.info("。。。。。。。。。qignqiudfdf");
        return new JSONObject();


    }


    public String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
}
