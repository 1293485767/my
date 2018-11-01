package com.gao.mybatis.datasource;

import com.gao.mybatis.enums.DataSourceEnum;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class DataSourceContextHolder {

    private static final ThreadLocal<String> contextHolder = new InheritableThreadLocal<>();
    private static AtomicBoolean flag = new AtomicBoolean(false);

    /**
     *  设置数据源
     * @param db
     */
    public static void setDataSource(String db){
        contextHolder.set(db);
    }

    /**
     * 取得当前数据源
     * @return
     */
    public static String getDataSource(){
       if(flag.compareAndSet(false,true)){
           return DataSourceEnum.DB1.getValue();

       }
        return contextHolder.get();
    }

    /**
     * 清除上下文数据
     */
    public static void clear(){
        contextHolder.remove();
    }
}
