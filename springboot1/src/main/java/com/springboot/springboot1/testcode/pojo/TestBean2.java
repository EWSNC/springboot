package com.springboot.springboot1.testcode.pojo;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "testbean2")
public class TestBean2 {

    private String ff1;

    public String getFf1() {
        return ff1;
    }

    public void setFf1(String ff1) {
        this.ff1 = ff1;
    }

    @Override
    public String toString() {
        return "TestBean2{" +
                "ff1='" + ff1 + '\'' +
                '}';
    }
}
