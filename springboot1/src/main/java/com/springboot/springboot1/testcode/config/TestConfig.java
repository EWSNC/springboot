package com.springboot.springboot1.testcode.config;

import com.springboot.springboot1.testcode.pojo.TestBean;
import com.springboot.springboot1.testcode.pojo.TestBean2;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @ConditionalOnBean(name = "bean2")
    @Bean("bean1name")
    public TestBean bean1(){
        return new TestBean();
    }


    @Bean
    public TestBean2 bean2(){
        return new TestBean2();
    }

}
