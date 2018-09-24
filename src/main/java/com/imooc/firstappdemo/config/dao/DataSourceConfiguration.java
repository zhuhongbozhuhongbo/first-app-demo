package com.imooc.firstappdemo.config.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;

/**
 * 连接数据库
 * @Configuration代表这是一个java配置文件，Spring的容器会根据它生成IoC容器去装配Bean
 */
@Configuration
@MapperScan("com.imooc.firstappdemo.config.dao")
public class DataSourceConfiguration {
    @Value("${jdbc.driver}")
    private String jdbcDriver;
    @Value("$jdbc.url")
    private String jdbcUrl;
    @Value("$jdbc.username")
    private String jdbcUserName;
    @Value("$jdbc.password")
    private String jdbcPassword;

    @Bean(name="dataSource")
    public ComboPooledDataSource createDataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(jdbcDriver);
        dataSource.setJdbcUrl(jdbcUrl);
        dataSource.setUser(jdbcUserName);
        dataSource.setPassword(jdbcPassword);
        //关闭连接后自动commit
        dataSource.setAutoCommitOnClose(false);
        return dataSource;
    }
}
