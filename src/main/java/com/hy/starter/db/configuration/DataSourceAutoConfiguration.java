//package com.hy.starter.db.configuration;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import com.hy.starter.db.properties.DataSourceProperties;
//import com.hy.starter.db.properties.WyxMybatisProperties;
//import org.apache.commons.lang3.StringUtils;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.annotation.Resource;
//import javax.sql.DataSource;
//import java.sql.SQLException;
//
///**
// * @author wyx
// */
////@Configuration
////@ConditionalOnClass({DataSourceProperties.class,WyxMybatisProperties.class})
////@EnableConfigurationProperties({DataSourceProperties.class,WyxMybatisProperties.class})
//public class DataSourceAutoConfiguration {
//
//    @Resource
//    private DataSourceProperties dataSourceProperties;
//    @Resource
//    private WyxMybatisProperties mybatisProperties;
//
//    @Bean
//    public DataSource dataSource() throws NullPointerException, SQLException {
//        String url = dataSourceProperties.getUrl();
//        if (StringUtils.isEmpty(url)) {
//            throw new NullPointerException("数据源地址为空");
//        }
//        DruidDataSource druidDataSource = new DruidDataSource();
//        druidDataSource.setDriverClassName(dataSourceProperties.getDriverClassName());
//        druidDataSource.setUrl(dataSourceProperties.getUrl());
//        druidDataSource.setUsername(dataSourceProperties.getUser());
//        druidDataSource.setPassword(dataSourceProperties.getPassWord());
//        druidDataSource.setFilters("stat");
//        druidDataSource.setMaxActive(20);
//        druidDataSource.setInitialSize(1);
//        druidDataSource.setMinIdle(1);
//        druidDataSource.setMaxWait(60000);
//        druidDataSource.setTimeBetweenConnectErrorMillis(300000);
//        druidDataSource.setTestWhileIdle(true);
//        druidDataSource.setTestOnBorrow(false);
//        druidDataSource.setTestOnReturn(false);
//        druidDataSource.setPoolPreparedStatements(true);
//        druidDataSource.setMaxOpenPreparedStatements(20);
//        return druidDataSource;
//    }
//
//    @Bean
//    public SqlSessionFactory getSqlSessionFactoryBean(DataSource dataSource) throws Exception {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource);
//        if (mybatisProperties.getMapperLocations() != null) {
//            sqlSessionFactoryBean.setMapperLocations(mybatisProperties.getMapperLocationResource());
//        }
//        return sqlSessionFactoryBean.getObject();
//    }
//
//    @Bean
//    public SqlSessionTemplate getSqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
//        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory);
//        return sqlSessionTemplate;
//    }
//}
