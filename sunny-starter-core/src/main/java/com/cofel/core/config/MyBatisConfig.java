package com.cofel.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

/**
 * MyBatis相关配置
 */
@Configuration
public class MyBatisConfig {

    /**
     * Mapper扫描配置，自动扫描将Mapper接口生成代理到Spring
     * @return
     */
    @Bean
    public static MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        // 不要扫描到自定义的mapper；  定义的路径不要扫描到tk.mybatis.mapper  如定义**.mapper
        // 两个做法都会导致扫描到tk.mybatis.mapper的Mapper，就会产生重复定义的报错。
        mapperScannerConfigurer.setBasePackage("**.cofel.**.mapper");
        return mapperScannerConfigurer;
    }


}
