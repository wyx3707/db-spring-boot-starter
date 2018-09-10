package com.hy.starter.db.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * spring 整合mybatis 的自动配置类
 *
 * @author wyx
 * 功能：加载mybatis配置文件
 */
@Configuration
@ImportResource(locations = "classpath:/mybatisContext.xml")
public class BasicDataAutoConfiguration {
    //这是个测试用例
    //aaa
}
